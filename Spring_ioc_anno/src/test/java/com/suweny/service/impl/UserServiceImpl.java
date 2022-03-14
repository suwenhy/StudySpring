package com.suweny.service.impl;

import com.suweny.dao.UserDao;
import com.suweny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")

public class UserServiceImpl implements UserService {
    /*@Autowired//根据类型自动选择Bean进行注入
    @Qualifier("userDao")*/
    @Resource(name = "userDao")
    private UserDao userDao;
    @Value("${jdbc.driver}")
    private String driver;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
    userDao.save();
        System.out.println(driver);
    }

}
