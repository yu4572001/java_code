package com.yysduty.extend_;

//子类graduate继承父类Students的方法和属性
public class Graduate extends Students {
    //自己独特属性和方法
    public void testing(){
        System.out.println("name " + name + "正在考大学数学");
    }
}
