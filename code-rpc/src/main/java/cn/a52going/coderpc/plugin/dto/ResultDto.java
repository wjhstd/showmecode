package cn.a52going.coderpc.plugin.dto;

public class ResultDto<T> {
    private boolean success = true;
    private Integer errorCode = Integer.valueOf(0);
    private String errorMsg;
    private T paramObj;

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ResultDto(boolean success) {
        this.success = success;
        if (success) {
            this.errorCode = Integer.valueOf(0);
        }

    }

    public T getParamObj() {
        return this.paramObj;
    }

    public void setParamObj(T paramObj) {
        this.paramObj = paramObj;
    }

    public ResultDto(boolean success, String errorMsg) {
        this.success = success;
        this.errorMsg = errorMsg;
    }

    public ResultDto(int errorCode) {
        this.success = false;
        this.errorCode = errorCode;
    }

    public ResultDto(int errorCode, String errorMsg) {
        this.success = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ResultDto(String errorMsg) {
        this.success = false;
        this.errorMsg = errorMsg;
    }

    public ResultDto() {
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        if (errorCode.intValue() != 0) {
            this.success = false;
        }

    }
}