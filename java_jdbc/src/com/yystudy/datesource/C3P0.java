package com.yystudy.datesource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class C3P0 {

    @Test
    public void test1()throws Exception{

        //1.创建数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src//mysql.properties"));

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //给数据源comboPooledDataSource设置相关的参数
        //注：所有的连接都是由comboPooledDataSource进行管理的
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        //设置初始化连接数，即初始化了10个连接以供使用
        comboPooledDataSource.setInitialPoolSize(10);
        //设置最大连接数，当访问超过了这个连接数后，后面的连接请求会在等待队列中排队
        comboPooledDataSource.setMaxPoolSize(50);

        //开启连接，该方法是从DateSource接口
        Connection connection = comboPooledDataSource.getConnection();
        System.out.println("连接成功");
        connection.close();
    }

    //演示第二种方式连接：利用xml配置文件来创建连接池并连接
    @Test
    public void test2()throws Exception{
        //这里的参数是xml文件中数据源的名字
        ComboPooledDataSource testDate = new ComboPooledDataSource("testDate");

        //xml配置文件中已经把参数都设置好了，这里直接连接即可
        Connection connection = testDate.getConnection();
        System.out.println("连接成功");
        connection.close();
    }
}
