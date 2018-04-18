package cn.a52going.coderpc.plugin.exception;

public class ValidExcepiton extends Exception {
    private static final long serialVersionUID = 1L;
    private String errorMsg;
    private Class<?> clazz;
    private Exception cause;

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ValidExcepiton() {
    }

    public ValidExcepiton(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Class<?> getClazz() {
        return this.clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Exception getCause() {
        return this.cause;
    }

    public void setCause(Exception cause) {
        this.cause = cause;
    }
}
