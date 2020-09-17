package com.example.mechanical.controller;

import com.example.mechanical.service.MacSysFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HaoBaiKui
 * @date 2020/9/17 17:09
 */
@Controller
@RequestMapping("/facility")
public class MacSysFacilityController {

    @Autowired
    public MacSysFacilityService macSysFacilityService;
}
