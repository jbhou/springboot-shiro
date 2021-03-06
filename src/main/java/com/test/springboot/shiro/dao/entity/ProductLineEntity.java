package com.test.springboot.shiro.dao.entity;

import java.util.Date;

public class ProductLineEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_product_line.id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_product_line.create_time
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_product_line.last_modify_time
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Date lastModifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_product_line.workshop_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Integer workshopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_product_line.name
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_product_line.person_liable_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private Integer personLiableId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_product_line.desc_info
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    private String descInfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_product_line.id
     *
     * @return the value of tb_product_line.id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_product_line.id
     *
     * @param id the value for tb_product_line.id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_product_line.create_time
     *
     * @return the value of tb_product_line.create_time
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_product_line.create_time
     *
     * @param createTime the value for tb_product_line.create_time
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_product_line.last_modify_time
     *
     * @return the value of tb_product_line.last_modify_time
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_product_line.last_modify_time
     *
     * @param lastModifyTime the value for tb_product_line.last_modify_time
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_product_line.workshop_id
     *
     * @return the value of tb_product_line.workshop_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Integer getWorkshopId() {
        return workshopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_product_line.workshop_id
     *
     * @param workshopId the value for tb_product_line.workshop_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setWorkshopId(Integer workshopId) {
        this.workshopId = workshopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_product_line.name
     *
     * @return the value of tb_product_line.name
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_product_line.name
     *
     * @param name the value for tb_product_line.name
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_product_line.person_liable_id
     *
     * @return the value of tb_product_line.person_liable_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Integer getPersonLiableId() {
        return personLiableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_product_line.person_liable_id
     *
     * @param personLiableId the value for tb_product_line.person_liable_id
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setPersonLiableId(Integer personLiableId) {
        this.personLiableId = personLiableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_product_line.desc_info
     *
     * @return the value of tb_product_line.desc_info
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public String getDescInfo() {
        return descInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_product_line.desc_info
     *
     * @param descInfo the value for tb_product_line.desc_info
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setDescInfo(String descInfo) {
        this.descInfo = descInfo == null ? null : descInfo.trim();
    }
}