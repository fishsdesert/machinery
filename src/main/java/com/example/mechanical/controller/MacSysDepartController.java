package com.example.mechanical.controller;

import com.example.mechanical.entity.MacSysDepart;
import com.example.mechanical.entity.MacSysUser;
import com.example.mechanical.service.MacSysDepartService;
import com.example.mechanical.service.MacSysUserService;
import com.example.mechanical.tool.ReturnParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/14 16:43
 */
@Controller
@RequestMapping("/depart")
public class MacSysDepartController {
    @Autowired
    public MacSysDepartService macSysDepartService;

    @ResponseBody
    @RequestMapping(value = "/querDepart",method = RequestMethod.POST)
    public ReturnParameter querDepart(@RequestBody MacSysDepart macSysDepart){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            List<MacSysDepart> departs =  macSysDepartService.querMacSysDepart(macSysDepart);
            returnParameter.setData(departs);
            returnParameter.setCount(departs.size());
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
