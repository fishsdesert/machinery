package com.example.mechanical.tool;

import lombok.Data;
import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/14 15:23
 * 返回给前端的参数实体类
 */
@Data
public class ReturnParameter {

    /**
     * 状态
     */
    Integer code;
    /**
     * 说明
     */
    String msg;
    /**
     * 总数
     */
    Integer count;
    /**
     * 主要的参数类型
     */
    List data;

}
