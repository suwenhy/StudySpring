package com.suweny.web;

import com.suweny.config.SpringConfiguration;
import com.suweny.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        //ApplicationContext app =new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app= new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}