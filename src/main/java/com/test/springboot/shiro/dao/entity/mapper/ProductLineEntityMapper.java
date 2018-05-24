package com.test.springboot.shiro.dao.entity.mapper;

import com.test.springboot.shiro.dao.entity.ProductLineEntity;
import com.test.springboot.shiro.dao.entity.ProductLineEntityExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ProductLineEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_line
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int countByExample(ProductLineEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_line
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int deleteByExample(ProductLineEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_line
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    @Delete({
        "delete from tb_product_line",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_line
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    @Insert({
        "insert into tb_product_line (create_time, last_modify_time, ",
        "workshop_id, name, ",
        "person_liable_id, desc_info)",
        "values (#{createTime,jdbcType=TIMESTAMP}, #{lastModifyTime,jdbcType=TIMESTAMP}, ",
        "#{workshopId,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{personLiableId,jdbcType=INTEGER}, #{descInfo,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(ProductLineEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_line
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int insertSelective(ProductLineEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_line
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    List<ProductLineEntity> selectByExample(ProductLineEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_line
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    @Select({
        "select",
        "id, create_time, last_modify_time, workshop_id, name, person_liable_id, desc_info",
        "from tb_product_line",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    ProductLineEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_line
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductLineEntity record, @Param("example") ProductLineEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_line
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int updateByExample(@Param("record") ProductLineEntity record, @Param("example") ProductLineEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_line
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    int updateByPrimaryKeySelective(ProductLineEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_line
     *
     * @mbggenerated Mon May 21 10:13:05 CST 2018
     */
    @Update({
        "update tb_product_line",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_modify_time = #{lastModifyTime,jdbcType=TIMESTAMP},",
          "workshop_id = #{workshopId,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "person_liable_id = #{personLiableId,jdbcType=INTEGER},",
          "desc_info = #{descInfo,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProductLineEntity record);
}