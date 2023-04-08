package com.yystudy.transaction_;

import com.yystudy.utils.JDBCUtils;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//演示银行转账操作
public class UseTransaction {
    @Test
    public void use(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //转账sql语句
        String sql1 = "update account set balance = balance - 100 where id = 1;";
        String sql2 = "update account set balance = balance + 100 where id = 2;";

        connection= JDBCUtils.getConnect();
        try {
            //设置取消自动提交，即相当于开启事务，即下面的语句中，要么都执行成功，要么都失败，不会只执行一半
            connection.setAutoCommit(false);
            //分别传入两条sql语句
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.executeUpdate();

            //这里故意设置一个异常，看数据能不能回滚
            //int i = 1 / 0;

            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();

            //在最后调用commit方法进行提交
            connection.commit();
        } catch (Exception e) {
            //当上述传入sql语句出现异常时，为了保证数据一致性，调用回滚方法
            try {
                System.out.println("语句出现异常，数据进行了回滚");
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            throw new RuntimeException(e);
        }

        //关闭连接
        JDBCUtils.close(connection,preparedStatement);

    }

}
