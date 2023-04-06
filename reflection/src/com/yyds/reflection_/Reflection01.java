package com.yyds.reflection_;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args) throws Exception{

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();   //取出Cat
        String method = properties.get("method").toString();      //取出hello

        //使用反射机制来解决
        Class aClass = Class.forName(classfullpath);     //加载类，得到该类的类对象，每个类都有一个类对象，且只有一个
        //通过该类对象，得到加载的类com.yyds.Cat类的实例对象
        Object o = aClass.newInstance();

        //调用方法对象，传统方式为对象名.方式名，反射中方法.invoke(对象)
        Method method1 = aClass.getMethod(method);
        method1.invoke(o);
        //getField方法：得到该Class对象中的成员属性，并返回成员属性对象
        //注：getField不能得到私有属性
        Field age = aClass.getField("age");
        System.out.println(age.get(o));     //反射：成员属性.get(对象)

        //得到构造器对象：
        Constructor constructor = aClass.getConstructor();   //得到Class类对象的无参构造器
        System.out.println(constructor);     //public com.yyds.Cat()

        //有参构造器
        Constructor constructor1 = aClass.getConstructor(String.class);  //传入的String.class就是String类的Class对象
        System.out.println(constructor1);      //public com.yyds.Cat(java.lang.String)

    }
}
