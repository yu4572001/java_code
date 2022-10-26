package com.yysduty.override;
//子类 继承Person
public class Student extends Person{
    private String id;
    private double score;


    public Student() {
    }
    public Student(String name, int age, String id, double score) {       //子类构造器
        super(name, age);
        this.id = id;
        this.score = score;
    }
    public String say(){            //重写父类say()方法
        return super.say() + " " + "id = " + id + " " + "score = " + score;    //调用父类的say() + 本类的(代码复用)
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
