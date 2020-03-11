package org.apache.customFilter;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.apache.test.MyResponseWrapper;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

public class ResponseFilter implements Filter {
    private static final Log log = LogFactory.getLog(ResponseFilter.class);
    @Override
    public void init (FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse resp = (HttpServletResponse) response;
        MyResponseWrapper mResp = new MyResponseWrapper(resp);
        //使用复写后的wrapper
        chain.doFilter(request, mResp);
        // 获取缓存的响应数据
        byte[] bytes = mResp.getBytes();
        String backMsg = new String(bytes, "UTF-8");
        log.info("response data: " + backMsg);
        String encode = URLEncoder.encode(backMsg, "UTF-8");
        byte[] bts = encode.getBytes();
        // 将编码数据响应给客户端
        resp.getOutputStream().write(bts);
    }

    @Override
    public void destroy () {

    }
}
