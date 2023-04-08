package com.yystudy.utils;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class Use01 {
    Connection connection = null;
    String sql = "";
    PreparedStatement preparedStatement = null;
    ResultSet set = null;


    @Test
    public void test(){
        try {
            sql = "select * from actor where id = ?;";
            connection = JDBCUtils.getConnect();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,100);
            //得到查询到的结果集
            set = preparedStatement.executeQuery();
            while (set.next()){
                //将查询到的记录的各个字段值取出，然后输出
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
                System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndate + "\t" + phone);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(set,connection, preparedStatement);
        }
    }
}
