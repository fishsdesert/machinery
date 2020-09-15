package com.example.mechanical.entity;

import lombok.Data;

/**
 * @author HaoBaiKui
 * @date 2020/9/15 9:51
 */
@Data
public class MacSysDepart {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 部门ID
     */
    private String deptid;

    /**
     * 部门名称
     */
    private String deptname;

    /**
     * 部门类型
     */
    private String depttype;

    /**
     * 所属角色ID
     */
    private String roleid;

    /**
     * 所属角色名称
     */
    private String rolename;

    /**
     * 预留字段B
     */
    private String dresb;
}