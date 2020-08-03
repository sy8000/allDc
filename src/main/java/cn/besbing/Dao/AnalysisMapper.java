package cn.besbing.Dao;

import cn.besbing.Entities.Analysis;
import cn.besbing.Entities.AnalysisExample;
import cn.besbing.Entities.AnalysisKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnalysisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ANALYSIS
     *
     * @mbg.generated Mon May 04 16:55:47 CST 2020
     */
    long countByExample(AnalysisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ANALYSIS
     *
     * @mbg.generated Mon May 04 16:55:47 CST 2020
     */
    int deleteByExample(AnalysisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ANALYSIS
     *
     * @mbg.generated Mon May 04 16:55:47 CST 2020
     */
    int deleteByPrimaryKey(AnalysisKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ANALYSIS
     *
     * @mbg.generated Mon May 04 16:55:47 CST 2020
     */
    int insert(Analysis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ANALYSIS
     *
     * @mbg.generated Mon May 04 16:55:47 CST 2020
     */
    int insertSelective(Analysis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ANALYSIS
     *
     * @mbg.generated Mon May 04 16:55:47 CST 2020
     */
    List<Analysis> selectByExample(AnalysisExample example);


    List<Analysis> selectByNothing();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ANALYSIS
     *
     * @mbg.generated Mon May 04 16:55:47 CST 2020
     */
    Analysis selectByPrimaryKey(AnalysisKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ANALYSIS
     *
     * @mbg.generated Mon May 04 16:55:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") Analysis record, @Param("example") AnalysisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ANALYSIS
     *
     * @mbg.generated Mon May 04 16:55:47 CST 2020
     */
    int updateByExample(@Param("record") Analysis record, @Param("example") AnalysisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ANALYSIS
     *
     * @mbg.generated Mon May 04 16:55:47 CST 2020
     */
    int updateByPrimaryKeySelective(Analysis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ANALYSIS
     *
     * @mbg.generated Mon May 04 16:55:47 CST 2020
     */
    int updateByPrimaryKey(Analysis record);
}