package com.rstech.wordwatch.dao;

import java.util.ArrayList;
import java.util.List;

public class WordReportEntryAuxExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    public WordReportEntryAuxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
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
     * This method corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(Long value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Long value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Long value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Long value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Long> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Long> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andWD_REPORT_ENTRYIsNull() {
            addCriterion("WD_REPORT_ENTRY is null");
            return (Criteria) this;
        }

        public Criteria andWD_REPORT_ENTRYIsNotNull() {
            addCriterion("WD_REPORT_ENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andWD_REPORT_ENTRYEqualTo(Long value) {
            addCriterion("WD_REPORT_ENTRY =", value, "WD_REPORT_ENTRY");
            return (Criteria) this;
        }

        public Criteria andWD_REPORT_ENTRYNotEqualTo(Long value) {
            addCriterion("WD_REPORT_ENTRY <>", value, "WD_REPORT_ENTRY");
            return (Criteria) this;
        }

        public Criteria andWD_REPORT_ENTRYGreaterThan(Long value) {
            addCriterion("WD_REPORT_ENTRY >", value, "WD_REPORT_ENTRY");
            return (Criteria) this;
        }

        public Criteria andWD_REPORT_ENTRYGreaterThanOrEqualTo(Long value) {
            addCriterion("WD_REPORT_ENTRY >=", value, "WD_REPORT_ENTRY");
            return (Criteria) this;
        }

        public Criteria andWD_REPORT_ENTRYLessThan(Long value) {
            addCriterion("WD_REPORT_ENTRY <", value, "WD_REPORT_ENTRY");
            return (Criteria) this;
        }

        public Criteria andWD_REPORT_ENTRYLessThanOrEqualTo(Long value) {
            addCriterion("WD_REPORT_ENTRY <=", value, "WD_REPORT_ENTRY");
            return (Criteria) this;
        }

        public Criteria andWD_REPORT_ENTRYIn(List<Long> values) {
            addCriterion("WD_REPORT_ENTRY in", values, "WD_REPORT_ENTRY");
            return (Criteria) this;
        }

        public Criteria andWD_REPORT_ENTRYNotIn(List<Long> values) {
            addCriterion("WD_REPORT_ENTRY not in", values, "WD_REPORT_ENTRY");
            return (Criteria) this;
        }

        public Criteria andWD_REPORT_ENTRYBetween(Long value1, Long value2) {
            addCriterion("WD_REPORT_ENTRY between", value1, value2, "WD_REPORT_ENTRY");
            return (Criteria) this;
        }

        public Criteria andWD_REPORT_ENTRYNotBetween(Long value1, Long value2) {
            addCriterion("WD_REPORT_ENTRY not between", value1, value2, "WD_REPORT_ENTRY");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYIsNull() {
            addCriterion("AUX_KEY is null");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYIsNotNull() {
            addCriterion("AUX_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYEqualTo(String value) {
            addCriterion("AUX_KEY =", value, "AUX_KEY");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYNotEqualTo(String value) {
            addCriterion("AUX_KEY <>", value, "AUX_KEY");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYGreaterThan(String value) {
            addCriterion("AUX_KEY >", value, "AUX_KEY");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYGreaterThanOrEqualTo(String value) {
            addCriterion("AUX_KEY >=", value, "AUX_KEY");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYLessThan(String value) {
            addCriterion("AUX_KEY <", value, "AUX_KEY");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYLessThanOrEqualTo(String value) {
            addCriterion("AUX_KEY <=", value, "AUX_KEY");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYLike(String value) {
            addCriterion("AUX_KEY like", value, "AUX_KEY");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYNotLike(String value) {
            addCriterion("AUX_KEY not like", value, "AUX_KEY");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYIn(List<String> values) {
            addCriterion("AUX_KEY in", values, "AUX_KEY");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYNotIn(List<String> values) {
            addCriterion("AUX_KEY not in", values, "AUX_KEY");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYBetween(String value1, String value2) {
            addCriterion("AUX_KEY between", value1, value2, "AUX_KEY");
            return (Criteria) this;
        }

        public Criteria andAUX_KEYNotBetween(String value1, String value2) {
            addCriterion("AUX_KEY not between", value1, value2, "AUX_KEY");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUEIsNull() {
            addCriterion("AUX_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUEIsNotNull() {
            addCriterion("AUX_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUEEqualTo(String value) {
            addCriterion("AUX_VALUE =", value, "AUX_VALUE");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUENotEqualTo(String value) {
            addCriterion("AUX_VALUE <>", value, "AUX_VALUE");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUEGreaterThan(String value) {
            addCriterion("AUX_VALUE >", value, "AUX_VALUE");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUEGreaterThanOrEqualTo(String value) {
            addCriterion("AUX_VALUE >=", value, "AUX_VALUE");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUELessThan(String value) {
            addCriterion("AUX_VALUE <", value, "AUX_VALUE");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUELessThanOrEqualTo(String value) {
            addCriterion("AUX_VALUE <=", value, "AUX_VALUE");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUELike(String value) {
            addCriterion("AUX_VALUE like", value, "AUX_VALUE");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUENotLike(String value) {
            addCriterion("AUX_VALUE not like", value, "AUX_VALUE");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUEIn(List<String> values) {
            addCriterion("AUX_VALUE in", values, "AUX_VALUE");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUENotIn(List<String> values) {
            addCriterion("AUX_VALUE not in", values, "AUX_VALUE");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUEBetween(String value1, String value2) {
            addCriterion("AUX_VALUE between", value1, value2, "AUX_VALUE");
            return (Criteria) this;
        }

        public Criteria andAUX_VALUENotBetween(String value1, String value2) {
            addCriterion("AUX_VALUE not between", value1, value2, "AUX_VALUE");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated do_not_delete_during_merge Wed Oct 21 20:19:24 EDT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wd_report_entry_aux
     *
     * @mbggenerated Wed Oct 21 20:19:24 EDT 2015
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