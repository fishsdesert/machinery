package com.example.mechanical.entity;

import java.util.Date;
import lombok.Data;

/**
 * @author  HaoBaiKui
 * @date  2020/9/15 9:51
 */
@Data
public class MacSysRecold {
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
    * 设备状态
    */
    private String facstatus;

    /**
    * 状态预测
    */
    private String statusfore;

    /**
    * 维修人
    */
    private String wxperson;

    /**
    * 维修时间
    */
    private Date wxdata;

    /**
    * 维修记录
    */
    private String wxrecord;

    /**
    * 报修人
    */
    private String bxperson;

    /**
    * 报修时间
    */
    private Date bxdata;
}