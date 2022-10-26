package com.high_object.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //System.out.println(Cat.n1);
        Cat cat = new Cat();

    }
}


class Cat{
    public static int n1 = getnum();

    static {
        System.out.println("静态代码块被调用...");
    }

    public static int getnum(){
        System.out.println("getnum 被调用");
        return 100;
    }
}
