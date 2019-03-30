package com.qianfeng.dto;


public class WxbGoodType {

  private String typeId;
  private String typeName;
  private String parentId;
  private String typeTag;
  private long orderNo;
  private String alisaCode;


  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }


  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public String getTypeTag() {
    return typeTag;
  }

  public void setTypeTag(String typeTag) {
    this.typeTag = typeTag;
  }


  public long getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(long orderNo) {
    this.orderNo = orderNo;
  }


  public String getAlisaCode() {
    return alisaCode;
  }

  public void setAlisaCode(String alisaCode) {
    this.alisaCode = alisaCode;
  }

}
