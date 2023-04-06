package com.yyds.reflection_;

import java.lang.reflect.Field;

public class ReflectionAccessproperty {
    public static void main(String[] args) throws Exception{
        //1.得到Student类的Class对象
        Class<?> aClass = Class.forName("com.yyds.reflection_.Student");
        Object o = aClass.newInstance();

        //使用反射得到age属性
        Field age = aClass.getField("age");
        //通过反射来操作一个实例对象中的属性值
        age.set(o,20);
        System.out.println(o);

        Field name = aClass.getDeclaredField("name");
        //对name进行爆破，以此可以操作private对象
        name.setAccessible(true);
        //由于该属性是static的，是属于所有对象的，所以不用指明是哪个对象
        name.set(null,"ikun");
        System.out.println(o);   //Student{age=20,name=ikun}

        //获取属性
        System.out.println(name.get(o));   //ikun
    }
}


class Student{
    public int age;
    private static String name;

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age + ",name=" + name +
                '}';
    }
}
