package com.example.mechanical.service.impl;

import com.example.mechanical.entity.MacSysUser;
import com.example.mechanical.mapper.MacSysUserMapper;
import com.example.mechanical.service.MacSysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/11 9:41
 */
@Service
public class MacSysUserServiceImpl implements MacSysUserService {

    @Autowired
    public MacSysUserMapper macSysUserMapper;

    @Override
    public List<MacSysUser> QuerMacSysUser(MacSysUser macSysUser) {
        return macSysUserMapper.querMacSysUser(macSysUser);
    }
}
