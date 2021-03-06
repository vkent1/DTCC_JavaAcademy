package com.rstech.wordwatch.dao.mapper;

import com.rstech.wordwatch.dao.RSSessionDAO;
import com.rstech.wordwatch.dao.RSSessionDAOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RSSessionDAOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rs_session
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    int countByExample(RSSessionDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rs_session
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    int deleteByExample(RSSessionDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rs_session
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    int deleteByPrimaryKey(Long ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rs_session
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    int insert(RSSessionDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rs_session
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    int insertSelective(RSSessionDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rs_session
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    List<RSSessionDAO> selectByExample(RSSessionDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rs_session
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    RSSessionDAO selectByPrimaryKey(Long ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rs_session
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    int updateByExampleSelective(@Param("record") RSSessionDAO record, @Param("example") RSSessionDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rs_session
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    int updateByExample(@Param("record") RSSessionDAO record, @Param("example") RSSessionDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rs_session
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    int updateByPrimaryKeySelective(RSSessionDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rs_session
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    int updateByPrimaryKey(RSSessionDAO record);
}