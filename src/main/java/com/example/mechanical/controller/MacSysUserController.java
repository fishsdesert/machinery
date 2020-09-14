package com.example.mechanical.controller;

import com.example.mechanical.entity.MacSysUser;
import com.example.mechanical.service.MacSysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/11 9:36
 */

@Controller
@RequestMapping("/user")
public class MacSysUserController {

    @Autowired(required=true)
    public MacSysUserService macSysUserService;

    @ResponseBody
    @RequestMapping("/login")
    public List<MacSysUser> QuerMacSysUser(){
        return macSysUserService.QuerMacSysUser();
    }
}
