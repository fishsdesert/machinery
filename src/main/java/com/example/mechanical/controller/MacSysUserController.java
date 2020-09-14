package com.example.mechanical.controller;

import com.example.mechanical.entity.MacSysUser;
import com.example.mechanical.service.MacSysUserService;
import com.example.mechanical.tool.MyMD5Util;
import com.example.mechanical.tool.ReturnParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ReturnParameter QuerMacSysUser(@RequestParam("userName") String userName,@RequestParam("passWord") String passWord){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            MacSysUser macSysUser = new MacSysUser();
            String md5PassWord  = MyMD5Util.MD5(passWord);
            macSysUser.setPassWord(md5PassWord);
            //macSysUser.setPassWord(passWord);
            macSysUser.setUserName(userName);
            List<MacSysUser> macSysUsers = macSysUserService.QuerMacSysUser(macSysUser);
            if (macSysUsers.size() == 1) {
                returnParameter.setParams(macSysUsers);
                returnParameter.setState(200);
                returnParameter.setExplain("登录成功！");
                return returnParameter;
            } else {
                returnParameter.setParams(macSysUsers);
                returnParameter.setState(200);
                returnParameter.setExplain("您输入的用户名或密码输入有误");
                return returnParameter;
            }
        }catch (Exception e){
            e.printStackTrace();
            returnParameter.setState(200);
            returnParameter.setExplain("系统有误");
            return returnParameter;
        }
    }
}
