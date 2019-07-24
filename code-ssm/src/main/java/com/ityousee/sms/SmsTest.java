package com.ityousee.sms;


import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.sms.SmsManager;
import com.qiniu.util.Auth;

import java.util.HashMap;
import java.util.Map;

//短信测试
public class SmsTest {

    public static void main(String[] args) {
//        https://github.com/qiniu/java-sdk/blob/master/examples/SendMessageDemo.java
        Auth auth = Auth.create("AK" , "SK");
        SmsManager smsManager = new SmsManager(auth);
        try {
            Map<String, String> map = new HashMap<String, String>();
            map.put("code", "123456");
            Response resp = smsManager.sendMessage("1153592394629779456", new String[] { "181374779","136769342" }, map);
//          Response resp = smsManager.describeSignature("passed", 0, 0);
//          Response resp = smsManager.createSignature("signature", "app",
//                  new String[] { "data:image/gif;base64,xxxxxxxxxx" });
//          Response resp = smsManager.describeTemplate("passed", 0, 0);
//          Response resp = smsManager.createTemplate("name", "template", "notification", "test", "signatureId");
//          Response resp = smsManager.modifyTemplate("templateId", "name", "template", "test", "signatureId");
//          Response resp = smsManager.modifySignature("SignatureId", "signature");
//          Response resp = smsManager.deleteSignature("signatureId");
//          Response resp = smsManager.deleteTemplate("templateId");
            System.out.println(resp.bodyString());

//          SignatureInfo sinfo = smsManager.describeSignatureItems("", 0, 0);
//          System.out.println(sinfo.getItems().get(0).getAuditStatus());
//          TemplateInfo tinfo = smsManager.describeTemplateItems("", 0, 0);
//          System.out.println(tinfo.getItems().get(0).getAuditStatus());


        } catch (QiniuException e) {
            System.out.println(e);
        }

    }

}
