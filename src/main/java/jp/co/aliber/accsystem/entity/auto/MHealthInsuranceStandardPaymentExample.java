package jp.co.aliber.accsystem.entity.auto;

import java.util.ArrayList;
import java.util.List;

public class MHealthInsuranceStandardPaymentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    public MHealthInsuranceStandardPaymentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPaymentStartIsNull() {
            addCriterion("payment_start is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStartIsNotNull() {
            addCriterion("payment_start is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStartEqualTo(Long value) {
            addCriterion("payment_start =", value, "paymentStart");
            return (Criteria) this;
        }

        public Criteria andPaymentStartNotEqualTo(Long value) {
            addCriterion("payment_start <>", value, "paymentStart");
            return (Criteria) this;
        }

        public Criteria andPaymentStartGreaterThan(Long value) {
            addCriterion("payment_start >", value, "paymentStart");
            return (Criteria) this;
        }

        public Criteria andPaymentStartGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_start >=", value, "paymentStart");
            return (Criteria) this;
        }

        public Criteria andPaymentStartLessThan(Long value) {
            addCriterion("payment_start <", value, "paymentStart");
            return (Criteria) this;
        }

        public Criteria andPaymentStartLessThanOrEqualTo(Long value) {
            addCriterion("payment_start <=", value, "paymentStart");
            return (Criteria) this;
        }

        public Criteria andPaymentStartIn(List<Long> values) {
            addCriterion("payment_start in", values, "paymentStart");
            return (Criteria) this;
        }

        public Criteria andPaymentStartNotIn(List<Long> values) {
            addCriterion("payment_start not in", values, "paymentStart");
            return (Criteria) this;
        }

        public Criteria andPaymentStartBetween(Long value1, Long value2) {
            addCriterion("payment_start between", value1, value2, "paymentStart");
            return (Criteria) this;
        }

        public Criteria andPaymentStartNotBetween(Long value1, Long value2) {
            addCriterion("payment_start not between", value1, value2, "paymentStart");
            return (Criteria) this;
        }

        public Criteria andPaymentEndIsNull() {
            addCriterion("payment_end is null");
            return (Criteria) this;
        }

        public Criteria andPaymentEndIsNotNull() {
            addCriterion("payment_end is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEndEqualTo(Long value) {
            addCriterion("payment_end =", value, "paymentEnd");
            return (Criteria) this;
        }

        public Criteria andPaymentEndNotEqualTo(Long value) {
            addCriterion("payment_end <>", value, "paymentEnd");
            return (Criteria) this;
        }

        public Criteria andPaymentEndGreaterThan(Long value) {
            addCriterion("payment_end >", value, "paymentEnd");
            return (Criteria) this;
        }

        public Criteria andPaymentEndGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_end >=", value, "paymentEnd");
            return (Criteria) this;
        }

        public Criteria andPaymentEndLessThan(Long value) {
            addCriterion("payment_end <", value, "paymentEnd");
            return (Criteria) this;
        }

        public Criteria andPaymentEndLessThanOrEqualTo(Long value) {
            addCriterion("payment_end <=", value, "paymentEnd");
            return (Criteria) this;
        }

        public Criteria andPaymentEndIn(List<Long> values) {
            addCriterion("payment_end in", values, "paymentEnd");
            return (Criteria) this;
        }

        public Criteria andPaymentEndNotIn(List<Long> values) {
            addCriterion("payment_end not in", values, "paymentEnd");
            return (Criteria) this;
        }

        public Criteria andPaymentEndBetween(Long value1, Long value2) {
            addCriterion("payment_end between", value1, value2, "paymentEnd");
            return (Criteria) this;
        }

        public Criteria andPaymentEndNotBetween(Long value1, Long value2) {
            addCriterion("payment_end not between", value1, value2, "paymentEnd");
            return (Criteria) this;
        }

        public Criteria andStandardPaymentIsNull() {
            addCriterion("standard_payment is null");
            return (Criteria) this;
        }

        public Criteria andStandardPaymentIsNotNull() {
            addCriterion("standard_payment is not null");
            return (Criteria) this;
        }

        public Criteria andStandardPaymentEqualTo(Long value) {
            addCriterion("standard_payment =", value, "standardPayment");
            return (Criteria) this;
        }

        public Criteria andStandardPaymentNotEqualTo(Long value) {
            addCriterion("standard_payment <>", value, "standardPayment");
            return (Criteria) this;
        }

        public Criteria andStandardPaymentGreaterThan(Long value) {
            addCriterion("standard_payment >", value, "standardPayment");
            return (Criteria) this;
        }

        public Criteria andStandardPaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("standard_payment >=", value, "standardPayment");
            return (Criteria) this;
        }

        public Criteria andStandardPaymentLessThan(Long value) {
            addCriterion("standard_payment <", value, "standardPayment");
            return (Criteria) this;
        }

        public Criteria andStandardPaymentLessThanOrEqualTo(Long value) {
            addCriterion("standard_payment <=", value, "standardPayment");
            return (Criteria) this;
        }

        public Criteria andStandardPaymentIn(List<Long> values) {
            addCriterion("standard_payment in", values, "standardPayment");
            return (Criteria) this;
        }

        public Criteria andStandardPaymentNotIn(List<Long> values) {
            addCriterion("standard_payment not in", values, "standardPayment");
            return (Criteria) this;
        }

        public Criteria andStandardPaymentBetween(Long value1, Long value2) {
            addCriterion("standard_payment between", value1, value2, "standardPayment");
            return (Criteria) this;
        }

        public Criteria andStandardPaymentNotBetween(Long value1, Long value2) {
            addCriterion("standard_payment not between", value1, value2, "standardPayment");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.m_health_insurance_standard_payment
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}