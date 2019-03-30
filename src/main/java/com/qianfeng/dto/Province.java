package com.qianfeng.dto;


import java.io.Serializable;
import java.util.List;

public class Province implements Serializable {

  private String provinceId;
  private String provinceName;
  private List<City> cityList;

  public List<City> getCityList() {
    return cityList;
  }

  public void setCityList(List<City> cityList) {
    this.cityList = cityList;
  }

  public String getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(String provinceId) {
    this.provinceId = provinceId;
  }


  public String getProvinceName() {
    return provinceName;
  }

  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }

}
