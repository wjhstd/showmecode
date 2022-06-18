package cn.a52going.codejava;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MainTest {
    public static final Map<String, Boolean> CUSTOMCONFMAP_DISPLAY = new HashMap<String, Boolean>();
    private static final RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(1000).setConnectTimeout(2000)
            .setSocketTimeout(30000)
            .build();
    public static void main (String[] args) {
    
        String fromFileName = "G:\\wjh\\from.mp4";
        String toFileName = "G:\\wjh\\to.mp4";
        long startTime = System.currentTimeMillis();
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(fromFileName);
//            System.out.println("inStream size :" + RamUsageEstimator.shallowSizeOf(in));
            out = new FileOutputStream(toFileName);
            int tempRead ;
            while((tempRead = in.read())>-1) {
                out.write(tempRead);
//                Long size = RamUsageEstimator.shallowSizeOf(out);
//                System.out.println("outStream size :" + size);
                out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(in!=null)in.close();
                if(out!=null)out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        long spendTime = endTime - startTime;
        System.out.println("方法一，基础复制花费时间："+ spendTime + "毫秒；");
    }
    @Test
    public void test1() throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:00");
        System.out.println(format.format(new Date()));
        Date now = new Date();
        String nowTIme = format.format(now);
        
        long mil = format.parse(nowTIme).getTime();
       for (int i=1; i <= 180; i++){
           SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           Date d = new Date(mil - 1000L * 60 * i);
           System.out.println("INSERT INTO block_pool_recover_speed (device_id, pool_id, speed, sampling_time) VALUES (100, 1, 341835776, '" + format2 .format(d) + "');");
           System.out.println("INSERT INTO block_pool_recover_speed (device_id, pool_id, speed, sampling_time) VALUES (101, 1, 561134961, '" + format2 .format(d) + "');");
           System.out.println("INSERT INTO block_pool_recover_speed (device_id, pool_id, speed, sampling_time) VALUES (102, 1, 417333248, '" + format2 .format(d) + "');");
       }
    }
    @Test
    public void test2(){
    
        List<String> listSource = new ArrayList<>();
        listSource.add("wang");
        listSource.add("jun");
        listSource.add("hui");
        System.out.println(listSource);
        List<String> tmpList = new LinkedList<>();
        tmpList.add("lili");
        tmpList.add("li");
        
        listSource = tmpList;
        System.out.println(listSource);
        System.out.println( (long)((double)25 / 100 * 2 * 60 * 1000));
    }
    
    @Test
    public void test3() throws InterruptedException {
        Gson gson = new Gson();
        String token = HttpRequestUtil.getToken("192.168.55.133", "8062");
        Map<String, String> map = new HashMap<>();
        map.put("clusterId", "1");
        map.put("poolId", "1");
        map.put("volumeName", "vcbbb");
        map.put("capacityTotal", "10737418240");
        map.put("blockThin", "1");
        map.put("description", "1");
        map.put("redMode", "no");
        map.put("unitSelect", "3");
        map.put("volumeNum", "1");
//        HttpRequestUtil.sendJsonPostRequest("192.168.55.133", "8062", "/mng/blockVolume/", token, map);
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++){
            new Thread(()->{
                request("http://192.168.55.133:8062/mng/blockVolume", gson.toJson(map), token);
                countDownLatch.countDown();
//                HttpRequestUtil.sendJsonPostRequest("192.168.55.133", "8062", "/mng/blockVolume/", token, map);
            }).start();
        }
        countDownLatch.await();
        
    }
    
    
    private static String request(String uri, String body, String token) {
    
        
        String reponseBody = null;
        CloseableHttpClient httpClient = null;
        int statusCode = HttpStatus.SC_BAD_REQUEST;
        try {
            HttpPost httpPost = new HttpPost();
            httpPost.setURI(URI.create(uri));
            httpPost.setConfig(config);
    
            HttpEntity requestEntity = new StringEntity(body, ContentType.APPLICATION_JSON);
            httpPost.setEntity(requestEntity);
            // 配置请求的HEADER部分
            httpPost.setHeader("X_AUTH_TOKEN", token);
            httpPost.addHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
            // HttpClientBuilder 默认超时自动重发3次，此处配置 不重发
            httpClient = HttpClientBuilder.create().setRetryHandler(new DefaultHttpRequestRetryHandler(0, false)).build();
            
            HttpResponse response = httpClient.execute(httpPost);
            System.out.println(">>> result code: " + response.getStatusLine().getStatusCode());
//            statusCode = response.getStatusLine().getStatusCode();
            // if(statusCode <200 || statusCode >= 400){
            // return gson.toJson(new CommonResponse(response.getStatusLine().getReasonPhrase()));
            // }
            // 获取响应消息实体
            HttpEntity resEntity = response.getEntity();
            
            // 判断响应实体是否为空
            if (resEntity != null) {
                reponseBody = EntityUtils.toString(resEntity, ContentType.APPLICATION_JSON.getCharset());
            }
            System.out.println(">>> result body: " + reponseBody);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭或释放资源
            try {
                httpClient.close();
            } catch (IOException e) {
            }
        }
        return reponseBody;
    }
    
    @Test
    public void test10(){
        List<byte[]> objs = new ArrayList<>();
    
        for (;;) {
            try {
                TimeUnit.MILLISECONDS.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
            objs.add(new byte[10240]);
        }
    }
    
}
