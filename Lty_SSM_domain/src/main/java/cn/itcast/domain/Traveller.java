package cn.itcast.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Traveller implements Serializable {
    private String id;

    private String name;

    private String sex;

    private String phonenum;

    private Integer credentialstype;
    private String credentialstypeStr;

    private String credentialsnum;

    private Integer travellertype;
    private String travellertypeStr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public Integer getCredentialstype() {
        return credentialstype;
    }

    public void setCredentialstype(Integer credentialstype) {
        this.credentialstype = credentialstype;
    }

    public String getCredentialstypeStr() {
        if (credentialstype!=null){
            if (credentialstype==0){
                credentialstypeStr="身份证";
            }if (credentialstype==1){
                credentialstypeStr="护照";
            }if (credentialstype==2){
                credentialstypeStr="其它";
            }
        }
        return credentialstypeStr;
    }

    public void setCredentialstypeStr(String credentialstypeStr) {
        this.credentialstypeStr = credentialstypeStr;
    }

    public String getCredentialsnum() {
        return credentialsnum;
    }

    public void setCredentialsnum(String credentialsnum) {
        this.credentialsnum = credentialsnum;
    }

    public Integer getTravellertype() {
        return travellertype;
    }

    public void setTravellertype(Integer travellertype) {
        this.travellertype = travellertype;
    }

    public String getTravellertypeStr() {
        return travellertypeStr;
    }

    public void setTravellertypeStr(String travellertypeStr) {
        this.travellertypeStr = travellertypeStr;
    }

    @Override
    public String toString() {
        return "Traveller{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", credentialstype=" + credentialstype +
                ", credentialstypeStr='" + credentialstypeStr + '\'' +
                ", credentialsnum='" + credentialsnum + '\'' +
                ", travellertype=" + travellertype +
                ", travellertypeStr='" + travellertypeStr + '\'' +
                '}';
    }

    private static final long serialVersionUID = 1L;

}