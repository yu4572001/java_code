package com.high_object.codeblock;

/**
 * 1. static代码块也叫静态代码块，对类进行初始化时，会随着**类的加载**而执行，并且**只会执行一次**，如果是普通代码块，每创建一个对象就会执行一次
 * 2. 类在什么时候会被加载：
 *    1. 创建对象实例时(new)
 *    2. 创建子类对象实例时，父类也会被加载，而且先记载父类，再加载子类
 *    3. 使用类的静态成员时
 *
 */

public class CodeBlockDetail {
    public static void main(String[] args) {

        //先会执行代码块，再执行其他的
        //A aa = new A();    //1. 创建对象实例时(new)
        //B bb = new B();       //2. 创建子类对象实例时，父类也会被加载，而且先记载父类，再加载子类

        System.out.println(Test.name);   //3. 使用类的静态成员时
        Test test = new Test();

    }
}


class Test{
    public static String name = "小红";


    static {
        System.out.println("Test 类的静态代码块被调用");
    }


    //普通代码块
    {
        System.out.println("普通代码块被调用...");
    }
}


class A{

    static {
        System.out.println("A 类的静态代码块被调用");
    }
}


class B extends A{
    static {
        System.out.println("B 类的静态代码块被调用");
    }

}
