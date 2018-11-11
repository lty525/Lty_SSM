package cn.itcast.domain;

import cn.itcast.untils.Dateuntils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Syslog implements Serializable {
    private String id;//日志记录id

    private Date visittime;//开始访问时间
    private String visittimeStr;//访问的时间字符串

    private String username;//访问的用户名

    private String ip;//访问的ip地址

    private String url;//访问的路径

    private Long executiontime;//访问的总时间

    private String method;//方法的方法名

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getVisittime() {
        return visittime;
    }

    public void setVisittime(Date visittime) {
        this.visittime = visittime;
    }

    public String getVisittimeStr() {
        if (visittime!=null){
            visittimeStr = Dateuntils.date2String(visittime,"yyyy-MM-dd HH:mm:ss");
        }
        return visittimeStr;
    }

    public void setVisittimeStr(String visittimeStr) {
        this.visittimeStr = visittimeStr;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getExecutiontime() {
        return executiontime;
    }

    public void setExecutiontime(Long executiontime) {
        this.executiontime = executiontime;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Syslog{" +
                "id='" + id + '\'' +
                ", visittime=" + visittime +
                ", visittimeStr='" + visittimeStr + '\'' +
                ", username='" + username + '\'' +
                ", ip='" + ip + '\'' +
                ", url='" + url + '\'' +
                ", executiontime=" + executiontime +
                ", method='" + method + '\'' +
                '}';
    }
}