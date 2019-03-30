package com.qianfeng.dto;


public class Zipcode {

  private long zipId;
  private String regionId;
  private String zipNumber;
  private String code;


  public long getZipId() {
    return zipId;
  }

  public void setZipId(long zipId) {
    this.zipId = zipId;
  }


  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }


  public String getZipNumber() {
    return zipNumber;
  }

  public void setZipNumber(String zipNumber) {
    this.zipNumber = zipNumber;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

}
