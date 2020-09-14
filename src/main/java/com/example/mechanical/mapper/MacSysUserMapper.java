package com.example.mechanical.mapper;

import com.example.mechanical.entity.MacSysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/11 9:36
 */

@Mapper
public interface MacSysUserMapper {

    List<MacSysUser> querMacSysUser(@Param("macSysUser") MacSysUser macSysUser);

}
