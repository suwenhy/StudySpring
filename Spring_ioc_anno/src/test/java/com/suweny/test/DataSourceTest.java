package com.suweny.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

public class DataSourceTest {
    @Test
    //测试手动创建c3p0
    public void test1() throws Exception{
        ComboPooledDataSource dataSource =new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("hy001221");
        Connection connection =dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    //测试手动创建c3p0
    public void test2() throws Exception{
        DruidDataSource dataSource =new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("hy001221");
        Connection connection =dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    //测试手动创建c3p0(从配置文件读取配置数据)
    public void test3() throws Exception{
        //读取配置文件
        ResourceBundle rb=ResourceBundle.getBundle("jdbc");
        String driver =rb.getString("jdbc.driver");
        String url =rb.getString("jdbc.url");
        String username =rb.getString("jdbc.username");
        String password =rb.getString("jdbc.password");
      ComboPooledDataSource dataSource =new ComboPooledDataSource();
      dataSource.setDriverClass(driver);
      dataSource.setJdbcUrl(url);
      dataSource.setUser(username);
      dataSource.setPassword(password);
      Connection connection =dataSource.getConnection();
        System.out.println(connection);
    }
    @Test
    //测试手动创建c3p0(从配置文件读取配置数据)
    public void test4() throws Exception{
        //读取配置文件
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource =(DataSource) app.getBean("dataSource");
        Connection connection =dataSource.getConnection();
        System.out.println(connection);
    }
}
