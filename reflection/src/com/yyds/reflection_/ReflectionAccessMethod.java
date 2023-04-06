package com.yyds.reflection_;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAccessMethod {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.yyds.reflection_.Boss");

        //创建对象
        Object o = aClass.newInstance();

        //调用public的hi方法
        //Method hi = aClass.getMethod("hi", String.class);   这个也可以调用
        Method hi = aClass.getDeclaredMethod("hi", String.class);
        hi.invoke(o,"你好世界");    //你好世界

        //调用private方法
        Method say = aClass.getDeclaredMethod("say", int.class, String.class, char.class);
        //爆破
        say.setAccessible(true);
        //调用传参，因为是static，所以可以指null
        System.out.println(say.invoke(null,100,"老王",'A'));   //100 老王 A

    }
}


class Boss{
    public int age;
    private String name;

    public Boss(){

    }

    private static String say(int n, String s, char c){
        return n + " " + s + " " + c;
    }

    public void hi(String s){
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Boss{" +
                "age=" + age +
                ", name='" + name +
                '}';
    }
}
