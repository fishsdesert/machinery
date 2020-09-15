package com.example.mechanical.mapper;

import com.example.mechanical.entity.MacSysRole;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
public interface MacSysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MacSysRole record);

    int insertSelective(MacSysRole record);

    MacSysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MacSysRole record);

    int updateByPrimaryKey(MacSysRole record);
}