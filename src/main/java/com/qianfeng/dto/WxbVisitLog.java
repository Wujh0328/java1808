package com.qianfeng.dto;


public class WxbVisitLog {

  private long logId;
  private String goodId;
  private String userId;
  private long channelId;
  private String visitIp;
  private long visitNum;
  private java.sql.Timestamp visitTime;
  private String orderId;


  public long getLogId() {
    return logId;
  }

  public void setLogId(long logId) {
    this.logId = logId;
  }


  public String getGoodId() {
    return goodId;
  }

  public void setGoodId(String goodId) {
    this.goodId = goodId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public long getChannelId() {
    return channelId;
  }

  public void setChannelId(long channelId) {
    this.channelId = channelId;
  }


  public String getVisitIp() {
    return visitIp;
  }

  public void setVisitIp(String visitIp) {
    this.visitIp = visitIp;
  }


  public long getVisitNum() {
    return visitNum;
  }

  public void setVisitNum(long visitNum) {
    this.visitNum = visitNum;
  }


  public java.sql.Timestamp getVisitTime() {
    return visitTime;
  }

  public void setVisitTime(java.sql.Timestamp visitTime) {
    this.visitTime = visitTime;
  }


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

}
