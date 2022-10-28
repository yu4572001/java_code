package com.high_object.abstract_class;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}


abstract class Test{

    //抽象类也可以有任意成员
    private int n1;
    private static String name = "小航";

    public Test(int n1) {
        this.n1 = n1;
    }

    public void hello(){
        System.out.println("hello");
    }

    //抽象方法不能有主体
    public abstract void hi();
    //public static abstract void hi();       抽象方法不能用privtate，final和static来修饰，因为这些都与方法重写相违背，即不能再子类中重写方法
}

class Test01 extends Test{


    public Test01(int n1) {
        super(n1);
    }

    //其父类为抽象类，所以必须要实现父类的抽象方法，即重写，除非把自己也声明为abstract类
    @Override
    public void hi() {

    }
}
