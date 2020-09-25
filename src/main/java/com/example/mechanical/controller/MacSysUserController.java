package com.example.mechanical.controller;

import com.example.mechanical.entity.MacSysUser;
import com.example.mechanical.service.MacSysUserService;
import com.example.mechanical.tool.MyMD5Util;
import com.example.mechanical.tool.ReturnParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/11 9:36
 */

@Controller
@RequestMapping("/user")
public class MacSysUserController {

    @Autowired
    public MacSysUserService macSysUserService;

    /**
     * 登录
     * @param userName
     * @param passWord
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ReturnParameter QuerMacSysUser(@RequestParam("userName") String userName,@RequestParam("passWord") String passWord){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            MacSysUser macSysUser = new MacSysUser();
            String md5PassWord  = MyMD5Util.MD5(passWord);
            macSysUser.setPassword(md5PassWord);
            //macSysUser.setPassWord(passWord);
            macSysUser.setAccid(userName);
            List<MacSysUser> macSysUsers = macSysUserService.QuerMacSysUser(macSysUser);
            if (macSysUsers.size() == 1) {
                returnParameter.setData(macSysUsers);
                returnParameter.setCode(0);
                returnParameter.setCount(macSysUsers.size());
                returnParameter.setMsg("登录成功！");
                return returnParameter;
            } else {
                returnParameter.setData(macSysUsers);
                returnParameter.setCode(201);
                returnParameter.setCount(0);
                returnParameter.setMsg("您输入的用户名或密码输入有误");
                return returnParameter;
            }
        }catch (Exception e){
            e.printStackTrace();
            returnParameter.setCode(500);
            returnParameter.setCount(0);
            returnParameter.setMsg("系统有误");
            return returnParameter;
        }
    }

    /**
     * 新增用户
     * @param macSysUser
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insertuser",method = RequestMethod.POST)
    public ReturnParameter insertUser(@RequestParam("macSysUser") MacSysUser macSysUser){
        ReturnParameter returnParameter = new ReturnParameter();
        String explain;
        try {
            int num = macSysUserService.insertUser(macSysUser);
            explain = num == 1 ? "添加成功！":"添加失败！";
            returnParameter.setCode(0);
            returnParameter.setCount(num);
            returnParameter.setMsg(explain);
            return returnParameter;
        }catch (Exception e){
            e.printStackTrace();
            returnParameter.setCode(500);
            returnParameter.setCount(0);
            returnParameter.setMsg("添加失败");
            return returnParameter;
        }
    }

    /**
     * 删除用户表
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteuser",method = RequestMethod.POST)
    public ReturnParameter deleteUser(@RequestParam("id") Integer id){
        ReturnParameter returnParameter = new ReturnParameter();
        String explain;
        try {
            int param = macSysUserService.deleteUser(id);
            explain = param == 1 ? "删除成功！":"删除失败！";
            returnParameter.setCode(0);
            returnParameter.setCount(param);
            returnParameter.setMsg(explain);
            return returnParameter;
        }catch (Exception e){
            e.printStackTrace();
            returnParameter.setCount(0);
            returnParameter.setCode(500);
            returnParameter.setMsg("删除失败");
            return returnParameter;
        }
    }

    /**
     * 修改用户
     * @param macSysUser
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateuser",method = RequestMethod.POST)
    public ReturnParameter updateUser(@RequestParam("returnParameter") MacSysUser macSysUser){
        ReturnParameter returnParameter = new ReturnParameter();
        String explain;
        try {
            int param = macSysUserService.updateUser(macSysUser);
            explain = param < 0 ? "修改成功！":"修改失败！";
            returnParameter.setCode(0);
            returnParameter.setCount(param);
            returnParameter.setMsg(explain);
            return returnParameter;
        }catch (Exception e){
            e.printStackTrace();
            returnParameter.setCode(500);
            returnParameter.setCount(0);
            returnParameter.setMsg("修改失败");
            return returnParameter;
        }
    }


    @RequestMapping(value = "/logins",method = RequestMethod.GET)
    public String login(){
        return "./page/login-3.html";
    }
    @RequestMapping(value = "/loginss",method = RequestMethod.GET)
    public String loginss(){
        return "index.html";
    }

}
