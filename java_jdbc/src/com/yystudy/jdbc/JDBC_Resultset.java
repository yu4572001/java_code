package com.yystudy.jdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class JDBC_Resultset {
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

        String sql = "select * from actor";
        //执行查询语句，将查询结果保存在一个结果集中返回
        ResultSet resultSet = statement.executeQuery(sql);
        //遍历结果集
        while (resultSet.next()){  //让光标向后移动记录，没有时返回false，结束循环
            int anInt = resultSet.getInt(1);   //获取该行的第1列数据id(数据类型要对应)
            String string1 = resultSet.getString(2);//获取该行的第2列数据name
            String string = resultSet.getString(3);    //sex
            Date date = resultSet.getDate(4);     //borndate
            String string2 = resultSet.getString(5);     //phone

            System.out.println(anInt + "\t" + string1 + "\t" + string + "\t" + date + "\t" + string2);
        }

        //关闭
        resultSet.close();
        statement.close();
        connection.close();
    }
}
