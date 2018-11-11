package cn.itcast.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNull() {
            addCriterion("PRODUCTNUM is null");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNotNull() {
            addCriterion("PRODUCTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumEqualTo(String value) {
            addCriterion("PRODUCTNUM =", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotEqualTo(String value) {
            addCriterion("PRODUCTNUM <>", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThan(String value) {
            addCriterion("PRODUCTNUM >", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTNUM >=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThan(String value) {
            addCriterion("PRODUCTNUM <", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTNUM <=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLike(String value) {
            addCriterion("PRODUCTNUM like", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotLike(String value) {
            addCriterion("PRODUCTNUM not like", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumIn(List<String> values) {
            addCriterion("PRODUCTNUM in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotIn(List<String> values) {
            addCriterion("PRODUCTNUM not in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumBetween(String value1, String value2) {
            addCriterion("PRODUCTNUM between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotBetween(String value1, String value2) {
            addCriterion("PRODUCTNUM not between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("PRODUCTNAME is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("PRODUCTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("PRODUCTNAME =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("PRODUCTNAME <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("PRODUCTNAME >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTNAME >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("PRODUCTNAME <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTNAME <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("PRODUCTNAME like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("PRODUCTNAME not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("PRODUCTNAME in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("PRODUCTNAME not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("PRODUCTNAME between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("PRODUCTNAME not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("CITYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("CITYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("CITYNAME =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("CITYNAME <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("CITYNAME >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("CITYNAME >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("CITYNAME <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("CITYNAME <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("CITYNAME like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("CITYNAME not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("CITYNAME in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("CITYNAME not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("CITYNAME between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("CITYNAME not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeIsNull() {
            addCriterion("DEPARTURETIME is null");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeIsNotNull() {
            addCriterion("DEPARTURETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeEqualTo(Date value) {
            addCriterion("DEPARTURETIME =", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeNotEqualTo(Date value) {
            addCriterion("DEPARTURETIME <>", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeGreaterThan(Date value) {
            addCriterion("DEPARTURETIME >", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DEPARTURETIME >=", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeLessThan(Date value) {
            addCriterion("DEPARTURETIME <", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeLessThanOrEqualTo(Date value) {
            addCriterion("DEPARTURETIME <=", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeIn(List<Date> values) {
            addCriterion("DEPARTURETIME in", values, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeNotIn(List<Date> values) {
            addCriterion("DEPARTURETIME not in", values, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeBetween(Date value1, Date value2) {
            addCriterion("DEPARTURETIME between", value1, value2, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeNotBetween(Date value1, Date value2) {
            addCriterion("DEPARTURETIME not between", value1, value2, "departuretime");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNull() {
            addCriterion("PRODUCTPRICE is null");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNotNull() {
            addCriterion("PRODUCTPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProductpriceEqualTo(BigDecimal value) {
            addCriterion("PRODUCTPRICE =", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCTPRICE <>", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThan(BigDecimal value) {
            addCriterion("PRODUCTPRICE >", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCTPRICE >=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThan(BigDecimal value) {
            addCriterion("PRODUCTPRICE <", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCTPRICE <=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceIn(List<BigDecimal> values) {
            addCriterion("PRODUCTPRICE in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCTPRICE not in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCTPRICE between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCTPRICE not between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductdescIsNull() {
            addCriterion("PRODUCTDESC is null");
            return (Criteria) this;
        }

        public Criteria andProductdescIsNotNull() {
            addCriterion("PRODUCTDESC is not null");
            return (Criteria) this;
        }

        public Criteria andProductdescEqualTo(String value) {
            addCriterion("PRODUCTDESC =", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotEqualTo(String value) {
            addCriterion("PRODUCTDESC <>", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescGreaterThan(String value) {
            addCriterion("PRODUCTDESC >", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTDESC >=", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescLessThan(String value) {
            addCriterion("PRODUCTDESC <", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTDESC <=", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescLike(String value) {
            addCriterion("PRODUCTDESC like", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotLike(String value) {
            addCriterion("PRODUCTDESC not like", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescIn(List<String> values) {
            addCriterion("PRODUCTDESC in", values, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotIn(List<String> values) {
            addCriterion("PRODUCTDESC not in", values, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescBetween(String value1, String value2) {
            addCriterion("PRODUCTDESC between", value1, value2, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotBetween(String value1, String value2) {
            addCriterion("PRODUCTDESC not between", value1, value2, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductstatusIsNull() {
            addCriterion("PRODUCTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andProductstatusIsNotNull() {
            addCriterion("PRODUCTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProductstatusEqualTo(Integer value) {
            addCriterion("PRODUCTSTATUS =", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotEqualTo(Integer value) {
            addCriterion("PRODUCTSTATUS <>", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusGreaterThan(Integer value) {
            addCriterion("PRODUCTSTATUS >", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCTSTATUS >=", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusLessThan(Integer value) {
            addCriterion("PRODUCTSTATUS <", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCTSTATUS <=", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusIn(List<Integer> values) {
            addCriterion("PRODUCTSTATUS in", values, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotIn(List<Integer> values) {
            addCriterion("PRODUCTSTATUS not in", values, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCTSTATUS between", value1, value2, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCTSTATUS not between", value1, value2, "productstatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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