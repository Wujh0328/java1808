package com.qianfeng.dto;


public class WxbServerMoney {

  private long smId;
  private String userId;
  private double serverMoney;
  private double ownMoney;
  private long state;
  private java.sql.Timestamp createtime;
  private String scid;


  public long getSmId() {
    return smId;
  }

  public void setSmId(long smId) {
    this.smId = smId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public double getServerMoney() {
    return serverMoney;
  }

  public void setServerMoney(double serverMoney) {
    this.serverMoney = serverMoney;
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


  public String getScid() {
    return scid;
  }

  public void setScid(String scid) {
    this.scid = scid;
  }

}
