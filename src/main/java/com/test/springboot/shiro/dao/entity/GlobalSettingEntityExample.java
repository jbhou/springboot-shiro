package com.test.springboot.shiro.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GlobalSettingEntityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public GlobalSettingEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSettingKeyIsNull() {
            addCriterion("setting_key is null");
            return (Criteria) this;
        }

        public Criteria andSettingKeyIsNotNull() {
            addCriterion("setting_key is not null");
            return (Criteria) this;
        }

        public Criteria andSettingKeyEqualTo(String value) {
            addCriterion("setting_key =", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyNotEqualTo(String value) {
            addCriterion("setting_key <>", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyGreaterThan(String value) {
            addCriterion("setting_key >", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyGreaterThanOrEqualTo(String value) {
            addCriterion("setting_key >=", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyLessThan(String value) {
            addCriterion("setting_key <", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyLessThanOrEqualTo(String value) {
            addCriterion("setting_key <=", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyLike(String value) {
            addCriterion("setting_key like", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyNotLike(String value) {
            addCriterion("setting_key not like", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyIn(List<String> values) {
            addCriterion("setting_key in", values, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyNotIn(List<String> values) {
            addCriterion("setting_key not in", values, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyBetween(String value1, String value2) {
            addCriterion("setting_key between", value1, value2, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyNotBetween(String value1, String value2) {
            addCriterion("setting_key not between", value1, value2, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingValueIsNull() {
            addCriterion("setting_value is null");
            return (Criteria) this;
        }

        public Criteria andSettingValueIsNotNull() {
            addCriterion("setting_value is not null");
            return (Criteria) this;
        }

        public Criteria andSettingValueEqualTo(String value) {
            addCriterion("setting_value =", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueNotEqualTo(String value) {
            addCriterion("setting_value <>", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueGreaterThan(String value) {
            addCriterion("setting_value >", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueGreaterThanOrEqualTo(String value) {
            addCriterion("setting_value >=", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueLessThan(String value) {
            addCriterion("setting_value <", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueLessThanOrEqualTo(String value) {
            addCriterion("setting_value <=", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueLike(String value) {
            addCriterion("setting_value like", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueNotLike(String value) {
            addCriterion("setting_value not like", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueIn(List<String> values) {
            addCriterion("setting_value in", values, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueNotIn(List<String> values) {
            addCriterion("setting_value not in", values, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueBetween(String value1, String value2) {
            addCriterion("setting_value between", value1, value2, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueNotBetween(String value1, String value2) {
            addCriterion("setting_value not between", value1, value2, "settingValue");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("last_modify_time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("last_modify_time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("last_modify_time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("last_modify_time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("last_modify_time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("last_modify_time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_modify_time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_time not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_global_setting
     *
     * @mbggenerated do_not_delete_during_merge Mon May 21 10:13:05 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_global_setting
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}