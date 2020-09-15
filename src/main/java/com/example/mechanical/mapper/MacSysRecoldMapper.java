package com.example.mechanical.mapper;

import com.example.mechanical.entity.MacSysRecold;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
public interface MacSysRecoldMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MacSysRecold record);

    int insertSelective(MacSysRecold record);

    MacSysRecold selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MacSysRecold record);

    int updateByPrimaryKey(MacSysRecold record);
}