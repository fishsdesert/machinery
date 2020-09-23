package com.example.mechanical.service;

import com.example.mechanical.entity.MacSysRecold;
import com.example.mechanical.entity.MacSysRole;
import com.example.mechanical.entity.MacSysUser;
import com.example.mechanical.tool.ReturnParameter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/11 9:37
 */

@Service
public interface MacSysUserService {

    /**
     * 新增用户
     * @param macSysUser
     */
    int insertUser(MacSysUser macSysUser) ;

    /**
     * 查询用户表
     * @return
     */
    List<MacSysUser> QuerMacSysUser(MacSysUser macSysUser);

    /**
     * 删除用户
     * @param id
     * @return
     */
    Integer deleteUser(Integer id);

    /**
     * 修改用户
     * @param macSysUser
     * @return
     */
    int updateUser(MacSysUser macSysUser);

}
