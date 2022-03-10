package com.suweny.service.impl;

import com.suweny.dao.UserDao;
import com.suweny.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

     public void setUserDao(UserDao userDao){
                this.userDao=userDao;
            }
    public void save() {
        userDao.save();
    }
}
