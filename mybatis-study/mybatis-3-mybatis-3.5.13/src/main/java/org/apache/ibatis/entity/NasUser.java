package org.apache.ibatis.entity;

import java.io.Serializable;



public class NasUser implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String userName;
    private String realName;
    private String email;
    private String mobile;
    private Long createTime;
    private Long updateTime;
    private Boolean bizopen;
    private Integer status;
    private String password;
    private Long capacity;
    private Integer regionCode;
    private Long activateTime;
    private Long stopVolumeTime;
    /**
     * 描述信息
     */
    private String remark;

    /**
     * 角色
     * sys_admin超级管理员
     * admin 管理员
     * nas 普通用户
     */
    private String role;

    private String operateStatus;

  @Override
  public String toString () {

    return "NasUser{" +
      "id=" + id +
      ", userName='" + userName + '\'' +
      ", realName='" + realName + '\'' +
      ", email='" + email + '\'' +
      ", mobile='" + mobile + '\'' +
      ", createTime=" + createTime +
      ", updateTime=" + updateTime +
      ", bizopen=" + bizopen +
      ", status=" + status +
      ", password='" + password + '\'' +
      ", capacity=" + capacity +
      ", regionCode=" + regionCode +
      ", activateTime=" + activateTime +
      ", stopVolumeTime=" + stopVolumeTime +
      ", remark='" + remark + '\'' +
      ", role='" + role + '\'' +
      ", operateStatus='" + operateStatus + '\'' +
      '}';
  }

  public Integer getId () {

    return id;
  }

  public void setId (Integer id) {

    this.id = id;
  }

  public String getUserName () {

    return userName;
  }

  public void setUserName (String userName) {

    this.userName = userName;
  }

  public String getRealName () {

    return realName;
  }

  public void setRealName (String realName) {

    this.realName = realName;
  }

  public String getEmail () {

    return email;
  }

  public void setEmail (String email) {

    this.email = email;
  }

  public String getMobile () {

    return mobile;
  }

  public void setMobile (String mobile) {

    this.mobile = mobile;
  }

  public Long getCreateTime () {

    return createTime;
  }

  public void setCreateTime (Long createTime) {

    this.createTime = createTime;
  }

  public Long getUpdateTime () {

    return updateTime;
  }

  public void setUpdateTime (Long updateTime) {

    this.updateTime = updateTime;
  }

  public Boolean getBizopen () {

    return bizopen;
  }

  public void setBizopen (Boolean bizopen) {

    this.bizopen = bizopen;
  }

  public Integer getStatus () {

    return status;
  }

  public void setStatus (Integer status) {

    this.status = status;
  }

  public String getPassword () {

    return password;
  }

  public void setPassword (String password) {

    this.password = password;
  }

  public Long getCapacity () {

    return capacity;
  }

  public void setCapacity (Long capacity) {

    this.capacity = capacity;
  }

  public Integer getRegionCode () {

    return regionCode;
  }

  public void setRegionCode (Integer regionCode) {

    this.regionCode = regionCode;
  }

  public Long getActivateTime () {

    return activateTime;
  }

  public void setActivateTime (Long activateTime) {

    this.activateTime = activateTime;
  }

  public Long getStopVolumeTime () {

    return stopVolumeTime;
  }

  public void setStopVolumeTime (Long stopVolumeTime) {

    this.stopVolumeTime = stopVolumeTime;
  }

  public String getRemark () {

    return remark;
  }

  public void setRemark (String remark) {

    this.remark = remark;
  }

  public String getRole () {

    return role;
  }

  public void setRole (String role) {

    this.role = role;
  }

  public String getOperateStatus () {

    return operateStatus;
  }

  public void setOperateStatus (String operateStatus) {

    this.operateStatus = operateStatus;
  }
}
