package com.yystudy.statement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Statement01 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        /**
         * 真正的账号密码为：100    123456
         * 但statement存在sql注入问题，所以可以用一些非法、逻辑奇怪的命令绕过判断来查询到数据库中的数据
         * 即俗称的万能密码：1' or       or '1'='1
         */
        //输入账号：
        System.out.print("请输入你的账号：");
        String user_ = scanner.nextLine();   //这里要用nextLine，可以接收空格
        System.out.print("请输入你的密码：");
        String pass_ = scanner.nextLine();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();

        //填写sql语句
        String sql = "select * from admin where user='" + user_ +
                "' and password='" + pass_ + "' ;";
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){    //如果返回的result中有记录，则next()为true
            System.out.println("登录成共");
        }else {
            System.out.println("登录失败");
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
