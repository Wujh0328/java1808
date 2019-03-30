package com.qianfeng.dto;


public class WxbServerCount {

  private String scid;
  private String orderId;
  private double orderMoney;
  private double serverPmoney;
  private long stateId;
  private java.sql.Timestamp createtime;
  private String remark;


  public String getScid() {
    return scid;
  }

  public void setScid(String scid) {
    this.scid = scid;
  }


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public double getOrderMoney() {
    return orderMoney;
  }

  public void setOrderMoney(double orderMoney) {
    this.orderMoney = orderMoney;
  }


  public double getServerPmoney() {
    return serverPmoney;
  }

  public void setServerPmoney(double serverPmoney) {
    this.serverPmoney = serverPmoney;
  }


  public long getStateId() {
    return stateId;
  }

  public void setStateId(long stateId) {
    this.stateId = stateId;
  }


  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
