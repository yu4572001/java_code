package com.yystudy.preparedstatement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

public class PreparedStatement01 {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
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

        //写入sql语句，条件判断中的参数用？表示，随后调用方法赋值即可
        String sql = "select * from admin where user = ? and password = ?;";

        //创建preparedStatement，填入sql
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //设置条件判断中的参数：1表示sql语句中第一个问号，后面跟着参数值
        preparedStatement.setString(1,user_);
        preparedStatement.setString(2,pass_);
        //也可以直接填入字段值
//        preparedStatement.setString("user","100");
//        preparedStatement.setString();

        //此处查询不用再传入sql语句，因为这里再传入sql，传的是没有设置参数的sql语句，已经设置参数的sql会自动传入
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();


    }
}
