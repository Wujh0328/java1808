package com.qianfeng.dto;


public class WxbChargeLog {

  private String chargeId;
  private String customerId;
  private double chargeMoney;
  private java.sql.Timestamp chargeTime;
  private long state;


  public String getChargeId() {
    return chargeId;
  }

  public void setChargeId(String chargeId) {
    this.chargeId = chargeId;
  }


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public double getChargeMoney() {
    return chargeMoney;
  }

  public void setChargeMoney(double chargeMoney) {
    this.chargeMoney = chargeMoney;
  }


  public java.sql.Timestamp getChargeTime() {
    return chargeTime;
  }

  public void setChargeTime(java.sql.Timestamp chargeTime) {
    this.chargeTime = chargeTime;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

}
