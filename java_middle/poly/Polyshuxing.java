package com.yysduty.poly;

import java.util.Scanner;

public class Polyshuxing {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.count);   //编译类型是什么，访问到的属性就是什么
        Sub sub = new Sub();
        System.out.println(sub.count);           //访问到的是sub的成员
    }
}



class Base{      //只有方法重写，没有属性重写
    int count = 10;
}

class Sub extends Base{
    int count = 20;
}