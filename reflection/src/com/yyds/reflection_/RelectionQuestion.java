package com.yyds.reflection_;

import com.yyds.Cat;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Properties;

//引出反射问题
public class RelectionQuestion {
    public static void main(String[] args) throws Exception{

        //用传统方法来创建Cat对象  ---> new 对象，然后调用方法
//        Cat cat = new Cat();
//        cat.hello();

        //反射读取类对象，在不更改源代码的情况下来，来控制这个程序
        //先读取properties类，来获取当中的配置信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();   //取出Cat
        String method = properties.get("method").toString();      //取出hello

        //使用反射机制来解决
        Class aClass = Class.forName(classfullpath);     //加载类，得到该类的类对象，每个类都有一个类对象，且只有一个
        //通过该类对象，得到加载的类com.yyds.Cat类的实例对象
        Object o = aClass.newInstance();
        System.out.println("o的运行类型为：" + o.getClass());   //该类运行类型为class com.yyds.Cat

        //得到该对象的实例对象的方法对象
        //在反射中，方法也被视为一个对象
        Method method1 = aClass.getMethod(method);
        //调用方法对象，传统方式为对象名.方式名，反射中方法.invoke(对象)
        //无需知道该类中的方法名叫什么，也可以通过properties文件调用
        method1.invoke(o);

    }
}
