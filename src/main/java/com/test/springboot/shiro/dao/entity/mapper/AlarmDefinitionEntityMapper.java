package com.test.springboot.shiro.dao.entity.mapper;

import com.test.springboot.shiro.dao.entity.AlarmDefinitionEntity;
import com.test.springboot.shiro.dao.entity.AlarmDefinitionEntityExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface AlarmDefinitionEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_alarm_definition
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int countByExample(AlarmDefinitionEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_alarm_definition
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int deleteByExample(AlarmDefinitionEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_alarm_definition
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    @Delete({
        "delete from tb_alarm_definition",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_alarm_definition
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    @Insert({
        "insert into tb_alarm_definition (create_time, last_modify_time, ",
        "alarm_name, alarm_content, ",
        "alarm_level, receiver_emails)",
        "values (#{createTime,jdbcType=TIMESTAMP}, #{lastModifyTime,jdbcType=TIMESTAMP}, ",
        "#{alarmName,jdbcType=VARCHAR}, #{alarmContent,jdbcType=VARCHAR}, ",
        "#{alarmLevel,jdbcType=TINYINT}, #{receiverEmails,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(AlarmDefinitionEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_alarm_definition
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int insertSelective(AlarmDefinitionEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_alarm_definition
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    List<AlarmDefinitionEntity> selectByExample(AlarmDefinitionEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_alarm_definition
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    @Select({
        "select",
        "id, create_time, last_modify_time, alarm_name, alarm_content, alarm_level, receiver_emails",
        "from tb_alarm_definition",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    AlarmDefinitionEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_alarm_definition
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") AlarmDefinitionEntity record, @Param("example") AlarmDefinitionEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_alarm_definition
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int updateByExample(@Param("record") AlarmDefinitionEntity record, @Param("example") AlarmDefinitionEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_alarm_definition
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int updateByPrimaryKeySelective(AlarmDefinitionEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_alarm_definition
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    @Update({
        "update tb_alarm_definition",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_modify_time = #{lastModifyTime,jdbcType=TIMESTAMP},",
          "alarm_name = #{alarmName,jdbcType=VARCHAR},",
          "alarm_content = #{alarmContent,jdbcType=VARCHAR},",
          "alarm_level = #{alarmLevel,jdbcType=TINYINT},",
          "receiver_emails = #{receiverEmails,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AlarmDefinitionEntity record);
}