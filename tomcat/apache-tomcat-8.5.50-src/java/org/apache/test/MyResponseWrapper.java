package org.apache.test;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MyResponseWrapper extends HttpServletResponseWrapper {

    private ByteArrayOutputStream bytes = new ByteArrayOutputStream();
    private HttpServletResponse response;
    private PrintWriter pwrite;
    /**
     * Constructs a response adaptor wrapping the given response.
     *
     * @param response The response to be wrapped
     * @throws IllegalArgumentException if the response is null
     */
    public MyResponseWrapper (HttpServletResponse response) {
        super(response);
        this.response = response;
    }

    @Override
    public ServletOutputStream getOutputStream () throws IOException {
        return super.getOutputStream();
    }

    @Override
    public PrintWriter getWriter () throws IOException {
        try {
            pwrite = new PrintWriter(new OutputStreamWriter(bytes, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return pwrite;
    }
    
    @Override
    public HttpServletResponse getResponse (){
    
        try {
            response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
    
    public byte[] getBytes () {
        if (null != pwrite) {
            pwrite.close();
            return bytes.toByteArray();
        }

        if (null != bytes) {
            try {
                bytes.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bytes.toByteArray();
    }
}
