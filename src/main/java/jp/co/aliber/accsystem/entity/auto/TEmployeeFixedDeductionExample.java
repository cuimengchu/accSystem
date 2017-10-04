package jp.co.aliber.accsystem.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TEmployeeFixedDeductionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.t_employee_fixed_deduction
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.t_employee_fixed_deduction
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.t_employee_fixed_deduction
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_fixed_deduction
     *
     * @mbg.generated
     */
    public TEmployeeFixedDeductionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_fixed_deduction
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_fixed_deduction
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_fixed_deduction
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_fixed_deduction
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_fixed_deduction
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_fixed_deduction
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_fixed_deduction
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
     * This method corresponds to the database table public.t_employee_fixed_deduction
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
     * This method corresponds to the database table public.t_employee_fixed_deduction
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_employee_fixed_deduction
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
     * This class corresponds to the database table public.t_employee_fixed_deduction
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNull() {
            addCriterion("comp_id is null");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNotNull() {
            addCriterion("comp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompIdEqualTo(Integer value) {
            addCriterion("comp_id =", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotEqualTo(Integer value) {
            addCriterion("comp_id <>", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThan(Integer value) {
            addCriterion("comp_id >", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comp_id >=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThan(Integer value) {
            addCriterion("comp_id <", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThanOrEqualTo(Integer value) {
            addCriterion("comp_id <=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdIn(List<Integer> values) {
            addCriterion("comp_id in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotIn(List<Integer> values) {
            addCriterion("comp_id not in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdBetween(Integer value1, Integer value2) {
            addCriterion("comp_id between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comp_id not between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andTravelFundIsNull() {
            addCriterion("travel_fund is null");
            return (Criteria) this;
        }

        public Criteria andTravelFundIsNotNull() {
            addCriterion("travel_fund is not null");
            return (Criteria) this;
        }

        public Criteria andTravelFundEqualTo(Integer value) {
            addCriterion("travel_fund =", value, "travelFund");
            return (Criteria) this;
        }

        public Criteria andTravelFundNotEqualTo(Integer value) {
            addCriterion("travel_fund <>", value, "travelFund");
            return (Criteria) this;
        }

        public Criteria andTravelFundGreaterThan(Integer value) {
            addCriterion("travel_fund >", value, "travelFund");
            return (Criteria) this;
        }

        public Criteria andTravelFundGreaterThanOrEqualTo(Integer value) {
            addCriterion("travel_fund >=", value, "travelFund");
            return (Criteria) this;
        }

        public Criteria andTravelFundLessThan(Integer value) {
            addCriterion("travel_fund <", value, "travelFund");
            return (Criteria) this;
        }

        public Criteria andTravelFundLessThanOrEqualTo(Integer value) {
            addCriterion("travel_fund <=", value, "travelFund");
            return (Criteria) this;
        }

        public Criteria andTravelFundIn(List<Integer> values) {
            addCriterion("travel_fund in", values, "travelFund");
            return (Criteria) this;
        }

        public Criteria andTravelFundNotIn(List<Integer> values) {
            addCriterion("travel_fund not in", values, "travelFund");
            return (Criteria) this;
        }

        public Criteria andTravelFundBetween(Integer value1, Integer value2) {
            addCriterion("travel_fund between", value1, value2, "travelFund");
            return (Criteria) this;
        }

        public Criteria andTravelFundNotBetween(Integer value1, Integer value2) {
            addCriterion("travel_fund not between", value1, value2, "travelFund");
            return (Criteria) this;
        }

        public Criteria andRepaymentBorrowingsIsNull() {
            addCriterion("repayment_borrowings is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentBorrowingsIsNotNull() {
            addCriterion("repayment_borrowings is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentBorrowingsEqualTo(Integer value) {
            addCriterion("repayment_borrowings =", value, "repaymentBorrowings");
            return (Criteria) this;
        }

        public Criteria andRepaymentBorrowingsNotEqualTo(Integer value) {
            addCriterion("repayment_borrowings <>", value, "repaymentBorrowings");
            return (Criteria) this;
        }

        public Criteria andRepaymentBorrowingsGreaterThan(Integer value) {
            addCriterion("repayment_borrowings >", value, "repaymentBorrowings");
            return (Criteria) this;
        }

        public Criteria andRepaymentBorrowingsGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_borrowings >=", value, "repaymentBorrowings");
            return (Criteria) this;
        }

        public Criteria andRepaymentBorrowingsLessThan(Integer value) {
            addCriterion("repayment_borrowings <", value, "repaymentBorrowings");
            return (Criteria) this;
        }

        public Criteria andRepaymentBorrowingsLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_borrowings <=", value, "repaymentBorrowings");
            return (Criteria) this;
        }

        public Criteria andRepaymentBorrowingsIn(List<Integer> values) {
            addCriterion("repayment_borrowings in", values, "repaymentBorrowings");
            return (Criteria) this;
        }

        public Criteria andRepaymentBorrowingsNotIn(List<Integer> values) {
            addCriterion("repayment_borrowings not in", values, "repaymentBorrowings");
            return (Criteria) this;
        }

        public Criteria andRepaymentBorrowingsBetween(Integer value1, Integer value2) {
            addCriterion("repayment_borrowings between", value1, value2, "repaymentBorrowings");
            return (Criteria) this;
        }

        public Criteria andRepaymentBorrowingsNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_borrowings not between", value1, value2, "repaymentBorrowings");
            return (Criteria) this;
        }

        public Criteria andYearendDeductionIsNull() {
            addCriterion("yearend_deduction is null");
            return (Criteria) this;
        }

        public Criteria andYearendDeductionIsNotNull() {
            addCriterion("yearend_deduction is not null");
            return (Criteria) this;
        }

        public Criteria andYearendDeductionEqualTo(Integer value) {
            addCriterion("yearend_deduction =", value, "yearendDeduction");
            return (Criteria) this;
        }

        public Criteria andYearendDeductionNotEqualTo(Integer value) {
            addCriterion("yearend_deduction <>", value, "yearendDeduction");
            return (Criteria) this;
        }

        public Criteria andYearendDeductionGreaterThan(Integer value) {
            addCriterion("yearend_deduction >", value, "yearendDeduction");
            return (Criteria) this;
        }

        public Criteria andYearendDeductionGreaterThanOrEqualTo(Integer value) {
            addCriterion("yearend_deduction >=", value, "yearendDeduction");
            return (Criteria) this;
        }

        public Criteria andYearendDeductionLessThan(Integer value) {
            addCriterion("yearend_deduction <", value, "yearendDeduction");
            return (Criteria) this;
        }

        public Criteria andYearendDeductionLessThanOrEqualTo(Integer value) {
            addCriterion("yearend_deduction <=", value, "yearendDeduction");
            return (Criteria) this;
        }

        public Criteria andYearendDeductionIn(List<Integer> values) {
            addCriterion("yearend_deduction in", values, "yearendDeduction");
            return (Criteria) this;
        }

        public Criteria andYearendDeductionNotIn(List<Integer> values) {
            addCriterion("yearend_deduction not in", values, "yearendDeduction");
            return (Criteria) this;
        }

        public Criteria andYearendDeductionBetween(Integer value1, Integer value2) {
            addCriterion("yearend_deduction between", value1, value2, "yearendDeduction");
            return (Criteria) this;
        }

        public Criteria andYearendDeductionNotBetween(Integer value1, Integer value2) {
            addCriterion("yearend_deduction not between", value1, value2, "yearendDeduction");
            return (Criteria) this;
        }

        public Criteria andRentDeductionIsNull() {
            addCriterion("rent_deduction is null");
            return (Criteria) this;
        }

        public Criteria andRentDeductionIsNotNull() {
            addCriterion("rent_deduction is not null");
            return (Criteria) this;
        }

        public Criteria andRentDeductionEqualTo(Integer value) {
            addCriterion("rent_deduction =", value, "rentDeduction");
            return (Criteria) this;
        }

        public Criteria andRentDeductionNotEqualTo(Integer value) {
            addCriterion("rent_deduction <>", value, "rentDeduction");
            return (Criteria) this;
        }

        public Criteria andRentDeductionGreaterThan(Integer value) {
            addCriterion("rent_deduction >", value, "rentDeduction");
            return (Criteria) this;
        }

        public Criteria andRentDeductionGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent_deduction >=", value, "rentDeduction");
            return (Criteria) this;
        }

        public Criteria andRentDeductionLessThan(Integer value) {
            addCriterion("rent_deduction <", value, "rentDeduction");
            return (Criteria) this;
        }

        public Criteria andRentDeductionLessThanOrEqualTo(Integer value) {
            addCriterion("rent_deduction <=", value, "rentDeduction");
            return (Criteria) this;
        }

        public Criteria andRentDeductionIn(List<Integer> values) {
            addCriterion("rent_deduction in", values, "rentDeduction");
            return (Criteria) this;
        }

        public Criteria andRentDeductionNotIn(List<Integer> values) {
            addCriterion("rent_deduction not in", values, "rentDeduction");
            return (Criteria) this;
        }

        public Criteria andRentDeductionBetween(Integer value1, Integer value2) {
            addCriterion("rent_deduction between", value1, value2, "rentDeduction");
            return (Criteria) this;
        }

        public Criteria andRentDeductionNotBetween(Integer value1, Integer value2) {
            addCriterion("rent_deduction not between", value1, value2, "rentDeduction");
            return (Criteria) this;
        }

        public Criteria andOtherDeductionIsNull() {
            addCriterion("other_deduction is null");
            return (Criteria) this;
        }

        public Criteria andOtherDeductionIsNotNull() {
            addCriterion("other_deduction is not null");
            return (Criteria) this;
        }

        public Criteria andOtherDeductionEqualTo(Integer value) {
            addCriterion("other_deduction =", value, "otherDeduction");
            return (Criteria) this;
        }

        public Criteria andOtherDeductionNotEqualTo(Integer value) {
            addCriterion("other_deduction <>", value, "otherDeduction");
            return (Criteria) this;
        }

        public Criteria andOtherDeductionGreaterThan(Integer value) {
            addCriterion("other_deduction >", value, "otherDeduction");
            return (Criteria) this;
        }

        public Criteria andOtherDeductionGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_deduction >=", value, "otherDeduction");
            return (Criteria) this;
        }

        public Criteria andOtherDeductionLessThan(Integer value) {
            addCriterion("other_deduction <", value, "otherDeduction");
            return (Criteria) this;
        }

        public Criteria andOtherDeductionLessThanOrEqualTo(Integer value) {
            addCriterion("other_deduction <=", value, "otherDeduction");
            return (Criteria) this;
        }

        public Criteria andOtherDeductionIn(List<Integer> values) {
            addCriterion("other_deduction in", values, "otherDeduction");
            return (Criteria) this;
        }

        public Criteria andOtherDeductionNotIn(List<Integer> values) {
            addCriterion("other_deduction not in", values, "otherDeduction");
            return (Criteria) this;
        }

        public Criteria andOtherDeductionBetween(Integer value1, Integer value2) {
            addCriterion("other_deduction between", value1, value2, "otherDeduction");
            return (Criteria) this;
        }

        public Criteria andOtherDeductionNotBetween(Integer value1, Integer value2) {
            addCriterion("other_deduction not between", value1, value2, "otherDeduction");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNull() {
            addCriterion("delete_flg is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNotNull() {
            addCriterion("delete_flg is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgEqualTo(Boolean value) {
            addCriterion("delete_flg =", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotEqualTo(Boolean value) {
            addCriterion("delete_flg <>", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThan(Boolean value) {
            addCriterion("delete_flg >", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delete_flg >=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThan(Boolean value) {
            addCriterion("delete_flg <", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThanOrEqualTo(Boolean value) {
            addCriterion("delete_flg <=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIn(List<Boolean> values) {
            addCriterion("delete_flg in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotIn(List<Boolean> values) {
            addCriterion("delete_flg not in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flg between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flg not between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andRegistDateIsNull() {
            addCriterion("regist_date is null");
            return (Criteria) this;
        }

        public Criteria andRegistDateIsNotNull() {
            addCriterion("regist_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegistDateEqualTo(Date value) {
            addCriterion("regist_date =", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateNotEqualTo(Date value) {
            addCriterion("regist_date <>", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateGreaterThan(Date value) {
            addCriterion("regist_date >", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateGreaterThanOrEqualTo(Date value) {
            addCriterion("regist_date >=", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateLessThan(Date value) {
            addCriterion("regist_date <", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateLessThanOrEqualTo(Date value) {
            addCriterion("regist_date <=", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateIn(List<Date> values) {
            addCriterion("regist_date in", values, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateNotIn(List<Date> values) {
            addCriterion("regist_date not in", values, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateBetween(Date value1, Date value2) {
            addCriterion("regist_date between", value1, value2, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateNotBetween(Date value1, Date value2) {
            addCriterion("regist_date not between", value1, value2, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistIdIsNull() {
            addCriterion("regist_id is null");
            return (Criteria) this;
        }

        public Criteria andRegistIdIsNotNull() {
            addCriterion("regist_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegistIdEqualTo(Integer value) {
            addCriterion("regist_id =", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdNotEqualTo(Integer value) {
            addCriterion("regist_id <>", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdGreaterThan(Integer value) {
            addCriterion("regist_id >", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("regist_id >=", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdLessThan(Integer value) {
            addCriterion("regist_id <", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdLessThanOrEqualTo(Integer value) {
            addCriterion("regist_id <=", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdIn(List<Integer> values) {
            addCriterion("regist_id in", values, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdNotIn(List<Integer> values) {
            addCriterion("regist_id not in", values, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdBetween(Integer value1, Integer value2) {
            addCriterion("regist_id between", value1, value2, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("regist_id not between", value1, value2, "registId");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Integer value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Integer value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Integer value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Integer value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Integer> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Integer> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Integer value1, Integer value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.t_employee_fixed_deduction
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
     * This class corresponds to the database table public.t_employee_fixed_deduction
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