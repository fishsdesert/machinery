package com.example.mechanical.entity;

import lombok.Data;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
@Data
public class MacSysRole {
    /**
    * 主键ID
    */
    private Integer id;

    /**
    * 角色ID
    */
    private String roleid;

    /**
    * 角色名称
    */
    private String rolename;
}