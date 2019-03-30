package com.qianfeng.dto;

public class ClientMsqlLog {

  private long cid;
  private String otype;
  private String msqlText;
  private java.sql.Timestamp createtime;
  private long state;


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public String getOtype() {
    return otype;
  }

  public void setOtype(String otype) {
    this.otype = otype;
  }


  public String getMsqlText() {
    return msqlText;
  }

  public void setMsqlText(String msqlText) {
    this.msqlText = msqlText;
  }


  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

}
