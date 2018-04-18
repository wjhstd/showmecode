package cn.a52going.coderpc.plugin.dtoutils;

import cn.a52going.coderpc.plugin.exception.ValidExcepiton;

public class ValidResult {
    private boolean success = true;
    private String errorMsg = null;
    private ValidExcepiton exception = null;

    public ValidResult() {
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ValidResult setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        this.success = false;
        return this;
    }

    public ValidExcepiton getException() {
        return this.exception;
    }

    public ValidResult setException(ValidExcepiton exception) {
        this.exception = exception;
        this.success = false;
        return this;
    }

    public String toString() {
        return this.success ? "success:" + this.success : "success:" + this.success + ",errorMsg:" + this.errorMsg;
    }
}
