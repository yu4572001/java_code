package com.yyds.reflection_;
import java.lang.reflect.Constructor;

public class ReflectionCreateObject {
    public static void main(String[] args) throws Exception{
        //1.获取User类的Class对象
        Class<?> aClass = Class.forName("com.yyds.reflection_.Use");

        //2.通过public的无参构造器创建对象实例
        Object o = aClass.newInstance();
        System.out.println(o);   //name=小明, age=20

        //3.通过public的有参构造器创建对象实例
        /*
            下面的constructor就是
            public Use(String name){
                this.name = name;
            }

         */
        //1.先得到对应构造器，然后创建实例，传入实参
        Constructor<?> constructor = aClass.getConstructor(String.class);
        Object o2 = constructor.newInstance("小红");
        System.out.println(o2);     //name=小红, age=20

        //2.通过非public的有参构造器创建对象实例
        //得到private的构造器对象
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class);

        //爆破：即暴力破解，使用反射就可以访问到private的构造器/方法/属性，反射面前，都是纸老虎
        declaredConstructor.setAccessible(true);
        Object o3 = declaredConstructor.newInstance("小强", 30);
        System.out.println(o3);   //name=小强, age=30

    }
}

class Use{
    private String name = "小明";
    private int age = 20;

    private Use(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Use(){

    }

    public Use(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", age=" + age;
    }
}
