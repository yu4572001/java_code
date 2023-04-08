package com.yystudy.jdbc;


import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//演示JDBC的操作：
public class JDBC01 {
    public static void main(String[] args) throws SQLException {
        //前置工作：在项目中创建一个文件夹libs
        //将mysql.jar包拷贝到这个文件夹中，然后Add as Library将其加入

        //1.注册驱动
        Driver driver = new Driver();

        //2.得到连接
        /**
         * jdbc:mysql 规定好的协议，表示用jdbc连接mysql，如果是oracle就是jdbc:oracle
         * 127.0.0.1:3306 IP地址加端口号连接mysql
         * test为要连接mysql中的数据库的名字
         */
        String url = "jdbc:mysql://localhost:3306/test?verifyServerCertificate=false&useSSL=false";
        //将要连接的用户名与密码放入Properties中
        Properties properties = new Properties();
        //user与password是规定好的，后面value值根据实际填写
        properties.setProperty("user","root");
        properties.setProperty("password","123456");
        //创建连接
        Connection connect = driver.connect(url, properties);

        //3.执行SQL
        String sql = "insert into actor values(null, 'liu', '男', '2000-11-11', '1476201')";
        //获取statement，用于执行sql语句并返回生成的结果对象
        Statement statement = connect.createStatement();
        //传入sql语句，返回的i值表示受影响的行数
        int i = statement.executeUpdate(sql);

        System.out.println(i > 0 ? "操作成功":"操作失败");

        //4.关闭连接
        statement.close();
        connect.close();
    }
}
