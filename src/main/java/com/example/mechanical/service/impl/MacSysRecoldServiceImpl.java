package com.example.mechanical.service.impl;

import com.example.mechanical.entity.MacSysRecold;
import com.example.mechanical.mapper.MacSysRecoldMapper;
import com.example.mechanical.service.MacSysRecoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/17 17:04
 */
@Service
public class MacSysRecoldServiceImpl implements MacSysRecoldService {

    @Autowired
    public MacSysRecoldMapper macSysRecoldMapper;

    @Override
    public List<MacSysRecold> selectrecold(MacSysRecold macSysRecold) {
        return macSysRecoldMapper.selectrecold(macSysRecold);
    }

    @Override
    public int updaterecold(MacSysRecold macSysRecold) {
        return macSysRecoldMapper.updateByPrimaryKeySelective(macSysRecold);
    }
}
