package com.example.mechanical.controller;

import com.example.mechanical.entity.MacSysRecold;
import com.example.mechanical.entity.MacSysRole;
import com.example.mechanical.entity.MacSysUser;
import com.example.mechanical.service.MacSysRoleService;
import com.example.mechanical.service.MacSysUserService;
import com.example.mechanical.tool.ReturnParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/17 16:53
 */
@Controller
@RequestMapping("/role")
public class MacSysRoleController {
    @Autowired
    public MacSysRoleService macSysRoleService;

    @Autowired
    public MacSysUserService macSysUserService;

    /**
     * 查询所有角色
     * @param macSysUser
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectrole")
    public ReturnParameter selectrole(@RequestBody MacSysUser macSysUser){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            List<MacSysUser> users =  macSysUserService.QuerMacSysUser(macSysUser);
            returnParameter.setData(users);
            returnParameter.setCount(users.size());
            returnParameter.setCode(0);
            returnParameter.setMsg("查询成功！");
            return returnParameter;
        }catch (Exception e){
            returnParameter.setCode(500);
            returnParameter.setCount(0);
            returnParameter.setMsg("查询失败！");
            return returnParameter;
        }
    }

    /**
     * 查询所有角色
     * @param macSysRole
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectroles")
    public ReturnParameter selectroles(@RequestBody MacSysRole macSysRole){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            List<MacSysRole> roles =  macSysRoleService.selectrole(macSysRole);
            returnParameter.setData(roles);
            returnParameter.setCount(roles.size());
            returnParameter.setCode(0);
            returnParameter.setMsg("查询成功！");
            return returnParameter;
        }catch (Exception e){
            returnParameter.setCode(500);
            returnParameter.setCount(0);
            returnParameter.setMsg("查询失败！");
            return returnParameter;
        }
    }


    @ResponseBody
    @RequestMapping("/querctrole")
    public ReturnParameter querctrole(){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            List<MacSysRole> roles =  macSysRoleService.querctrole();
            returnParameter.setData(roles);
            returnParameter.setCount(roles.size());
            returnParameter.setCode(0);
            returnParameter.setMsg("查询成功！");
            return returnParameter;
        }catch (Exception e){
            returnParameter.setCode(500);
            returnParameter.setCount(0);
            returnParameter.setMsg("查询失败！");
            return returnParameter;
        }
    }

}
