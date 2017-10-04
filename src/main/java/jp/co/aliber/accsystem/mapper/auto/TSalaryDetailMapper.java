package jp.co.aliber.accsystem.mapper.auto;

import java.util.List;
import jp.co.aliber.accsystem.entity.auto.TSalaryDetail;
import jp.co.aliber.accsystem.entity.auto.TSalaryDetailExample;
import org.apache.ibatis.annotations.Param;

public interface TSalaryDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_salary_detail
     *
     * @mbg.generated
     */
    long countByExample(TSalaryDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_salary_detail
     *
     * @mbg.generated
     */
    int deleteByExample(TSalaryDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_salary_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("employeeId") Integer employeeId, @Param("compId") Integer compId, @Param("salaryYearMonth") String salaryYearMonth);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_salary_detail
     *
     * @mbg.generated
     */
    int insert(TSalaryDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_salary_detail
     *
     * @mbg.generated
     */
    int insertSelective(TSalaryDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_salary_detail
     *
     * @mbg.generated
     */
    List<TSalaryDetail> selectByExample(TSalaryDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_salary_detail
     *
     * @mbg.generated
     */
    TSalaryDetail selectByPrimaryKey(@Param("employeeId") Integer employeeId, @Param("compId") Integer compId, @Param("salaryYearMonth") String salaryYearMonth);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_salary_detail
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TSalaryDetail record, @Param("example") TSalaryDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_salary_detail
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TSalaryDetail record, @Param("example") TSalaryDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_salary_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TSalaryDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_salary_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TSalaryDetail record);
}