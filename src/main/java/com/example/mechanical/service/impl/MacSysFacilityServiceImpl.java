package com.example.mechanical.service.impl;

import com.example.mechanical.entity.MacSysFacility;
import com.example.mechanical.mapper.MacSysFacilityMapper;
import com.example.mechanical.service.MacSysFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/17 17:11
 */
@Service
public class MacSysFacilityServiceImpl implements MacSysFacilityService {

    @Autowired
    public MacSysFacilityMapper macSysFacilityMapper;

    @Override
    public List<MacSysFacility> selectListFacility(MacSysFacility macSysFacility) {
        return macSysFacilityMapper.selectListFacility(macSysFacility);
    }
}
