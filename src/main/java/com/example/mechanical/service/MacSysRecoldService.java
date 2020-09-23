package com.example.mechanical.service;

import com.example.mechanical.entity.MacSysRecold;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/17 17:05
 */
public interface MacSysRecoldService {
    List<MacSysRecold> selectrecold(MacSysRecold macSysRecold);

    int updaterecold(MacSysRecold macSysRecold);
}
