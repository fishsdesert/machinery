package com.example.mechanical.controller;

import com.example.mechanical.entity.MacSysFacility;
import com.example.mechanical.service.MacSysFacilityService;
import com.example.mechanical.tool.ReturnParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ReturnParameter selectFacility(@RequestBody MacSysFacility macSysFacility){
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

    /**
     * 删除设备信息
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/deletefacility")
    public ReturnParameter deleteFacility(String id){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            String[] ids = id.split(",");
            int param = 0;
            for(int i = 0; i<ids.length;i++){
                Integer did = Integer.parseInt(ids[i]);
                param = macSysFacilityService.deleteFacility(did);
            }
            returnParameter.setCount(param);
            returnParameter.setCode(0);
            returnParameter.setMsg("删除成功！");
            return returnParameter;
        }catch (Exception e){
            returnParameter.setCode(500);
            returnParameter.setCount(0);
            returnParameter.setMsg("删除失败！");
            return returnParameter;
        }
    }

    /**
     * 修改设备信息
     * @param macSysFacility
     * @return
     */
    @ResponseBody
    @RequestMapping("/updatefacility")
    public ReturnParameter updateFacility(@RequestBody MacSysFacility macSysFacility){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            int facilititys =  macSysFacilityService.updateFacility(macSysFacility);
            returnParameter.setCount(facilititys);
            returnParameter.setCode(0);
            returnParameter.setMsg("修改成功！");
            return returnParameter;
        }catch (Exception e){
            returnParameter.setCode(500);
            returnParameter.setCount(0);
            returnParameter.setMsg("修改失败！");
            return returnParameter;
        }
    }

    /**
     * 新增设备信息
     * @param macSysFacility
     * @return
     */
    @ResponseBody
    @RequestMapping("/insertfacility")
    public ReturnParameter insertFacility(@RequestBody MacSysFacility macSysFacility){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            int facilititys =  macSysFacilityService.insertFacility(macSysFacility);
            returnParameter.setCount(facilititys);
            returnParameter.setCode(0);
            returnParameter.setMsg("新增成功！");
            return returnParameter;
        }catch (Exception e){
            returnParameter.setCode(500);
            returnParameter.setCount(0);
            returnParameter.setMsg("新增失败，系统出现异常");
            return returnParameter;
        }
    }

}
