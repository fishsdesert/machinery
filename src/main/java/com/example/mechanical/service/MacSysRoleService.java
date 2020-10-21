package com.example.mechanical.service;

import com.example.mechanical.entity.MacSysRecold;
import com.example.mechanical.entity.MacSysRole;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/17 16:55
 */
public interface MacSysRoleService {
    List<MacSysRole> selectrole(MacSysRole macSysRole);

    List<MacSysRole> querctrole();
}
