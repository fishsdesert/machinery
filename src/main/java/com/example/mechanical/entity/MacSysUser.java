package com.example.mechanical.entity;

import lombok.Data;

/**
 * @author HaoBaiKui
 * @date 2020/9/14 17:44
 */
@Data
public class MacSysUser {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户账号
     */
    private String accid;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 所属部门
     */
    private String deptname;

    /**
     * 所属部门ID
     */
    private String deptid;

    /**
     * 角色类型
     */
    private String roletype;

    /**
     * 预留字段
     */
    private String uresb;
}