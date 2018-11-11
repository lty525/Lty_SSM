package cn.itcast.domain;

import java.io.Serializable;

public class OrderTravellerKey implements Serializable {
    private String orderid;

    private String travellerid;

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getTravellerid() {
        return travellerid;
    }

    public void setTravellerid(String travellerid) {
        this.travellerid = travellerid == null ? null : travellerid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", travellerid=").append(travellerid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}