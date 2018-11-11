package cn.itcast.domain;

import cn.itcast.untils.Dateuntils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 产品的信息
 */
public class Product implements Serializable {
    private String id;//主键

    private String productnum;//产品编号 唯一

    private String productname;//产品名

    private String cityname;//出发城市

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date departuretime;//出发时间
    private String departuretimeStr;

    private Double productprice;//产品价格

    private String productdesc;//产品描述

    private Integer productstatus;//产品状态
     private String productstatusStr;


    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductnum() {
        return productnum;
    }

    public void setProductnum(String productnum) {
        this.productnum = productnum;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Date getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Date departuretime) {
        this.departuretime = departuretime;
    }

    public String getDeparturetimeStr() {
        if (departuretime!=null){
            departuretimeStr = Dateuntils.date2String(departuretime,"yyyy-MM-dd HH:mm:ss");
        }
        return departuretimeStr;
    }

    public void setDeparturetimeStr(String departuretimeStr) {
        this.departuretimeStr = departuretimeStr;
    }

    public Double getProductprice() {
        return productprice;
    }

    public void setProductprice(Double productprice) {
        this.productprice = productprice;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }

    public Integer getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(Integer productstatus) {
        this.productstatus = productstatus;
    }

    public String getProductstatusStr() {
        if (productstatus!=null){
            if (productstatus==0){
                productstatusStr="关闭";
            }
            if (productstatus==1){
                productstatusStr="开启";
            }
        }
        return productstatusStr;
    }

    public void setProductstatusStr(String productstatusStr) {
        this.productstatusStr = productstatusStr;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productnum='" + productnum + '\'' +
                ", productname='" + productname + '\'' +
                ", cityname='" + cityname + '\'' +
                ", departuretime=" + departuretime +
                ", departuretimeStr='" + departuretimeStr + '\'' +
                ", productprice=" + productprice +
                ", productdesc='" + productdesc + '\'' +
                ", productstatus=" + productstatus +
                ", productstatusStr='" + productstatusStr + '\'' +
                '}';
    }
}