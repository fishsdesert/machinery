package com.example.mechanical.controller;

import com.example.mechanical.entity.MacSysFacility;
import com.example.mechanical.entity.MacSysRecold;
import com.example.mechanical.service.MacSysRecoldService;
import com.example.mechanical.tool.ReturnParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/17 17:02
 */
@Controller
@RequestMapping("/recold")
public class MacSysRecoldController {

    @Autowired
    public MacSysRecoldService macSysRecoldService;

    /**
     * 查询设备维修
     * @param macSysRecold
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectrecold")
    public ReturnParameter selectrecold(MacSysRecold macSysRecold){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            List<MacSysRecold> recolds =  macSysRecoldService.selectrecold(macSysRecold);
            returnParameter.setData(recolds);
            returnParameter.setCount(recolds.size());
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
