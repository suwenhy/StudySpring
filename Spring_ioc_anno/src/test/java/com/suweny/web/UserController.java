package com.suweny.web;

import com.suweny.config.SpringConfiguration;
import com.suweny.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

public class UserController {
    public static void main(String[] args) {
        //从配置文件加载Spring配置
        //ApplicationContext app =new ClassPathXmlApplicationContext("applicationContext.xml");
        //从配置类加载Spring配置
        ApplicationContext app= new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
