package cn.itcast.domain;

import cn.itcast.untils.Dateuntils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Orders implements Serializable {
    private String id;

    private String ordernum;

    private Date ordertime;
    private String ordertimeStr;

    private Integer peoplecount;

    private String orderdesc;

    private Integer paytype;
    private String paytypeStr;

    private Integer orderstatus;
    private String orderstatusStr;

    private Member member;
    private List<Traveller> travellers;
    private String productid;
    private Product product;

    public String getPaytypeStr() {
        if (paytype!=null){
            if (paytype==0){
                paytypeStr="微信";
            }
            if (paytype==1){
                paytypeStr="支付宝";
            }
            if (paytype==2){
                paytypeStr="其它";
            }
        }
        return paytypeStr;
    }

    public void setPaytypeStr(String paytypeStr) {
        this.paytypeStr = paytypeStr;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<Traveller> getTravellers() {
        return travellers;
    }

    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }

    private String memberid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getOrdertimeStr() {
        if (ordertime!=null){
            ordertimeStr = Dateuntils.date2String(ordertime,"yyyy-MM-dd HH:mm:ss");
        }
        return ordertimeStr;
    }

    public void setOrdertimeStr(String ordertimeStr) {
        this.ordertimeStr = ordertimeStr;
    }

    public Integer getPeoplecount() {
        return peoplecount;
    }

    public void setPeoplecount(Integer peoplecount) {
        this.peoplecount = peoplecount;
    }

    public String getOrderdesc() {
        return orderdesc;
    }

    public void setOrderdesc(String orderdesc) {
        this.orderdesc = orderdesc;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getOrderstatusStr() {
        if (orderstatus!=null){
            if (orderstatus==0){
                orderstatusStr="未支付";
            }
            if (orderstatus==1){
                orderstatusStr="已支付";
            }
        }

        return orderstatusStr;
    }

    public void setOrderstatusStr(String orderstatusStr) {
        this.orderstatusStr = orderstatusStr;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                ", ordernum='" + ordernum + '\'' +
                ", ordertime=" + ordertime +
                ", ordertimeStr='" + ordertimeStr + '\'' +
                ", peoplecount=" + peoplecount +
                ", orderdesc='" + orderdesc + '\'' +
                ", paytype=" + paytype +
                ", orderstatus=" + orderstatus +
                ", orderstatusStr='" + orderstatusStr + '\'' +
                ", productid='" + productid + '\'' +
                ", product=" + product +
                ", memberid='" + memberid + '\'' +
                '}';
    }
}