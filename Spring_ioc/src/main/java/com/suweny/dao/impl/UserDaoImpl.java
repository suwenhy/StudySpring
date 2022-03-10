package com.suweny.dao.impl;

import com.suweny.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.suweny.domain.User;

public class UserDaoImpl implements UserDao {
    private String username;
    private int age;
    private List<String> strList;
    private Map<String,User>UserMap;
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        UserMap = userMap;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void save(){
        System.out.println(strList);
        System.out.println(UserMap);
        System.out.println(properties);
        System.out.println(username+"===="+age);
        System.out.println("Hello,UserDao");
    }
}
