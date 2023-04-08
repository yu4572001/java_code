package com.yystudy.dao_.dao;

import com.yystudy.dao_.domain.Actor;

public class ActorDao extends BasicDao<Actor>{
    //继承BasicDao类，并指定泛型为Actor类，则BasicDao里面的T就为Actor类的Class对象
    //然后可以在本类中编写特有的方法
}
