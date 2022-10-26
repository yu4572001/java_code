package com.yysduty.poly_dynamicbind;
//动态绑定机制，即调用方法时，总是从运行类型的类开始查找这个方法，但属性不会，哪里声明，哪里调用
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();            //向上转型   编译类型为A，运行类型为B
        System.out.println(a.sum());   //40     //30，注销掉子类中此方法
        System.out.println(a.sum1());  //30     //20，注销掉子类中此方法
    }
}
class A{
    public int i = 10;
    public int sum(){
        return getI() + 10;     //调用这个GetI()方法会按照运行类型来查找，即返回子类调用  20+10=30
    }
    public int sum1(){
        return i + 10;        //属性没有动态绑定，所以i的值仍为10       10+10=20
    }
    public int getI() {
        return i;
    }
}
class B extends A{
    public int i = 20;
//    public int sum() {            //重写
//        return i + 20;
//    }
//    public int sum1(){               //重写
//        return i + 10;
//    }
    public int getI() {                //重写
        return i;      //返回20
    }
}