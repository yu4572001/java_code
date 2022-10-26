package com.yysduty.extend_;

//父类Students，共享属性和方法
public class Students {
    public String name;
    private double score;
    public int age;


    public void setScore(double score) {
        this.score = score;
    }

    public void info() {
        System.out.println("name = " + name + " " + "age = " + age + " " + "score = " + score);
    }

}
