package com.example.mechanical.mapper;

import com.example.mechanical.entity.MacSysDeptNode;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
public interface MacSysDeptNodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MacSysDeptNode record);

    int insertSelective(MacSysDeptNode record);

    MacSysDeptNode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MacSysDeptNode record);

    int updateByPrimaryKey(MacSysDeptNode record);
}