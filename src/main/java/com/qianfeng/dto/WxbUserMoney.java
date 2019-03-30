package com.qianfeng.dto;


public class WxbUserMoney {

  private long umId;
  private String userId;
  private double orderMoney;
  private double visitMoney;
  private double ownMoney;
  private long state;
  private java.sql.Timestamp createtime;
  private String ocid;


  public long getUmId() {
    return umId;
  }

  public void setUmId(long umId) {
    this.umId = umId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public double getOrderMoney() {
    return orderMoney;
  }

  public void setOrderMoney(double orderMoney) {
    this.orderMoney = orderMoney;
  }


  public double getVisitMoney() {
    return visitMoney;
  }

  public void setVisitMoney(double visitMoney) {
    this.visitMoney = visitMoney;
  }


  public double getOwnMoney() {
    return ownMoney;
  }

  public void setOwnMoney(double ownMoney) {
    this.ownMoney = ownMoney;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }


  public String getOcid() {
    return ocid;
  }

  public void setOcid(String ocid) {
    this.ocid = ocid;
  }

}
