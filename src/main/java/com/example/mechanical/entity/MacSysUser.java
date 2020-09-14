package com.example.mechanical.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author HaoBaiKui
 * @date 2020/9/10 11:15
 */
@Data
public class MacSysUser implements Serializable {
    private Integer id;
    private String accid;
    private String passWord;
    private String userName;
    private String deptName;
    private String deptId;
    private String roleType;
    private String uresb;
}
