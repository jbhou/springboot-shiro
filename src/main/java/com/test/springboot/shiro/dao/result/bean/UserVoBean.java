package com.test.springboot.shiro.dao.result.bean;

import java.util.Date;

import com.test.springboot.shiro.dao.entity.UserEntity;

public class UserVoBean {
    private Date createTime;
    private Date lastModifyTime;
    private String email;
    private String tel;
    private String loginUsername;
    private String flag;
    private String flagMessage;
    private int userId;
    private String userName;
    private RoleVoBean role;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public RoleVoBean getRole() {
        return role;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRole(RoleVoBean role) {
        this.role = role;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getFlagMessage() {
        return flagMessage;
    }

    public void setFlagMessage(String flagMessage) {
        this.flagMessage = flagMessage;
    }

    public static UserVoBean fromEntity(UserEntity e) {
        UserVoBean v = new UserVoBean();
        v.setEmail(e.getEmail());
        v.setLoginUsername(e.getLoginUsername());
        v.setUserId(e.getId());
        v.setTel(e.getTel());
        v.setUserName(e.getName());
        return v;
    }
}
