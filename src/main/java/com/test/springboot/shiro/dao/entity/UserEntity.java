package com.test.springboot.shiro.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class UserEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.id
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.create_time
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.last_modify_time
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private Date lastModifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.role_id
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.name
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.email
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.tel
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.login_username
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private String loginUsername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.login_password
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private String loginPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.account_status
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private Byte accountStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.id
     *
     * @return the value of tb_user.id
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.id
     *
     * @param id the value for tb_user.id
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.create_time
     *
     * @return the value of tb_user.create_time
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.create_time
     *
     * @param createTime the value for tb_user.create_time
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.last_modify_time
     *
     * @return the value of tb_user.last_modify_time
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.last_modify_time
     *
     * @param lastModifyTime the value for tb_user.last_modify_time
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.role_id
     *
     * @return the value of tb_user.role_id
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.role_id
     *
     * @param roleId the value for tb_user.role_id
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.name
     *
     * @return the value of tb_user.name
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.name
     *
     * @param name the value for tb_user.name
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.email
     *
     * @return the value of tb_user.email
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.email
     *
     * @param email the value for tb_user.email
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.tel
     *
     * @return the value of tb_user.tel
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.tel
     *
     * @param tel the value for tb_user.tel
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.login_username
     *
     * @return the value of tb_user.login_username
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public String getLoginUsername() {
        return loginUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.login_username
     *
     * @param loginUsername the value for tb_user.login_username
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername == null ? null : loginUsername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.login_password
     *
     * @return the value of tb_user.login_password
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.login_password
     *
     * @param loginPassword the value for tb_user.login_password
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.account_status
     *
     * @return the value of tb_user.account_status
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public Byte getAccountStatus() {
        return accountStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.account_status
     *
     * @param accountStatus the value for tb_user.account_status
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setAccountStatus(Byte accountStatus) {
        this.accountStatus = accountStatus;
    }
}