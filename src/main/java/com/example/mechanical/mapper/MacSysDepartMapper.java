package com.example.mechanical.mapper;

import com.example.mechanical.entity.MacSysDepart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
@Mapper
public interface MacSysDepartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MacSysDepart record);

    int insertSelective(MacSysDepart record);

    MacSysDepart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MacSysDepart record);

    int updateByPrimaryKey(MacSysDepart record);

    List<MacSysDepart> querMacSysDepart(@Param("macSysDepart") MacSysDepart macSysDepart);
}