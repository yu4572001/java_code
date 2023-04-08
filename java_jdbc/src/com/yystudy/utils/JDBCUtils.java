package com.yystudy.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//在jdbc操作中，获取连接与释放连接是经常要做的事情，将其封装为一个工具类JDBCUtils
public class JDBCUtils {
    public static String user;    //要连接的数据库用户名
    public static String password;     //密码
    public static String url;    //要连接的数据库的url
    public static String driver;    //要用到的driver驱动类的位置

    //在static代码块中初始化
    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src//mysql.properties"));
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");
        } catch (IOException e) {
            //转为运行异常，将异常抛给调用者解决，实际开发也是这样解决
            throw new RuntimeException(e);
        }

    }


    //连接数据库，并返回connect对象
    public static Connection getConnect(){
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    //关闭相关连接，为了灵活性，做成方法重载
    public static void close(ResultSet set, Connection connection, Statement statement){
        try {
            set.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static void close(Connection connection, Statement statement){
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
