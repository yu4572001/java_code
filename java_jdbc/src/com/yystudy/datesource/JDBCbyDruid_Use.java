package com.yystudy.datesource;

import com.yystudy.utils.JDBCbyDruid;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JDBCbyDruid_Use {

    @Test
    public void resultSetToArrayList()throws Exception{
        Connection connection = null;
        String sql = "select * from actor;";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Actor> actors = new ArrayList<>();    //创建集合，用来保存结果集数据

        connection = JDBCbyDruid.getConnectiont();
        preparedStatement = connection.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();

        //循环遍历结果集，并将其值用来创建Actor对象，然后添加进集合中
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date borndate = resultSet.getDate(4);
            String phone = resultSet.getString(5);

            //创建Actor对象，添加进集合中
            actors.add(new Actor(id,name,sex,borndate,phone));
        }

        //关闭连接
        JDBCbyDruid.closeConnection(resultSet,preparedStatement,connection);

        //输出保存在集合中的对象，即查询到的结果集的数据
        for (Actor actor :actors) {
            System.out.println(actor);
        }

    }
}
