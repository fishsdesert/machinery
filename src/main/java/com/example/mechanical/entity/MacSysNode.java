package com.example.mechanical.entity;

import lombok.Data;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
@Data
public class MacSysNode {
    /**
    * 主键ID
    */
    private Integer id;

    /**
    * 节点ID
    */
    private String nodeid;

    /**
    * 节点名称
    */
    private String nodename;
}