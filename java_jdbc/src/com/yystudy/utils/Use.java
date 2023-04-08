package com.yystudy.utils;

import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Use {
    Connection connection = null;
    String sql = "";
    PreparedStatement preparedStatement = null;


    @Test
    public void test(){
        try {
            sql = "insert into actor values (?,?,?,?,?);";
            connection = JDBCUtils.getConnect();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,100);
            preparedStatement.setString(2,"周");
            preparedStatement.setString(3,"男");
            //创建一个日期，然后传入
            Date date = new Date(1996, 9, 01);
            preparedStatement.setDate(4,date);
            preparedStatement.setString(5,"14752335");
            preparedStatement.executeUpdate();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(connection, preparedStatement);
        }
    }
}
