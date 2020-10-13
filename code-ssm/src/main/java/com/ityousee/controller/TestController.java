package com.ityousee.controller;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.ityousee.model.CallBackUri;
import com.ityousee.util.GetUTCTimeUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    @RequestMapping(value = "/dsmTokens", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ResponseEntity<String> getPimToken (@RequestBody String json, HttpServletRequest request) {
    
        request.getHeaderNames();
        Gson gson = new Gson();
        Map map = new HashMap();
        try {
            map.put("token", "1234567fdfg");
            map.put("issuedAt", GetUTCTimeUtil.getUTCTimeStr(new Date()));
            map.put("expiredAt", GetUTCTimeUtil.getUTCTimeStr(new Date(System.currentTimeMillis() + 1000 *60 *5)));
            CallBackUri callBackUri = new CallBackUri();
            callBackUri.setUriType("dsmCm");
            callBackUri.setCallBackUri("192.168.11.11/dsmCm");
            CallBackUri callBackUri2 = new CallBackUri();
            callBackUri2.setUriType("dsmPm");
            callBackUri2.setCallBackUri("http://192.168.55.133:8080/dsmPm");
            List<CallBackUri> list = new ArrayList<>();
            list.add(callBackUri);
            list.add(callBackUri2);
            map.put("callBackUris", list);
            
            return new ResponseEntity<String>(gson.toJson(map), HttpStatus.CREATED);
            
        } catch (JsonSyntaxException e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @RequestMapping(value = "/dsmPm", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public ResponseEntity<String> dsmPm (@RequestBody String json, HttpServletRequest request) {
        
        request.getHeaderNames();
        Gson gson = new Gson();
        Map map = new HashMap();
        try {
            map.put("token", "1234567fdfg");
            map.put("issuedAt", GetUTCTimeUtil.getUTCTimeStr(new Date()));
            map.put("expiredAt", GetUTCTimeUtil.getUTCTimeStr(new Date(System.currentTimeMillis() + 1000 *60 *5)));
            CallBackUri callBackUri = new CallBackUri();
            callBackUri.setUriType("dsmCm");
            callBackUri.setCallBackUri("192.168.11.11/dsmCm");
            List<CallBackUri> list = new ArrayList<>();
            list.add(callBackUri);
            map.put("callBackUris", list);
            
            return new ResponseEntity<String>(gson.toJson(map), HttpStatus.CREATED);
            
        } catch (JsonSyntaxException e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @RequestMapping("/download/{filename:.+}")
    public ResponseEntity<byte[]> gzFileDownloads(@PathVariable String filename, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String doenLoadPath = "F://" + filename ;
        File file = new File(doenLoadPath);
        if(file.exists()){
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.setContentDispositionFormData("attachment", file.getName());
            return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.OK);
        }else{
            return new ResponseEntity<byte[]>(HttpStatus.NOT_FOUND);
        }
    }
}
