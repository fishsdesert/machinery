package com.example.mechanical.controller;

import com.example.mechanical.entity.MacSysDepart;
import com.example.mechanical.service.MacSysUserService;
import com.example.mechanical.tool.ReturnParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HaoBaiKui
 * @date 2020/9/14 16:43
 */
@Controller
@RequestMapping("/depart")
public class MacSysDepartController {
    @Autowired
    public MacSysUserService macSysUserService;

    @ResponseBody
    @RequestMapping("/querdepart")
    public ReturnParameter querDepart(MacSysDepart macSysDepart){
        try {
            return null;
        }catch (Exception e){
            return null;
        }
    }

}
