package cn.itcast.domain;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/10$ 21:26$
 * @Version: 1.0
 */

public class ErroInfo {
private Boolean flags = true;
private String Errmsg;

    @Override
    public String toString() {
        return "ErroInfo{" +
                "flags=" + flags +
                ", Errmsg='" + Errmsg + '\'' +
                '}';
    }

    public Boolean getFlags() {
        return flags;
    }

    public void setFlags(Boolean flags) {
        this.flags = flags;
    }

    public String getErrmsg() {
        return Errmsg;
    }

    public void setErrmsg(String errmsg) {
        Errmsg = errmsg;
    }
}
