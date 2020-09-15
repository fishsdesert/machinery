package com.example.mechanical.mapper;

import com.example.mechanical.entity.MacSysFacility;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
public interface MacSysFacilityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MacSysFacility record);

    int insertSelective(MacSysFacility record);

    MacSysFacility selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MacSysFacility record);

    int updateByPrimaryKey(MacSysFacility record);
}