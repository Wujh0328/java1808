package com.qianfeng.dto;


public class WxbOrderCount {

  private String ocid;
  private String orderId;
  private double orderMoney;
  private double orderPmoney;
  private long stateId;
  private java.sql.Timestamp createtime;
  private String remark;
  private java.sql.Timestamp expPayDate;


  public String getOcid() {
    return ocid;
  }

  public void setOcid(String ocid) {
    this.ocid = ocid;
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


  public double getOrderPmoney() {
    return orderPmoney;
  }

  public void setOrderPmoney(double orderPmoney) {
    this.orderPmoney = orderPmoney;
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


  public java.sql.Timestamp getExpPayDate() {
    return expPayDate;
  }

  public void setExpPayDate(java.sql.Timestamp expPayDate) {
    this.expPayDate = expPayDate;
  }

}
