package com.high_object.single_mode;

//懒汉式单例
public class Single02 {
    public static void main(String[] args) {
        //执行这个并不会创建对象
        System.out.println(Cat.color);
        //这个会创建对象
        Cat cat = Cat.getCat();
        System.out.println(cat);
 
    }
}

/**
 * 1.仍将构造器私有化
 * 2.定义一个static静态对象，但是不new
 * 3.提供一个public的static方法，返回一个对象
 */


class Cat{
    private String name;
    public static String color = "黄色";

    //类内部创建一个对象，设为static，为了一个static方法能够调用，但是不new
    private static Cat cat;

    //私有构造器，外部无法调用
    private Cat(String name) {
        System.out.println("Cat 的构造器被调用");
        this.name = name;
    }

    //向外面提供一个方法，只有调用这个static方法时，才会创建对象并返回
    public static Cat getCat(){
        //如果这个对象为空，则创建
        if (cat == null){
            cat = new Cat("大橘");
        }
        return cat;
    }
}