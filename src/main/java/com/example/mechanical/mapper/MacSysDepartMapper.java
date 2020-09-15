package com.example.mechanical.mapper;

import com.example.mechanical.entity.MacSysDepart;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
public interface MacSysDepartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MacSysDepart record);

    int insertSelective(MacSysDepart record);

    MacSysDepart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MacSysDepart record);

    int updateByPrimaryKey(MacSysDepart record);
}