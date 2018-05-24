package com.test.springboot.shiro.dao.entity;

import java.util.Date;

public class DeviceEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.name
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.device_type
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Byte deviceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.device_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private String deviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.physics_number
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private String physicsNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.desc_info
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private String descInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.manufacturer
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private String manufacturer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.create_user_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Integer createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.create_time
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.last_modify_time
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Date lastModifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.status
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.person_liable_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Integer personLiableId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.product_line_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Integer productLineId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_device.order
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Byte order;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.id
     *
     * @return the value of tb_device.id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.id
     *
     * @param id the value for tb_device.id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.name
     *
     * @return the value of tb_device.name
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.name
     *
     * @param name the value for tb_device.name
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.device_type
     *
     * @return the value of tb_device.device_type
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Byte getDeviceType() {
        return deviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.device_type
     *
     * @param deviceType the value for tb_device.device_type
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setDeviceType(Byte deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.device_id
     *
     * @return the value of tb_device.device_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.device_id
     *
     * @param deviceId the value for tb_device.device_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.physics_number
     *
     * @return the value of tb_device.physics_number
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public String getPhysicsNumber() {
        return physicsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.physics_number
     *
     * @param physicsNumber the value for tb_device.physics_number
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setPhysicsNumber(String physicsNumber) {
        this.physicsNumber = physicsNumber == null ? null : physicsNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.desc_info
     *
     * @return the value of tb_device.desc_info
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public String getDescInfo() {
        return descInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.desc_info
     *
     * @param descInfo the value for tb_device.desc_info
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setDescInfo(String descInfo) {
        this.descInfo = descInfo == null ? null : descInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.manufacturer
     *
     * @return the value of tb_device.manufacturer
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.manufacturer
     *
     * @param manufacturer the value for tb_device.manufacturer
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.create_user_id
     *
     * @return the value of tb_device.create_user_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.create_user_id
     *
     * @param createUserId the value for tb_device.create_user_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.create_time
     *
     * @return the value of tb_device.create_time
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.create_time
     *
     * @param createTime the value for tb_device.create_time
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.last_modify_time
     *
     * @return the value of tb_device.last_modify_time
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.last_modify_time
     *
     * @param lastModifyTime the value for tb_device.last_modify_time
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.status
     *
     * @return the value of tb_device.status
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.status
     *
     * @param status the value for tb_device.status
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.person_liable_id
     *
     * @return the value of tb_device.person_liable_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Integer getPersonLiableId() {
        return personLiableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.person_liable_id
     *
     * @param personLiableId the value for tb_device.person_liable_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setPersonLiableId(Integer personLiableId) {
        this.personLiableId = personLiableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.product_line_id
     *
     * @return the value of tb_device.product_line_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Integer getProductLineId() {
        return productLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.product_line_id
     *
     * @param productLineId the value for tb_device.product_line_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setProductLineId(Integer productLineId) {
        this.productLineId = productLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_device.order
     *
     * @return the value of tb_device.order
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Byte getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_device.order
     *
     * @param order the value for tb_device.order
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setOrder(Byte order) {
        this.order = order;
    }
}