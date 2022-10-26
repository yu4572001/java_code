package com.yysduty.poly;

public class PolyDetail {
    public static void main(String[] args) {


        //向上转型
        //父类的引用指向了子类的对象
        Animal animal = new Cat();         //编译类型为父类animal，运行类型为子类，运行时从子类开始查找
        animal.run();
        animal.eat();
        animal.show();
        //animal.catchMouse();     子类特有方法无法调用，因为对象在创建时，编译类型为父类，能调用那些成员，由编译类型决定，而此方法时子类中的


        //向下转型，强转父类为子类，前提该父类已经指向这个子类的对象
        //父类的引用必须指向的是当前子类的对象

        Cat cat = (Cat) animal;       //编译类型为Cat，运行类型也被强转成Cat
        cat.catchMouse();           //可以调用子类中特有方法

        //Dog dog = (Dog) animal;         错误，animal对象之前指向的是Cat类，Cat类是无法强转成Dog类的，即子类之间是不能相互转的

    }
}
