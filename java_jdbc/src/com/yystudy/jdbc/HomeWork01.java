package com.yystudy.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class HomeWork01 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        //创建表
//        String sql = "create table news(" +
//                "id int primary key," +
//                "`name` varchar(10) not null," +
//                "content varchar(30))";
        //插入记录
        String sql = "insert into news values (100,'北京新闻','.......')," +
                "(200,'天津新闻','.......')," +
                "(300,'上海新闻','.......')," +
                "(400,'郑州新闻','.......');";
        statement.executeUpdate(sql);

        statement.close();
        connection.close();


    }
}
