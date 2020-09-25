package com.example.mechanical.controller;

import com.example.mechanical.entity.MacSysDepart;
import com.example.mechanical.service.MacSysDepartService;
import com.example.mechanical.tool.ReturnParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/14 16:43
 */
@Controller
@RequestMapping("/depart")
public class MacSysDepartController {
    @Autowired
    public MacSysDepartService macSysDepartService;

    /**
     * 查询部门表
     * @param macSysDepart
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/querdepart")
    public ReturnParameter querDepart(@RequestBody MacSysDepart macSysDepart){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            List<MacSysDepart> departs =  macSysDepartService.querMacSysDepart(macSysDepart);
            returnParameter.setData(departs);
            returnParameter.setCount(departs.size());
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
     * 根据id删除部门表
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deteledepart")
    public ReturnParameter deteleDepart(@RequestParam("id") Integer id){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            int departs =  macSysDepartService.deteleDepart(id);
            returnParameter.setCount(departs);
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
     * 新增部门表
     * @param macSysDepart
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/intsertdepart")
    public ReturnParameter intsertDepart(@RequestBody MacSysDepart macSysDepart){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            int departs =  macSysDepartService.intsertDepart(macSysDepart);
            returnParameter.setCount(departs);
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
     * 修改部门表
     * @param macSysDepart
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updatedepart")
    public ReturnParameter updateDepart(@RequestBody MacSysDepart macSysDepart){
        ReturnParameter returnParameter =  new ReturnParameter();
        try {
            int departs =  macSysDepartService.updateDepart(macSysDepart);
            returnParameter.setCount(departs);
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
