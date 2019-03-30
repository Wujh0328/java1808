package com.qianfeng.dto;


public class WxbLoginLog {

  private String userId;
  private String loginIp;
  private java.sql.Timestamp loginTime;
  private long ismobile;
  private long loginId;
  private long logType;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getLoginIp() {
    return loginIp;
  }

  public void setLoginIp(String loginIp) {
    this.loginIp = loginIp;
  }


  public java.sql.Timestamp getLoginTime() {
    return loginTime;
  }

  public void setLoginTime(java.sql.Timestamp loginTime) {
    this.loginTime = loginTime;
  }


  public long getIsmobile() {
    return ismobile;
  }

  public void setIsmobile(long ismobile) {
    this.ismobile = ismobile;
  }


  public long getLoginId() {
    return loginId;
  }

  public void setLoginId(long loginId) {
    this.loginId = loginId;
  }


  public long getLogType() {
    return logType;
  }

  public void setLogType(long logType) {
    this.logType = logType;
  }

}
