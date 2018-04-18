package cn.a52going.coderpc.commonDto.resp;

import java.io.Serializable;

public class ResultDTO<T extends Serializable> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * errorCode 为 0表示无错误，处理成功
     * ，可以直接<code>isSuccess()</code>来判断是否成功，
     * 默认为errorCode = 0 即默认为成功
     * 出错时一定请setErrorCode 使ErrorCode不为0
     * errorMsg为可选项目，是errorCode的对照值
     */
    private Integer errorCode = 0;

    /**
     * errorMsg为可选项目，是errorCode的对照值
     */
    private String errorMsg;


    //返回
    private T returnObj;


    //原始异常
    private Throwable cause;



    public ResultDTO() {

    }
    /**
     * errorCode 为 0表示无错误，处理成功
     * ，可以直接<code>isSuccess()</code>来判断是否成功，
     * 默认为errorCode = 0 即默认为成功
     * 出错时一定请setErrorCode 使ErrorCode不为0
     * errorMsg为可选项目，是errorCode的对照值
     */
    public ResultDTO(int errorCode,String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    /**
     *
     * <p>Title: </p>
     * <p>Description: </p>
     * @param errorCode  errorCode 为 0表示无错误，处理成功,可以直接<code>isSuccess()</code>来判断是否成功，
     * @param errorMsg    errorMsg为可选项目，是errorCode的对照值
     * @param cause 原始异常，如果有请设置，以便于给开发人员更好的定位及合理处理
     */
    public ResultDTO(int errorCode,String errorMsg,Throwable cause) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.cause = cause;
    }


    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public boolean isSuccess(){
        return errorCode == 0;
    }

    public T getReturnObj() {
        return returnObj;
    }
    public void setReturnObj(T returnObj) {
        this.returnObj = returnObj;
    }


    public Throwable getCause() {
        return cause;
    }
    public void setCause(Throwable cause) {
        this.cause = cause;
    }
    @Override
    public String toString() {
        String msg = "errorCode:"+errorCode;
        if(errorMsg!=null){
            msg+=",errorMsg:"+errorMsg;
        }
        if(returnObj!=null){
            msg+=",returnObj:"+returnObj;
        }
        return msg;
    }
}
