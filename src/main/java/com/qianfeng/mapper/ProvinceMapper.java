package com.qianfeng.mapper;

import com.qianfeng.dto.Province;

import java.util.List;

public interface ProvinceMapper {

    List<Province> queryProvinceAndCityAndRegion();
}
