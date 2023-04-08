package com.yystudy.preparedstatement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

//演示预处理操作dml语句
public class PreparedStatementDML {
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

        //写入sql语句，参数用？表示，随后调用方法赋值即可

        //插入语句：String sql = "insert into admin values (?,?);";
        //删除语句：String sql = "delete from admin where user = ?;";
        String sql = "Update admin set password = ? where user = ?;";

        //创建preparedStatement，填入sql
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //设置条件判断中的参数：1表示sql语句中第一个问号，后面跟着参数值
        preparedStatement.setString(1,pass_);
        preparedStatement.setString(2,user_);

        int i = preparedStatement.executeUpdate();
        System.out.println(i > 0 ? "执行成功" : "执行失败");

        //关闭连接
        preparedStatement.close();
        connection.close();


    }
}
