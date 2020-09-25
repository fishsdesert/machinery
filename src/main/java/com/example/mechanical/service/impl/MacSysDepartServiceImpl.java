package com.example.mechanical.service.impl;

import com.example.mechanical.entity.MacSysDepart;
import com.example.mechanical.entity.MacSysUser;
import com.example.mechanical.mapper.MacSysDepartMapper;
import com.example.mechanical.service.MacSysDepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/14 16:43
 */

@Service
public class MacSysDepartServiceImpl implements MacSysDepartService {
    @Autowired
    public MacSysDepartMapper macSysDepartMapper;

    @Override
    public List<MacSysDepart> querMacSysDepart(MacSysDepart macSysDepart) {
        return macSysDepartMapper.querMacSysDepart(macSysDepart);
    }
}
