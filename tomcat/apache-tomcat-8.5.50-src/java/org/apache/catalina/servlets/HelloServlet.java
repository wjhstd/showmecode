package org.apache.catalina.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        req.getParameter("wang");
        response.setContentType("text/html;charset=utf-8");//设置编码格式，以防前端页面出现中文乱码
        PrintWriter printWriter = response.getWriter();//创建输出流
        printWriter.println("hello<br>");
        printWriter.println("<h1>窝窝头,一块钱四个,嘿嘿~~~~</h1>");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html;charset=utf-8");//设置编码格式，以防前端页面出现中文乱码
        System.out.println("处理Get请求。。。。。");
        PrintWriter out = response.getWriter();
        out.println("Hello Servlet-Get");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html;charset=utf-8");//设置编码格式，以防前端页面出现中文乱码
        System.out.println("处理Post请求。。。。。");
        PrintWriter out = response.getWriter();
        out.println("Hello Servlet-Post");
    }
}
