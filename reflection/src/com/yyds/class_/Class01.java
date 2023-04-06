package com.yyds.class_;

import com.yyds.Car;

import java.lang.reflect.Field;

//演示Class对象的一些方法
public class Class01 {
    public static void main(String[] args) throws Exception{

        String classPath = "com.yyds.Car";
        //1.获取相应类的Class对象
        //<?>表示不确定的类型
        Class<?> aClass = Class.forName(classPath);

        //2输出aclass
        System.out.println(aClass);  //class com.yyds.Car
        System.out.println(aClass.getClass());    //运行类型为class java.lang.Class，即Class类中也有许多方法

        //3得到包名
        System.out.println(aClass.getPackage().getName());    //com.yyds

        //4得到全类名
        System.out.println(aClass.getName());    //com.yyds.Car

        //5通过aclass创建对象实例(这个相应类的对象实例)
        Object o = aClass.newInstance();
        //可以强转为这个类对象
        Car car = (Car) o;
        System.out.println(car);   //car.toString()

        //6通过反射获取该类对象的属性
        Field brand = aClass.getField("brand");
        System.out.println(brand.get(car));    // 奔驰

        //7通过反射给该类对象的属性赋值
        brand.set(car,"宝马");
        System.out.println(brand.get(car));   //宝马

        //得到该类对象的所有属性
        Field[] fields = aClass.getFields();    //返回一个Field对象类型的数组
        for (Field field :fields) {
            System.out.println(field.getName());     //brand price product(该类的属性名)

        }

    }
}
