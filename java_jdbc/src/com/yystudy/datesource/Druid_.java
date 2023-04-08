package com.yystudy.datesource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;
import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class Druid_ {

    @Test
    public void testDruid()throws Exception{
        //加入jar包，在src创建一个druid.properties文件，写入配置信息
        //创建Properties对象，读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src//druid.properties"));

        //调用jar包中的一个静态方法，传入配置对象，返回Druid连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //得到连接池中的一个连接
        Connection connection = dataSource.getConnection();
        System.out.println("连接成功");
        //将连接放回池中
        connection.close();
    }
}
