package com.suweny.service.impl;

import com.suweny.config.SpringConfiguration;
import com.suweny.dao.UserDao;
import com.suweny.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    public void save() {
        /*ApplicationContext app= new AnnotationConfigApplicationContext(SpringConfiguration.class);
        userDao=(UserDao) app .getBean("userDao");*/
        userDao.save();
    }
}
