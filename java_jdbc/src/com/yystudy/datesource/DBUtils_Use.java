package com.yystudy.datesource;


import com.yystudy.utils.JDBCbyDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

public class DBUtils_Use {

    //使用Apache-dbutlis查询多条记录  BeanListHandler
    @Test
    public void testQueryMany()throws Exception{
        //得到连接
        Connection connectiont = JDBCbyDruid.getConnectiont();

        //使用DBUtils相关的类：需要先将该jar包导入到项目中(commons-dbutils-1.7.jar)
        //创建QueryRunner对象
        QueryRunner queryRunner = new QueryRunner();
        //String sql = "select * from actor where sex = ?";
        String sql = "select id,name,sex from actor where sex = ?";

        //执行queryRunner对象的相关方法
        /**
         * 解读：
         * query方法就是执行sql语句，得到resultset结果集 --封装为--> ArrayList集合中，然后返回该集合
         * connection，传入连接
         * sql：传入sql语句，可以是待赋值参数的sql语句
         * new BeanListHandler<>(Actor.class)：将resultset中的记录 —-> Actor对象，并存进ArrayList集合
         * "男"：按顺序给sql语句中的参数赋值
         * 注：底层得到的resultset对象及preparedStatement对象，query方法会自动关闭，
         */
        List<Actor> query = queryRunner.query(connectiont, sql, new BeanListHandler<>(Actor.class),"男");

        //输出集合中的数据
        System.out.println("查询结果：");
        for (Actor actor : query) {
            System.out.println(actor);
        }

        //关闭连接
        JDBCbyDruid.closeConnection(connectiont);

    }

    @Test
    //使用Apache-dbutils查询单条记录  BeanHandler
    public void testQuerySingle()throws Exception{
        //得到连接
        Connection connectiont = JDBCbyDruid.getConnectiont();

        //使用DBUtils相关的类：需要先将该jar包导入到项目中(commons-dbutils-1.7.jar)
        //创建QueryRunner对象
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from actor where id = ?";   //返回单条记录

        //执行查询语句，并返回记录对象，BeanHandler返回的是单个对象，并不是集合
        Actor actor = queryRunner.query(connectiont, sql, new BeanHandler<>(Actor.class), 100);
        //输出
        System.out.println(actor);

        //关闭连接
        JDBCbyDruid.closeConnection(connectiont);
    }


    //使用Apache-dbutils完成查询结果是单行单列，返回类型为Object
    @Test
    public void testScalar()throws Exception{
        //得到连接
        Connection connectiont = JDBCbyDruid.getConnectiont();

        //使用DBUtils相关的类：需要先将该jar包导入到项目中(commons-dbutils-1.7.jar)
        //创建QueryRunner对象
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select name from actor where id = ?";   //返回单行单列记录

        //执行查询语句，并返回记录对象，ScalarHandler返回一个Object对象，并不是集合
        Object obj = queryRunner.query(connectiont, sql, new ScalarHandler<>(), 100);
        //输出
        System.out.println(obj);

        //关闭连接
        JDBCbyDruid.closeConnection(connectiont);
    }

    //使用Apache-dbutils完成DML操作
    @Test
    public void testDML()throws Exception{
        //得到连接
        Connection connectiont = JDBCbyDruid.getConnectiont();

        //使用DBUtils相关的类：需要先将该jar包导入到项目中(commons-dbutils-1.7.jar)
        //创建QueryRunner对象
        QueryRunner queryRunner = new QueryRunner();
        //String sql = "UPDATE actor set name = ? where id = ?";   //更新语句
        //String sql = "delete from actor where id = ?";   //删除语句
        String sql = "INSERT INTO actor values (null,?,?,?,?);";   //插入语句

        //调用queryRunner.update方法执行dml操作，并返回表中受影响的行数
        int affectRows = queryRunner.update(connectiont, sql, "坤师傅","男","1999-10-01",199);
        System.out.println(affectRows > 0 ? "执行成功" : "表没有受到影响");

        //关闭连接
        JDBCbyDruid.closeConnection(connectiont);
    }


}
