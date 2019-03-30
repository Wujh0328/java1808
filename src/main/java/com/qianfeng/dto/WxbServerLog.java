package com.qianfeng.dto;


public class WxbServerLog {

  private long logId;
  private String orderId;
  private String userId;
  private String logTxt;
  private java.sql.Timestamp createtime;


  public long getLogId() {
    return logId;
  }

  public void setLogId(long logId) {
    this.logId = logId;
  }


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getLogTxt() {
    return logTxt;
  }

  public void setLogTxt(String logTxt) {
    this.logTxt = logTxt;
  }


  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }

}
