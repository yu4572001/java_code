package com.yyds.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class HomeWork01 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.yyds.PrivateTest");
        Object o = aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"helloworld");
        Method getName = aClass.getDeclaredMethod("getName");
        System.out.println(getName.invoke(o));
    }
}
