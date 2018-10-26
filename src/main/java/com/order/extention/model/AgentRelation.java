package com.order.extention.model;

import java.util.Date;

public class AgentRelation {
    private Long id;

    private Long role;

    private Long operator;

    private Long area;

    private Long plat;

    private String openid;

    private String account;

    private String aName;

    private String aPassword;

    private Long agentRelation;

    private Integer isblock;

    private String contactName;

    private String contactPhone;

    private Integer loginNums;

    private Integer mGroup;

    private Long manager;

    private Date registtime;

    private Date lastLogin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }

    public Long getOperator() {
        return operator;
    }

    public void setOperator(Long operator) {
        this.operator = operator;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public Long getPlat() {
        return plat;
    }

    public void setPlat(Long plat) {
        this.plat = plat;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword == null ? null : aPassword.trim();
    }

    public Long getAgentRelation() {
        return agentRelation;
    }

    public void setAgentRelation(Long agentRelation) {
        this.agentRelation = agentRelation;
    }

    public Integer getIsblock() {
        return isblock;
    }

    public void setIsblock(Integer isblock) {
        this.isblock = isblock;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public Integer getLoginNums() {
        return loginNums;
    }

    public void setLoginNums(Integer loginNums) {
        this.loginNums = loginNums;
    }

    public Integer getmGroup() {
        return mGroup;
    }

    public void setmGroup(Integer mGroup) {
        this.mGroup = mGroup;
    }

    public Long getManager() {
        return manager;
    }

    public void setManager(Long manager) {
        this.manager = manager;
    }

    public Date getRegisttime() {
        return registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "AgentRelation{" +
                "id=" + id +
                ", role=" + role +
                ", operator=" + operator +
                ", area=" + area +
                ", plat=" + plat +
                ", openid='" + openid + '\'' +
                ", account='" + account + '\'' +
                ", aName='" + aName + '\'' +
                ", aPassword='" + aPassword + '\'' +
                ", agentRelation=" + agentRelation +
                ", isblock=" + isblock +
                ", contactName='" + contactName + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", loginNums=" + loginNums +
                ", mGroup=" + mGroup +
                ", manager=" + manager +
                ", registtime=" + registtime +
                ", lastLogin=" + lastLogin +
                '}';
    }
}