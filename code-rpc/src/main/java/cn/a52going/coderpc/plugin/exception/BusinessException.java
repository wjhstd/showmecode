package cn.a52going.coderpc.plugin.exception;

import java.io.Serializable;
/**
 *@ClassName: BusinessException
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/13 14:53
 **/


public class BusinessException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;
    private int errorCode;
    private String errorMsg;
    private Throwable cause;

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }

    public BusinessException() {
    }

    public BusinessException(Throwable cause) {
        this.cause = cause;
    }

    public BusinessException(int errorCode, String errorMsg, Throwable cause) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.cause = cause;
    }
}