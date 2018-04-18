package cn.a52going.coderpc.session;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginSession implements Serializable {
    private static final long serialVersionUID = 1L;
    private Date loginTime;
    private Date lastModified;
    protected Integer loginLevel = Integer.valueOf(0);

    public LoginSession() {
        Date date = new Date();
        this.loginTime = date;
        this.lastModified = date;
    }

    public Date getLoginTime() {
        return this.loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLastModified() {
        return this.lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Integer getLoginLevel() {
        return this.loginLevel;
    }

    public void setLoginLevel(Integer loginLevel) {
        this.loginLevel = loginLevel;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return this.loginTime + ":" + sdf.format(this.loginTime) + ",lastModified:" + sdf.format(this.lastModified) + ",loginLevel:" + this.loginLevel;
    }
}