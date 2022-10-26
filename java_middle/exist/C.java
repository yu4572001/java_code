package com.yysduty.exist;

import com.yysduty.modifier.B;

public class C {
    public static void main(String[] args) {
        B testb = new B();
        testb.info();   //可以访问，因为info()方法是public
        int aa = testb.a;      //可以访问，a是public
        //testb.b            //不能访问，b是protecded
    }
}
