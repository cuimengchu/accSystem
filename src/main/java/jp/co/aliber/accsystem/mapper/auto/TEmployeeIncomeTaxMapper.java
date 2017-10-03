package jp.co.aliber.accsystem.mapper.auto;

import java.util.List;
import jp.co.aliber.accsystem.entity.auto.TEmployeeIncomeTax;
import jp.co.aliber.accsystem.entity.auto.TEmployeeIncomeTaxExample;
import org.apache.ibatis.annotations.Param;

public interface TEmployeeIncomeTaxMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_income_tax
     *
     * @mbg.generated
     */
    long countByExample(TEmployeeIncomeTaxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_income_tax
     *
     * @mbg.generated
     */
    int deleteByExample(TEmployeeIncomeTaxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_income_tax
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("employeeId") Integer employeeId, @Param("compId") Integer compId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_income_tax
     *
     * @mbg.generated
     */
    int insert(TEmployeeIncomeTax record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_income_tax
     *
     * @mbg.generated
     */
    int insertSelective(TEmployeeIncomeTax record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_income_tax
     *
     * @mbg.generated
     */
    List<TEmployeeIncomeTax> selectByExample(TEmployeeIncomeTaxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_income_tax
     *
     * @mbg.generated
     */
    TEmployeeIncomeTax selectByPrimaryKey(@Param("employeeId") Integer employeeId, @Param("compId") Integer compId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_income_tax
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TEmployeeIncomeTax record, @Param("example") TEmployeeIncomeTaxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_income_tax
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TEmployeeIncomeTax record, @Param("example") TEmployeeIncomeTaxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_income_tax
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TEmployeeIncomeTax record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_income_tax
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TEmployeeIncomeTax record);
}