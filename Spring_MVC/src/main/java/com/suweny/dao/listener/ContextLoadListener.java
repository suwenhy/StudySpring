package com.suweny.dao.listener;

import com.suweny.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoadListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ApplicationContext app =new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //将Spring上下文对象存到最大域，ServletContext域中
        ServletContext servletContext =servletContextEvent.getServletContext();
        servletContext.setAttribute("app",app);

    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
