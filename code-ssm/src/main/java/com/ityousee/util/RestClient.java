package com.ityousee.util;


import com.alibaba.fastjson.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.net.URI;


public class RestClient {

    private static final Log logger = LogFactory.getLog(RestClient.class);

//    private static final Gson gson = new Gson();
    private static final JSONObject gson = new JSONObject();

    // 配置请求的超时设置
    // setConnectionRequestTimeout,httpclient使用连接池来管理连接，这个时间就是从连接池获取连接的超时时间
    // setConnectTimeout 设置连接主机超时,连接建立时间，三次握手完成时间
    // SocketTimeout,连接上一个url后，获取response的返回等待时间 ，即在与目标url建立连接后，等待放回response的最大时间，在规定时间内没有返回响应的话就抛出SocketTimeout，防止断网http僵死
    // SocketTimeout，计算方法：em执行命令 时间的总和 + 过渡时间（目前给 3s）
    private static final RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(1000).setConnectTimeout(2000)
            .setSocketTimeout(6000)
            .build();

    private static RequestConfig getConfig(int timeout) {
        RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(1000).setConnectTimeout(2000).setSocketTimeout(timeout).build();
        return config;
    }

    public static String post(String uri, String requestBody, ContentType contentType) {
        HttpPost httpPost = new HttpPost();
        httpPost.setURI(URI.create(uri));
        httpPost.setConfig(config);
        HttpEntity requestEntity = new StringEntity(requestBody, contentType);
        httpPost.setEntity(requestEntity);

        return request(httpPost, contentType, requestEntity);
    }

    public static String post(String uri, String requestBody, ContentType contentType, int timeout) {
        HttpPost httpPost = new HttpPost();
        httpPost.setURI(URI.create(uri));
        httpPost.setConfig(getConfig(timeout));
        HttpEntity requestEntity = new StringEntity(requestBody, contentType);
        httpPost.setEntity(requestEntity);

        return request(httpPost, contentType, requestEntity);
    }

    public static String put(String uri, String requestBody, ContentType contentType) {
        HttpPut httpPut = new HttpPut();
        httpPut.setURI(URI.create(uri));
        httpPut.setConfig(config);

        HttpEntity requestEntity = new StringEntity(requestBody, contentType);
        httpPut.setEntity(requestEntity);

        return request(httpPut, contentType, requestEntity);
    }

    public static String put(String uri, String requestBody, ContentType contentType, int timeout) {
        HttpPut httpPut = new HttpPut();
        httpPut.setURI(URI.create(uri));
        httpPut.setConfig(getConfig(timeout));

        HttpEntity requestEntity = new StringEntity(requestBody, contentType);
        httpPut.setEntity(requestEntity);

        return request(httpPut, contentType, requestEntity);
    }

    public static String patch(String uri, String requestBody, ContentType contentType) {
        HttpPatch httpPatch = new HttpPatch();
        httpPatch.setURI(URI.create(uri));
        httpPatch.setConfig(config);

        HttpEntity requestEntity = new StringEntity(requestBody, contentType);
        httpPatch.setEntity(requestEntity);

        return request(httpPatch, contentType, requestEntity);
    }

    public static String patch(String uri, String requestBody, ContentType contentType, int timeout) {
        HttpPatch httpPatch = new HttpPatch();
        httpPatch.setURI(URI.create(uri));
        httpPatch.setConfig(getConfig(timeout));

        HttpEntity requestEntity = new StringEntity(requestBody, contentType);
        httpPatch.setEntity(requestEntity);

        return request(httpPatch, contentType, requestEntity);
    }

    public static String get(String uri, ContentType contentType) {
        HttpGet httpGet = new HttpGet();
        httpGet.setURI(URI.create(uri));
        httpGet.setConfig(config);
        httpGet.addHeader(HttpHeaders.ACCEPT_ENCODING, "gzip");
        httpGet.addHeader("Authorization","Qiniu Ht1vlUpeBm78eZneWPfJJGGAkow6kxm7YFwXoraT:ZGNlMjI4YTgzNWEzMjhhYjY3YjFjNzJiZjNkMDI0NDZlNGJhYTg2Mg==");
        return request(httpGet, contentType, null);
    }

    public static String get(String uri, ContentType contentType, int timeout) {
        HttpGet httpGet = new HttpGet();
        httpGet.setURI(URI.create(uri));
        httpGet.setConfig(getConfig(timeout));

        return request(httpGet, contentType, null);
    }

    public static String delete(String uri, ContentType contentType) {
        HttpDelete httpDelete = new HttpDelete();
        httpDelete.setURI(URI.create(uri));
        httpDelete.setConfig(config);

        return request(httpDelete, contentType, null);
    }

    public static String delete(String uri, ContentType contentType, int timeout) {
        HttpDelete httpDelete = new HttpDelete();
        httpDelete.setURI(URI.create(uri));
        httpDelete.setConfig(getConfig(timeout));

        return request(httpDelete, contentType, null);
    }

    private static String request(HttpUriRequest httpUriRequest, ContentType contentType, HttpEntity reqEntity) {
        String reponseBody = null;
        CloseableHttpClient httpClient = null;
        int statusCode = HttpStatus.SC_BAD_REQUEST;
        try {
            printReqInfo(httpUriRequest, contentType, reqEntity);

            // 配置请求的HEADER部分
            httpUriRequest.addHeader(HttpHeaders.ACCEPT, contentType.getMimeType());
            // HttpClientBuilder 默认超时自动重发3次，此处配置 不重发
            httpClient = HttpClientBuilder.create().setRetryHandler(new DefaultHttpRequestRetryHandler(0, false)).build();

            HttpResponse response = httpClient.execute(httpUriRequest);
            statusCode = response.getStatusLine().getStatusCode();
            // if(statusCode <200 || statusCode >= 400){
            // return gson.toJson(new CommonResponse(response.getStatusLine().getReasonPhrase()));
            // }
            // 获取响应消息实体
            HttpEntity resEntity = response.getEntity();

            // 判断响应实体是否为空
            if (resEntity != null) {
                reponseBody = EntityUtils.toString(resEntity, contentType.getCharset());
            }

        } catch (Exception e) {
                logger.error("Connection Error", e);
            reponseBody = gson.toJSONString(new CommonResponse("code_connection_error"));
        } finally {
            // 关闭或释放资源
            try {
                httpClient.close();
            } catch (IOException e) {
                logger.error("Connection Close Error", e);
            }

            printReqInfo(httpUriRequest, reponseBody, statusCode);
        }
        return reponseBody;
    }

    private static void printReqInfo(HttpUriRequest httpUriRequest, String reponseBody, int statusCode) {
            // 返回响应状态信息
            logger.info("Status Code:	" + statusCode);

            if (!StringUtils.isEmpty(reponseBody)) {
                logger.info("Response Body:	" + reponseBody);
            }
        }

    private static void printReqInfo(HttpUriRequest httpUriRequest, ContentType contentType, HttpEntity reqEntity) throws IOException {
            logger.info("Start Send Command!");
            logger.info("URI:	" + httpUriRequest.getURI().toString());

            // Http方法
            logger.info("Method:	" + httpUriRequest.getMethod());

            // 判断请求实体是否为空
            if (reqEntity != null) {
                String requestBody = EntityUtils.toString(reqEntity, contentType.getCharset());
                logger.info("Request Body:	" + requestBody);
            }
    }
}
