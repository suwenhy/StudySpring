package com.suweny.dao.impl;

import com.suweny.dao.UserDao;
import org.springframework.stereotype.Component;

@Component("userDao")

public class UserDaoImpl implements UserDao {
    public void save(){
        System.out.println("Hello,UserDao");
    }
}
