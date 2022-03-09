package com.suweny.service.impl;

import com.suweny.dao.UserDao;
import com.suweny.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    public void save() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao)app.getBean("userDao");
        userDao.save();
    }
}
