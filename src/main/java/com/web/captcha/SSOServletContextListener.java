package com.web.captcha;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SSOServletContextListener implements ServletContextListener {

    

    @Override
    public void contextInitialized(ServletContextEvent sce) {
         Set<String> alreadyLoginMembers=new LinkedHashSet<>();
         sce.getServletContext().setAttribute("alreadyLoginMembers", alreadyLoginMembers);
        
        sce.getServletContext().setAttribute("captcha_verify_url", "https://www.google.com/recaptcha/api/siteverify");
        sce.getServletContext().setAttribute("captcha_remoteip", "localhost");
        sce.getServletContext().setAttribute("captcha_client_key", "6LdBStgZAAAAAGR8sHwaLpMajYoTfpE2VcZ0Ikm2");
        sce.getServletContext().setAttribute("captcha_server_key", "6LdBStgZAAAAALsysgOGebZ9o67WnnUNuQy1j75Z");
    }
@Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce); //To change body of generated methods, choose Tools | Templates.
    }
}
