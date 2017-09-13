package jp.co.aliber.accsystem.mapper.auto;

import java.util.List;
import jp.co.aliber.accsystem.entity.auto.Employee;
import jp.co.aliber.accsystem.entity.auto.EmployeeExample;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.employee
     *
     * @mbg.generated
     */
    long countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.employee
     *
     * @mbg.generated
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.employee
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.employee
     *
     * @mbg.generated
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.employee
     *
     * @mbg.generated
     */
    int insertSelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.employee
     *
     * @mbg.generated
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.employee
     *
     * @mbg.generated
     */
    Employee selectByPrimaryKey(Long employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.employee
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.employee
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.employee
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.employee
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Employee record);
}