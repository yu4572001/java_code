package com.yysduty.extend_.extends_detail;
//子类
public class Sub extends Base {         //继承父类Base类
    public Sub() {
        super("smith",18);   //super()可以指定调用父类哪个有参构造器
        System.out.println("子类无参构造器被调用...");
    }



    public Sub(String name, int age) {
        super(name, age);
        System.out.println("子类的Sub(String name, int age)构造器被调用...");

    }
}
