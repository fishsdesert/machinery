package com.example.mechanical.mapper;

import com.example.mechanical.entity.MacSysNode;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
public interface MacSysNodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MacSysNode record);

    int insertSelective(MacSysNode record);

    MacSysNode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MacSysNode record);

    int updateByPrimaryKey(MacSysNode record);
}