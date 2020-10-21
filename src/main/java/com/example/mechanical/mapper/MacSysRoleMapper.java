package com.example.mechanical.mapper;

import com.example.mechanical.entity.MacSysRecold;
import com.example.mechanical.entity.MacSysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
@Mapper
public interface MacSysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MacSysRole record);

    int insertSelective(MacSysRole record);

    MacSysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MacSysRole record);

    int updateByPrimaryKey(MacSysRole record);

    List<MacSysRole> selectrole(@Param("macSysRole") MacSysRole macSysRole);

    List<MacSysRole> querctrole();
}