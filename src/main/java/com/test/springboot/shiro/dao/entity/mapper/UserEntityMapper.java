package com.test.springboot.shiro.dao.entity.mapper;

import com.test.springboot.shiro.dao.entity.UserEntity;
import com.test.springboot.shiro.dao.entity.UserEntityExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface UserEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    int countByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    int deleteByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    @Delete({
        "delete from tb_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    @Insert({
        "insert into tb_user (create_time, last_modify_time, ",
        "role_id, name, email, ",
        "tel, login_username, ",
        "login_password, account_status)",
        "values (#{createTime,jdbcType=TIMESTAMP}, #{lastModifyTime,jdbcType=TIMESTAMP}, ",
        "#{roleId,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{tel,jdbcType=VARCHAR}, #{loginUsername,jdbcType=VARCHAR}, ",
        "#{loginPassword,jdbcType=VARCHAR}, #{accountStatus,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    int insertSelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    List<UserEntity> selectByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    @Select({
        "select",
        "id, create_time, last_modify_time, role_id, name, email, tel, login_username, ",
        "login_password, account_status",
        "from tb_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    UserEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    int updateByExample(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    int updateByPrimaryKeySelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Mon May 21 17:39:28 CST 2018
     */
    @Update({
        "update tb_user",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_modify_time = #{lastModifyTime,jdbcType=TIMESTAMP},",
          "role_id = #{roleId,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "tel = #{tel,jdbcType=VARCHAR},",
          "login_username = #{loginUsername,jdbcType=VARCHAR},",
          "login_password = #{loginPassword,jdbcType=VARCHAR},",
          "account_status = #{accountStatus,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserEntity record);

    UserEntity findByUsername(String username);
}