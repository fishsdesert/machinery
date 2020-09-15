package com.example.mechanical.entity;

import lombok.Data;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
@Data
public class MacSysDeptNode {
    /**
    * 主键ID
    */
    private Integer id;

    /**
    * 部门ID
    */
    private String deptid;

    /**
    * 节点ID
    */
    private String nodeid;
}