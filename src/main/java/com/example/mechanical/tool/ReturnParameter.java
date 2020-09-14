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
     * 主要的参数类型
     */
    List params;
    /**
     * 状态
     */
    Integer  state;
    /**
     * 说明
     */
    String explain;
}
