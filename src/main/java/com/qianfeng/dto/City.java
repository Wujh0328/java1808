package com.qianfeng.dto;


import java.io.Serializable;
import java.util.List;

public class City implements Serializable {

  private long cityId;
  private String cityName;
  private String provinceId;
  private String firstLetter;
  private long isHot;
  private long state;
  private List<Region> regionList;

  public List<Region> getRegionList() {
    return regionList;
  }

  public void setRegionList(List<Region> regionList) {
    this.regionList = regionList;
  }




  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }


  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public String getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(String provinceId) {
    this.provinceId = provinceId;
  }


  public String getFirstLetter() {
    return firstLetter;
  }

  public void setFirstLetter(String firstLetter) {
    this.firstLetter = firstLetter;
  }


  public long getIsHot() {
    return isHot;
  }

  public void setIsHot(long isHot) {
    this.isHot = isHot;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

}
