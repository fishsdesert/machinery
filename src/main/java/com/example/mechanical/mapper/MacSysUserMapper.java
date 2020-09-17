package com.example.mechanical.mapper;

import com.example.mechanical.entity.MacSysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/14 17:44
 */
@Mapper
public interface MacSysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MacSysUser record);

    int insertSelective(MacSysUser record);

    MacSysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MacSysUser record);

    int updateByPrimaryKey(MacSysUser record);

    List<MacSysUser> querMacSysUser(@Param("macSysUser") MacSysUser macSysUser);

}