package com.example.mechanical.controller;

import com.example.mechanical.entity.MacSysUser;
import com.example.mechanical.service.MacSysUserService;
import com.example.mechanical.tool.MyMD5Util;
import com.example.mechanical.tool.ReturnParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
                returnParameter.setParams(macSysUsers);
                returnParameter.setState(200);
                returnParameter.setExplain("登录成功！");
                return returnParameter;
            } else {
                returnParameter.setParams(macSysUsers);
                returnParameter.setState(201);
                returnParameter.setExplain("您输入的用户名或密码输入有误");
                return returnParameter;
            }
        }catch (Exception e){
            e.printStackTrace();
            returnParameter.setState(500);
            returnParameter.setExplain("系统有误");
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
            returnParameter.setState(200);
            returnParameter.setExplain(explain);
            return returnParameter;
        }catch (Exception e){
            e.printStackTrace();
            returnParameter.setState(500);
            returnParameter.setExplain("添加失败");
            return returnParameter;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/deleteuser",method = RequestMethod.POST)
    public ReturnParameter deleteUser(@RequestParam("id") Integer id){
        ReturnParameter returnParameter = new ReturnParameter();
        String explain;
        try {
            int param = macSysUserService.deleteUser(id);
            explain = param == 1 ? "删除成功！":"删除失败！";
            returnParameter.setState(200);
            returnParameter.setExplain(explain);
            return returnParameter;
        }catch (Exception e){
            e.printStackTrace();
            returnParameter.setState(500);
            returnParameter.setExplain("删除失败");
            return returnParameter;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/updateuser",method = RequestMethod.POST)
    public ReturnParameter updateUser(@RequestParam("returnParameter") MacSysUser macSysUser){
        ReturnParameter returnParameter = new ReturnParameter();
        String explain;
        try {
            int param = macSysUserService.updateUser(macSysUser);
            explain = param < 0 ? "修改成功！":"修改失败！";
            returnParameter.setState(200);
            returnParameter.setExplain(explain);
            return returnParameter;
        }catch (Exception e){
            e.printStackTrace();
            returnParameter.setState(500);
            returnParameter.setExplain("修改失败");
            return returnParameter;
        }
    }


    @RequestMapping(value = "/logins",method = RequestMethod.GET)
    public String login(){
        return "login.html";
    }
    @RequestMapping(value = "/loginss",method = RequestMethod.GET)
    public String loginss(){
        return "index.html";
    }

}
