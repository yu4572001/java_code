package com.yystudy.dao_.test;

import com.yystudy.dao_.dao.ActorDao;
import com.yystudy.dao_.domain.Actor;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestDao {

    @Test
    public void testActorDao(){
        ActorDao actorDao = new ActorDao();

        //演示采用DAO方法开发使用查询语句
        System.out.println("查询多行多列");
        List<Actor> actors = actorDao.queryMany("select * from actor where id >= ?", Actor.class, 100);
        for (Actor actor : actors) {
            System.out.println(actor);
        }

        System.out.println("查询单行多列");
        Actor actor = actorDao.querySingle("select * from actor where id = ?", Actor.class, 101);
        System.out.println(actor);

        System.out.println("查询单行单列");
        Object o = actorDao.queryScalar("select name from actor where id = ?", 1);
        System.out.println(o);

        System.out.println("执行dml操作");
        int update = actorDao.update("insert into actor values(null,?,?,?,?)", "kfc", "女", "2000-01-01", "500");
        System.out.println(update > 0 ? "执行成功":"表没有受到影响");
    }
}
