package com.example.mechanical.service;

import com.example.mechanical.entity.MacSysDepart;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/14 16:42
 */
public interface MacSysDepartService {
    List<MacSysDepart> querMacSysDepart(MacSysDepart macSysDepart);

    int deteleDepart(Integer id);

    int intsertDepart(MacSysDepart macSysDepart);

    int updateDepart(MacSysDepart macSysDepart);
}
