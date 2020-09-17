package com.example.mechanical.controller;

import com.example.mechanical.service.MacSysRecoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HaoBaiKui
 * @date 2020/9/17 17:02
 */
@Controller
@RequestMapping("/recold")
public class MacSysRecoldController {

    @Autowired
    public MacSysRecoldService macSysRecoldService;
}
