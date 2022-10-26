package com.yysduty.extend_.extends_detail;

import org.omg.PortableInterceptor.SUCCESSFUL;
//main方法入口
public class ExtendDatail {
    public static void main(String[] args) {
        Sub sub01 = new Sub();
        System.out.println(sub01.name + " " + sub01.age);
        sub01.info();
        System.out.println("===================");
        Sub sub02 = new Sub("jeck",12);
        sub02.info();
    }
}
