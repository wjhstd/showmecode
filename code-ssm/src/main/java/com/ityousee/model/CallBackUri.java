package com.ityousee.model;

public class CallBackUri {
    
    private String uriType;
    
    private String callBackUri;
    
    public String getCallBackUri () {
        
        return callBackUri;
    }
    
    public void setCallBackUri (String callBackUri) {
        
        this.callBackUri = callBackUri;
    }
    
    public String getUriType () {
        
        return uriType;
    }
    
    public void setUriType (String uriType) {
        
        this.uriType = uriType;
    }
}
