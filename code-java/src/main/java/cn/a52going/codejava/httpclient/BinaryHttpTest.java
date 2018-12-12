//package cn.a52going.codejava.httpclient;
//
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.HttpStatus;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.conn.ConnectTimeoutException;
//import org.apache.http.conn.ConnectionPoolTimeoutException;
//import org.apache.http.entity.ByteArrayEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.message.BasicHeader;
//import org.apache.http.util.EntityUtils;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.SocketTimeoutException;
//import java.nio.charset.Charset;
//import java.util.Map;
//
//
//public class BinaryHttpTest {
//    public static void main(String args[]) {
//        BinaryHttpTest test = new BinaryHttpTest();
//        try {
//            test.post("http://localhost:8080/jtask", "wangjunhui".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public static void httpPost11() {
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpPost httpPost = new HttpPost(
//                "http://192.168.1.74:4321/v1/user/get_notice");
//        MultipartEntityBuilder d=MultipartEntityBuilder.create();
//        int a=10,b=11;
//        d.addBinaryBody("id", HighLowByteConvert.toHH(a));
//        d.addBinaryBody("ids", HighLowByteConvert.toHH(b));
//        try {
//            httpPost.setEntity(d.build());
//            CloseableHttpResponse httppHttpResponse2 = httpClient
//                    .execute(httpPost);
//            if (httppHttpResponse2.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                byte []c=EntityUtils.toByteArray(httppHttpResponse2.getEntity());
//                ChannelBuffer channelBuffer = ChannelBuffers.copiedBuffer(c);
//                System.out.println(channelBuffer.readInt());
//                System.out.println(channelBuffer.readInt());
//            }
//            else
//            {
//            }
//            httppHttpResponse2.close();
//            httpClient.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}
