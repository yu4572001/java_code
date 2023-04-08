package com.yystudy.batch_;

import com.yystudy.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

//演示不使用批处理与使用批处理之间的效率
public class UseBatch {

    @Test
    //不使用批处理
    public void noBatch()throws Exception{
        Connection connect = JDBCUtils.getConnect();
        String sql = "insert into testadmin values(null,?,?);";
        PreparedStatement preparedStatement = connect.prepareStatement(sql);

        //开始执行
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1,"jack" + i);
            preparedStatement.setString(2,"66666666");
            preparedStatement.executeUpdate();
        }
        //执行结束
        long end = System.currentTimeMillis();
        System.out.println("所用时间：" + (end - start));    //3000多毫秒

        JDBCUtils.close(connect,preparedStatement);

    }


    @Test
    //使用批处理添加
    public void batch()throws Exception{
        Connection connect = JDBCUtils.getConnect();
        String sql = "insert into testadmin values(null,?,?)";
        PreparedStatement preparedStatement = connect.prepareStatement(sql);

        //开始执行
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1,"jack" + i);
            preparedStatement.setString(2,"66666666");
            //记住：要在url中添加  ?rewriteBatchedStatements=true
            preparedStatement.addBatch();  //将已经填写参数的sql语句放入处理包中

            //当处理包中满1000条语句，批量执行
            if ((i + 1) % 1000 == 0){
                preparedStatement.executeBatch();
                //将当前处理包的数据清空，再去添加
                preparedStatement.clearBatch();
            }
        }
        //执行结束
        long end = System.currentTimeMillis();
        System.out.println("所用时间：" + (end - start));    //72毫秒，效率大大提高

        JDBCUtils.close(connect,preparedStatement);
    }

}
