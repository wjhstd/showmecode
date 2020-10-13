package cn.a52going.codejava.aws.sign;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class AWSV4AuthTest {
    private static final String host = "192.168.113.130:7480";
    private static final String accessKey = "DZAFIGW7WSRGUK7KR4R7";
    private static final String secretKey = "X3jflJP4DHPktWuGlwaE67XpgetSoxawizQ33182";
    
    private static final String region = "us-east-1";
    private static final String service = "service";
    
    public Map<String, String> auth(String uri, String method, TreeMap<String, String> params, String data){
        TreeMap<String, String> awsHeaders = new TreeMap<String, String>();
        awsHeaders.put("host", host);
        
        return new AWSV4Auth.Builder(accessKey, secretKey)
                .regionName(region)
                .serviceName(service)
                .httpMethodName(method)
                .canonicalURI(uri)
                .queryParametes(params)
                .awsHeaders(awsHeaders)
                .payload(data)
                .debug()
                .build()
                .getHeaders();
    }
    
    @Test
    public void Test(){
        String uri = "/admin/usage";
        TreeMap<String, String> awsHeaders = new TreeMap<String, String>();
        awsHeaders.put("host", host);
        
        TreeMap<String, String> params = new TreeMap<String, String>();
//        params.put("Param1","value1");
//        params.put("Param2","value2");
        Map<String, String> header = auth(uri, "GET", params, null);
        for (Map.Entry<String, String> entrySet : header.entrySet()) {
            String key = entrySet.getKey();
            String value = entrySet.getValue();
        }
    }
}
