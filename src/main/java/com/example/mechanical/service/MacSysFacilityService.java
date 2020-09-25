package com.example.mechanical.service;

import com.example.mechanical.entity.MacSysFacility;

import java.util.List;

/**
 * @author HaoBaiKui
 * @date 2020/9/17 17:11
 */
public interface MacSysFacilityService {
    List<MacSysFacility> selectListFacility(MacSysFacility macSysFacility);

    int deleteFacility(Integer id);
}
