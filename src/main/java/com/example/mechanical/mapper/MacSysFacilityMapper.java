package com.example.mechanical.mapper;

import com.example.mechanical.entity.MacSysFacility;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
@Mapper
public interface MacSysFacilityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MacSysFacility record);

    int insertSelective(MacSysFacility record);

    MacSysFacility selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MacSysFacility record);

    int updateByPrimaryKey(MacSysFacility record);

    List<MacSysFacility> selectListFacility(@Param("macSysFacility") MacSysFacility macSysFacility);
}