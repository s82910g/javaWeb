package com.web.study.servlet;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyGenericServlet  extends GenericServlet{
    
      @Override
    public void init() throws ServletException {
        super.init(); 
          System.out.println("init MyGenericServlet");//印在TomEE的 console 中
    }

    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service MyGenericServlet");//印在TomEE的 console 中
        res.getWriter().print("service MyGenericServlet");//印在Client 端的瀏覽器中
    }

  
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("destory MyGenericServlet");//印在TomEE的 console 中
    }
    
}
