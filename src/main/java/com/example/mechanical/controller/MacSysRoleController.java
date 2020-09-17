package com.example.mechanical.controller;

import com.example.mechanical.service.MacSysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HaoBaiKui
 * @date 2020/9/17 16:53
 */
@Controller
@RequestMapping("/role")
public class MacSysRoleController {
    @Autowired
    public MacSysUserService macSysUserService;
}
