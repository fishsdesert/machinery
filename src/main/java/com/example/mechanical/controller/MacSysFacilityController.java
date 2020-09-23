package com.example.mechanical.controller;

import com.example.mechanical.entity.MacSysFacility;
import com.example.mechanical.service.MacSysFacilityService;
import com.example.mechanical.tool.ReturnParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/17 17:09
 */
@Controller
@RequestMapping("/facility")
public class MacSysFacilityController {

    @Autowired
    public MacSysFacilityService macSysFacilityService;

    /**
     * 查询设备信息
     * @param macSysFacility
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectFacility")
    public ReturnParameter selectFacility(MacSysFacility macSysFacility){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
           List<MacSysFacility> facilititys =  macSysFacilityService.selectListFacility(macSysFacility);
            returnParameter.setData(facilititys);
            returnParameter.setCount(facilititys.size());
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
