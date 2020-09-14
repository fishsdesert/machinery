package com.example.mechanical.service;

import com.example.mechanical.entity.MacSysUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/11 9:37
 */

@Service
public interface MacSysUserService {

    /**
     * 查询用户表
     * @return
     */
    List<MacSysUser> QuerMacSysUser();

}
