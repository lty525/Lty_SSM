package cn.itcast.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrdernumIsNull() {
            addCriterion("ORDERNUM is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("ORDERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(String value) {
            addCriterion("ORDERNUM =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(String value) {
            addCriterion("ORDERNUM <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(String value) {
            addCriterion("ORDERNUM >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERNUM >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(String value) {
            addCriterion("ORDERNUM <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(String value) {
            addCriterion("ORDERNUM <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLike(String value) {
            addCriterion("ORDERNUM like", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotLike(String value) {
            addCriterion("ORDERNUM not like", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<String> values) {
            addCriterion("ORDERNUM in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<String> values) {
            addCriterion("ORDERNUM not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(String value1, String value2) {
            addCriterion("ORDERNUM between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(String value1, String value2) {
            addCriterion("ORDERNUM not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("ORDERTIME is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("ORDERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(Date value) {
            addCriterion("ORDERTIME =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(Date value) {
            addCriterion("ORDERTIME <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(Date value) {
            addCriterion("ORDERTIME >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDERTIME >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(Date value) {
            addCriterion("ORDERTIME <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDERTIME <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<Date> values) {
            addCriterion("ORDERTIME in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<Date> values) {
            addCriterion("ORDERTIME not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(Date value1, Date value2) {
            addCriterion("ORDERTIME between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDERTIME not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andPeoplecountIsNull() {
            addCriterion("PEOPLECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPeoplecountIsNotNull() {
            addCriterion("PEOPLECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplecountEqualTo(BigDecimal value) {
            addCriterion("PEOPLECOUNT =", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountNotEqualTo(BigDecimal value) {
            addCriterion("PEOPLECOUNT <>", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountGreaterThan(BigDecimal value) {
            addCriterion("PEOPLECOUNT >", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PEOPLECOUNT >=", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountLessThan(BigDecimal value) {
            addCriterion("PEOPLECOUNT <", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PEOPLECOUNT <=", value, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountIn(List<BigDecimal> values) {
            addCriterion("PEOPLECOUNT in", values, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountNotIn(List<BigDecimal> values) {
            addCriterion("PEOPLECOUNT not in", values, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEOPLECOUNT between", value1, value2, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andPeoplecountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEOPLECOUNT not between", value1, value2, "peoplecount");
            return (Criteria) this;
        }

        public Criteria andOrderdescIsNull() {
            addCriterion("ORDERDESC is null");
            return (Criteria) this;
        }

        public Criteria andOrderdescIsNotNull() {
            addCriterion("ORDERDESC is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdescEqualTo(String value) {
            addCriterion("ORDERDESC =", value, "orderdesc");
            return (Criteria) this;
        }

        public Criteria andOrderdescNotEqualTo(String value) {
            addCriterion("ORDERDESC <>", value, "orderdesc");
            return (Criteria) this;
        }

        public Criteria andOrderdescGreaterThan(String value) {
            addCriterion("ORDERDESC >", value, "orderdesc");
            return (Criteria) this;
        }

        public Criteria andOrderdescGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERDESC >=", value, "orderdesc");
            return (Criteria) this;
        }

        public Criteria andOrderdescLessThan(String value) {
            addCriterion("ORDERDESC <", value, "orderdesc");
            return (Criteria) this;
        }

        public Criteria andOrderdescLessThanOrEqualTo(String value) {
            addCriterion("ORDERDESC <=", value, "orderdesc");
            return (Criteria) this;
        }

        public Criteria andOrderdescLike(String value) {
            addCriterion("ORDERDESC like", value, "orderdesc");
            return (Criteria) this;
        }

        public Criteria andOrderdescNotLike(String value) {
            addCriterion("ORDERDESC not like", value, "orderdesc");
            return (Criteria) this;
        }

        public Criteria andOrderdescIn(List<String> values) {
            addCriterion("ORDERDESC in", values, "orderdesc");
            return (Criteria) this;
        }

        public Criteria andOrderdescNotIn(List<String> values) {
            addCriterion("ORDERDESC not in", values, "orderdesc");
            return (Criteria) this;
        }

        public Criteria andOrderdescBetween(String value1, String value2) {
            addCriterion("ORDERDESC between", value1, value2, "orderdesc");
            return (Criteria) this;
        }

        public Criteria andOrderdescNotBetween(String value1, String value2) {
            addCriterion("ORDERDESC not between", value1, value2, "orderdesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(BigDecimal value) {
            addCriterion("PAYTYPE =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(BigDecimal value) {
            addCriterion("PAYTYPE <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(BigDecimal value) {
            addCriterion("PAYTYPE >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYTYPE >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(BigDecimal value) {
            addCriterion("PAYTYPE <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYTYPE <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<BigDecimal> values) {
            addCriterion("PAYTYPE in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<BigDecimal> values) {
            addCriterion("PAYTYPE not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYTYPE between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYTYPE not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("ORDERSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("ORDERSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(BigDecimal value) {
            addCriterion("ORDERSTATUS =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(BigDecimal value) {
            addCriterion("ORDERSTATUS <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(BigDecimal value) {
            addCriterion("ORDERSTATUS >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERSTATUS >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(BigDecimal value) {
            addCriterion("ORDERSTATUS <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERSTATUS <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<BigDecimal> values) {
            addCriterion("ORDERSTATUS in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<BigDecimal> values) {
            addCriterion("ORDERSTATUS not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERSTATUS between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERSTATUS not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("PRODUCTID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("PRODUCTID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("PRODUCTID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("PRODUCTID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("PRODUCTID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("PRODUCTID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("PRODUCTID like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("PRODUCTID not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("PRODUCTID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("PRODUCTID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("PRODUCTID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("PRODUCTID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("MEMBERID is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("MEMBERID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(String value) {
            addCriterion("MEMBERID =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(String value) {
            addCriterion("MEMBERID <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(String value) {
            addCriterion("MEMBERID >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBERID >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(String value) {
            addCriterion("MEMBERID <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(String value) {
            addCriterion("MEMBERID <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLike(String value) {
            addCriterion("MEMBERID like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotLike(String value) {
            addCriterion("MEMBERID not like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<String> values) {
            addCriterion("MEMBERID in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<String> values) {
            addCriterion("MEMBERID not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(String value1, String value2) {
            addCriterion("MEMBERID between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(String value1, String value2) {
            addCriterion("MEMBERID not between", value1, value2, "memberid");
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