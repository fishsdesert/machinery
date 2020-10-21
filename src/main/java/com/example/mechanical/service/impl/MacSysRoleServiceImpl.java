package com.example.mechanical.service.impl;

import com.example.mechanical.entity.MacSysRecold;
import com.example.mechanical.entity.MacSysRole;
import com.example.mechanical.mapper.MacSysRoleMapper;
import com.example.mechanical.service.MacSysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/17 16:56
 */
@Service
public class MacSysRoleServiceImpl implements MacSysRoleService {
    @Autowired
    public MacSysRoleMapper macSysRoleMapper;
    @Override
    public List<MacSysRole> selectrole(MacSysRole macSysRole) {
        return macSysRoleMapper.selectrole(macSysRole);
    }

    @Override
    public List<MacSysRole> querctrole() {
        return macSysRoleMapper.querctrole();
    }
}
