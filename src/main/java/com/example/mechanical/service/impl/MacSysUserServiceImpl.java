package com.example.mechanical.service.impl;

import com.example.mechanical.entity.MacSysRecold;
import com.example.mechanical.entity.MacSysRole;
import com.example.mechanical.entity.MacSysUser;
import com.example.mechanical.mapper.MacSysUserMapper;
import com.example.mechanical.service.MacSysUserService;
import com.example.mechanical.tool.ReturnParameter;
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

    /**
     * 新增用户
     * @param macSysUser
     */
    @Override
    public int insertUser(MacSysUser macSysUser) {
        return macSysUserMapper.insert(macSysUser);
    }

    /**
     * 登录
     * @param macSysUser
     * @return
     */
    @Override
    public List<MacSysUser> QuerMacSysUser(MacSysUser macSysUser) {
        return macSysUserMapper.querMacSysUser(macSysUser);
    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @Override
    public Integer deleteUser(Integer id) {
        return macSysUserMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改用户
     * @param macSysUser
     * @return
     */
    @Override
    public int updateUser(MacSysUser macSysUser) {
        return macSysUserMapper.updateByPrimaryKeySelective(macSysUser);
    }

}
