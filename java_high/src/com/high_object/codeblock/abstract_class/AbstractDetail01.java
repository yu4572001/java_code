package com.high_object.abstract_class;

public class AbstractDetail01 {
    public static void main(String[] args) {

        //Animal animal = new Animal();  抽象类不能实例化对象
    }
}

//类里面有抽象方法，其类必须要声明为抽象类
//abstract只能修饰类和方法，不能修饰其他的
abstract class Animal{
    //抽象类可以没有抽象方法，且可以有具体方法

    public void eat(){
        System.out.println("eat...");
    }
}
