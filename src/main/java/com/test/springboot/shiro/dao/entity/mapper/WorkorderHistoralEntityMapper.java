package com.test.springboot.shiro.dao.entity.mapper;

import com.test.springboot.shiro.dao.entity.WorkorderHistoralEntity;
import com.test.springboot.shiro.dao.entity.WorkorderHistoralEntityExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface WorkorderHistoralEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_workorder_historal
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int countByExample(WorkorderHistoralEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_workorder_historal
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int deleteByExample(WorkorderHistoralEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_workorder_historal
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    @Delete({
        "delete from tb_workorder_historal",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_workorder_historal
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    @Insert({
        "insert into tb_workorder_historal (create_time, last_modify_time, ",
        "workorder_id, user_id, ",
        "operation, operation_result)",
        "values (#{createTime,jdbcType=TIMESTAMP}, #{lastModifyTime,jdbcType=TIMESTAMP}, ",
        "#{workorderId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{operation,jdbcType=TINYINT}, #{operationResult,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(WorkorderHistoralEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_workorder_historal
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int insertSelective(WorkorderHistoralEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_workorder_historal
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    List<WorkorderHistoralEntity> selectByExample(WorkorderHistoralEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_workorder_historal
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    @Select({
        "select",
        "id, create_time, last_modify_time, workorder_id, user_id, operation, operation_result",
        "from tb_workorder_historal",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    WorkorderHistoralEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_workorder_historal
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") WorkorderHistoralEntity record, @Param("example") WorkorderHistoralEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_workorder_historal
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int updateByExample(@Param("record") WorkorderHistoralEntity record, @Param("example") WorkorderHistoralEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_workorder_historal
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int updateByPrimaryKeySelective(WorkorderHistoralEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_workorder_historal
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    @Update({
        "update tb_workorder_historal",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_modify_time = #{lastModifyTime,jdbcType=TIMESTAMP},",
          "workorder_id = #{workorderId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "operation = #{operation,jdbcType=TINYINT},",
          "operation_result = #{operationResult,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(WorkorderHistoralEntity record);
}