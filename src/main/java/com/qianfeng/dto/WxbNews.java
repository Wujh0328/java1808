package com.qianfeng.dto;


public class WxbNews {

  private long newsId;
  private String newsTitle;
  private String newsContent;
  private long clickNum;
  private String showTop;
  private String newsState;
  private java.sql.Timestamp createTime;
  private long orderNo;


  public long getNewsId() {
    return newsId;
  }

  public void setNewsId(long newsId) {
    this.newsId = newsId;
  }


  public String getNewsTitle() {
    return newsTitle;
  }

  public void setNewsTitle(String newsTitle) {
    this.newsTitle = newsTitle;
  }


  public String getNewsContent() {
    return newsContent;
  }

  public void setNewsContent(String newsContent) {
    this.newsContent = newsContent;
  }


  public long getClickNum() {
    return clickNum;
  }

  public void setClickNum(long clickNum) {
    this.clickNum = clickNum;
  }


  public String getShowTop() {
    return showTop;
  }

  public void setShowTop(String showTop) {
    this.showTop = showTop;
  }


  public String getNewsState() {
    return newsState;
  }

  public void setNewsState(String newsState) {
    this.newsState = newsState;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(long orderNo) {
    this.orderNo = orderNo;
  }

}
