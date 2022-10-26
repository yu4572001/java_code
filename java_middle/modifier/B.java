package com.yysduty.modifier;

public class B {
    public int a = 1;           //公共，都可以访问
    protected String b = "jeck";    //受保护，不同包不能访问
    int c = 2;                 //默认，不同包不能访问
    private int d = 30;     //私有，只有本类B才能访问，其他都不能

    public void info(){        //公共方法，不同包，类都可以访问
        System.out.println("a = " + a + "  " + "b = " + b + " " + " c = " + c + " " + "d = " + d);

    }
}
