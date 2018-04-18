package cn.a52going.common;

import java.io.Serializable;

public class Result implements Serializable{
	/** 序列化ID */
	private static final long serialVersionUID = 1L;
	
    public boolean success;

    public int errCode;

    public String errMessage;

    public Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
