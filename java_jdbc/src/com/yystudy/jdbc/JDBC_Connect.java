package com.yystudy.jdbc;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//连接数据库的五种方式
public class JDBC_Connect {
    public static void main(String[] args){

    }


    //方式1
    @Test
    public void method1() throws SQLException {
        Driver driver = new Driver();

        String url = "jdbc:mysql://localhost:3306/test?verifyServerCertificate=false&useSSL=false";
        //将要连接的用户名与密码放入Properties中
        Properties properties = new Properties();
        //user与password是规定好的，后面value值根据实际填写
        properties.setProperty("user","root");
        properties.setProperty("password","123456");
        //创建连接
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    //方式2
    @Test
    public void method2() throws Exception{
        //使用反射加载Driver类，动态加载，更加的灵活，减少依赖性
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/test?verifyServerCertificate=false&useSSL=false";
        //将要连接的用户名与密码放入Properties中
        Properties properties = new Properties();
        //user与password是规定好的，后面value值根据实际填写
        properties.setProperty("user","root");
        properties.setProperty("password","123456");
        //创建连接
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);

    }

    //方式3
    @Test
    public void method3()throws Exception{
        //使用DriverManager替代Driver来连接
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/test?verifyServerCertificate=false&useSSL=false";
        String user = "root";
        String passwrod = "123456";
        //注册Driver驱动
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection(url, user, passwrod);
        System.out.println(connection);
    }

    @Test
    //方式4：使用最多的，推荐使用
    public void method4()throws Exception{
        //使用Class.forName自动完成注册驱动，简化代码
        //使用反射
        //注；Class.forName也能省略不写，java会自动调用jar包下的META—INF下的文本文件的类名称去注册
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/test?verifyServerCertificate=false&useSSL=false";
        String user = "root";
        String passwrod = "123456";

        //Driver类源码会自动完成注册，所以可以直接跳过registerDriver
        //     static {
        //        try {
        //            DriverManager.registerDriver(new Driver());
        //        } catch (SQLException var1) {
        //            throw new RuntimeException("Can't register driver!");
        //     }
        Connection connection = DriverManager.getConnection(url, user, passwrod);
        System.out.println(connection);
    }


    //方式5：使用配置文件来连接数据库（在方式4的基础上改进）
    @Test
    public void method5()throws Exception{
        //创建配置文件mysql.properties，写入：
        //user=root
        //password=123456
        //url=jdbc:mysql://localhost:3306/test?verifyServerCertificate=false&useSSL=false
        //driver=com.mysql.jdbc.Driver

        //通过properties对象来获取相关信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //通过反射来注册
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }


}
