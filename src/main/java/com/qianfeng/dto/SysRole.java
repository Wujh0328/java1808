package com.qianfeng.dto;


public class SysRole {

  private String roleCode;
  private String roleName;
  private String roleDesc;
  private long roleOrder;
  private long roleType;


  public String getRoleCode() {
    return roleCode;
  }

  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getRoleDesc() {
    return roleDesc;
  }

  public void setRoleDesc(String roleDesc) {
    this.roleDesc = roleDesc;
  }


  public long getRoleOrder() {
    return roleOrder;
  }

  public void setRoleOrder(long roleOrder) {
    this.roleOrder = roleOrder;
  }


  public long getRoleType() {
    return roleType;
  }

  public void setRoleType(long roleType) {
    this.roleType = roleType;
  }

}
