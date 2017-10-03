package jp.co.aliber.accsystem.mapper.auto;

import java.util.List;
import jp.co.aliber.accsystem.entity.auto.MHealthInsuranceStandardPayment;
import jp.co.aliber.accsystem.entity.auto.MHealthInsuranceStandardPaymentExample;
import org.apache.ibatis.annotations.Param;

public interface MHealthInsuranceStandardPaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    long countByExample(MHealthInsuranceStandardPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    int deleteByExample(MHealthInsuranceStandardPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("paymentStart") Long paymentStart, @Param("paymentEnd") Long paymentEnd);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    int insert(MHealthInsuranceStandardPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    int insertSelective(MHealthInsuranceStandardPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    List<MHealthInsuranceStandardPayment> selectByExample(MHealthInsuranceStandardPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    MHealthInsuranceStandardPayment selectByPrimaryKey(@Param("paymentStart") Long paymentStart, @Param("paymentEnd") Long paymentEnd);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MHealthInsuranceStandardPayment record, @Param("example") MHealthInsuranceStandardPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MHealthInsuranceStandardPayment record, @Param("example") MHealthInsuranceStandardPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MHealthInsuranceStandardPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MHealthInsuranceStandardPayment record);
}