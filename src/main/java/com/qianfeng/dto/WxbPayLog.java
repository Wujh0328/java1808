package com.qianfeng.dto;


public class WxbPayLog {

  private long payId;
  private String payAccount;
  private String accountName;
  private String alipayCode;
  private java.sql.Timestamp payTime;
  private String operater;
  private java.sql.Timestamp createtime;
  private String remark;
  private double payMoney;
  private String umId;
  private String customerId;


  public long getPayId() {
    return payId;
  }

  public void setPayId(long payId) {
    this.payId = payId;
  }


  public String getPayAccount() {
    return payAccount;
  }

  public void setPayAccount(String payAccount) {
    this.payAccount = payAccount;
  }


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public String getAlipayCode() {
    return alipayCode;
  }

  public void setAlipayCode(String alipayCode) {
    this.alipayCode = alipayCode;
  }


  public java.sql.Timestamp getPayTime() {
    return payTime;
  }

  public void setPayTime(java.sql.Timestamp payTime) {
    this.payTime = payTime;
  }


  public String getOperater() {
    return operater;
  }

  public void setOperater(String operater) {
    this.operater = operater;
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


  public double getPayMoney() {
    return payMoney;
  }

  public void setPayMoney(double payMoney) {
    this.payMoney = payMoney;
  }


  public String getUmId() {
    return umId;
  }

  public void setUmId(String umId) {
    this.umId = umId;
  }


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

}
