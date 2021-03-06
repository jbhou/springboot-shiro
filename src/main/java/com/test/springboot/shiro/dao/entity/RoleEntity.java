package com.test.springboot.shiro.dao.entity;

import java.util.Date;

public class RoleEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_role.id
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_role.access_menu_ids
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private String accessMenuIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_role.access_resource_operation_ids
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private String accessResourceOperationIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_role.create_time
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_role.role_name
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_role.role_desc
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private String roleDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_role.last_modify_time
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    private Date lastModifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_role.id
     *
     * @return the value of tb_role.id
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_role.id
     *
     * @param id the value for tb_role.id
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_role.access_menu_ids
     *
     * @return the value of tb_role.access_menu_ids
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public String getAccessMenuIds() {
        return accessMenuIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_role.access_menu_ids
     *
     * @param accessMenuIds the value for tb_role.access_menu_ids
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setAccessMenuIds(String accessMenuIds) {
        this.accessMenuIds = accessMenuIds == null ? null : accessMenuIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_role.access_resource_operation_ids
     *
     * @return the value of tb_role.access_resource_operation_ids
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public String getAccessResourceOperationIds() {
        return accessResourceOperationIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_role.access_resource_operation_ids
     *
     * @param accessResourceOperationIds the value for tb_role.access_resource_operation_ids
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setAccessResourceOperationIds(String accessResourceOperationIds) {
        this.accessResourceOperationIds = accessResourceOperationIds == null ? null : accessResourceOperationIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_role.create_time
     *
     * @return the value of tb_role.create_time
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_role.create_time
     *
     * @param createTime the value for tb_role.create_time
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_role.role_name
     *
     * @return the value of tb_role.role_name
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_role.role_name
     *
     * @param roleName the value for tb_role.role_name
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_role.role_desc
     *
     * @return the value of tb_role.role_desc
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_role.role_desc
     *
     * @param roleDesc the value for tb_role.role_desc
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_role.last_modify_time
     *
     * @return the value of tb_role.last_modify_time
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_role.last_modify_time
     *
     * @param lastModifyTime the value for tb_role.last_modify_time
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}