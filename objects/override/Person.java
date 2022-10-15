package com.yysduty.override;
//父类
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {       //父类构造器
        this.name = name;
        this.age = age;
    }

    public String say(){          //自我介绍方法
        return "name = " + name + " " + "age = " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
