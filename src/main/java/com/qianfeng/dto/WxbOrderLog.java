package com.qianfeng.dto;


public class WxbOrderLog {

  private long logId;
  private String orderId;
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
