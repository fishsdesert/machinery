package com.example.mechanical.entity;

import java.util.Date;
import lombok.Data;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
@Data
public class MacSysFacility {
    /**
    * 主键ID
    */
    private Integer id;

    /**
    * 设备编码
    */
    private String faccode;

    /**
    * 设备名称
    */
    private String facname;

    /**
    * 设备型号
    */
    private String facmodel;

    /**
    * 规格属性
    */
    private String spectype;

    /**
    * 所在楼层
    */
    private String locfloor;

    /**
    * 所在分区
    */
    private String locsubarea;

    /**
    * 安装日期
    */
    private Date installdata;

    /**
    * 使用日期
    */
    private Date usedata;

    /**
    * 预留字段A
    */
    private String fresa;

    /**
    * 预留字段B
    */
    private String fresb;
}