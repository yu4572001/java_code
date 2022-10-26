package com.yysduty.extend_;

public class Extends01 {
    public static void main(String[] args) {
        //小学生类
        Pupil pupil = new Pupil();
        pupil.name = "xiaoming";    //父类属性
        pupil.age = 12;             //父类属性
        pupil.setScore(66);      //父类方法
        pupil.testing();         //子类方法
        pupil.info();            //父类方法

        //大学生类
        Graduate graduate = new Graduate();
        graduate.name = "ikun";
        graduate.age = 21;
        graduate.setScore(88);       //父类方法
        graduate.testing();          //子类方法
        graduate.info();             //父类方法
    }
}

