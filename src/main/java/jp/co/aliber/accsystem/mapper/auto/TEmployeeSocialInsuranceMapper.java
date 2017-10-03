package jp.co.aliber.accsystem.mapper.auto;

import java.util.List;
import jp.co.aliber.accsystem.entity.auto.TEmployeeSocialInsurance;
import jp.co.aliber.accsystem.entity.auto.TEmployeeSocialInsuranceExample;
import org.apache.ibatis.annotations.Param;

public interface TEmployeeSocialInsuranceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_social_insurance
     *
     * @mbg.generated
     */
    long countByExample(TEmployeeSocialInsuranceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_social_insurance
     *
     * @mbg.generated
     */
    int deleteByExample(TEmployeeSocialInsuranceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_social_insurance
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("employeeId") Integer employeeId, @Param("compId") Integer compId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_social_insurance
     *
     * @mbg.generated
     */
    int insert(TEmployeeSocialInsurance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_social_insurance
     *
     * @mbg.generated
     */
    int insertSelective(TEmployeeSocialInsurance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_social_insurance
     *
     * @mbg.generated
     */
    List<TEmployeeSocialInsurance> selectByExample(TEmployeeSocialInsuranceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_social_insurance
     *
     * @mbg.generated
     */
    TEmployeeSocialInsurance selectByPrimaryKey(@Param("employeeId") Integer employeeId, @Param("compId") Integer compId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_social_insurance
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TEmployeeSocialInsurance record, @Param("example") TEmployeeSocialInsuranceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_social_insurance
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TEmployeeSocialInsurance record, @Param("example") TEmployeeSocialInsuranceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_social_insurance
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TEmployeeSocialInsurance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_social_insurance
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TEmployeeSocialInsurance record);
}