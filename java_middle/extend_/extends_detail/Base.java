package com.yysduty.extend_.extends_detail;
//父类
public class Base {

    public String name;
    private double score;
    public int age;

    public Base() {         //默认构造器
        System.out.println("父类无参构造器被调用...");
    }

    public Base(String name, int age) {        //构造器重载
        System.out.println("父类Base(String name, int age)构造器被调用...");
        this.name = name;
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void info(){
        System.out.println("name = " + name + " " + "age = " + age + " " + "score = " + score);
    }
}
