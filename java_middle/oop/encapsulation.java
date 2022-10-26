package com.yysduty.oop;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class encapsulation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("rosesdsdfdgf");
        p1.setAge(180);
        p1.setSalary(15000);
        System.out.println("=============p1===========");
        System.out.println(p1.info());
        System.out.println("=============p2===========");
        Person jeck = new Person("jeck", 31, 20000);
        System.out.println(jeck.info());


    }
}

class Person {
    public String name = "laoliu";          //名字公开
    private int age = 18;           //私有
    private double salary;           //私有

    public Person(String name, int age, double salary) {          //默认构造器
        setSalary(salary);
        setAge(age);
        setName(name);
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字超出长度，已设默认值laoliu");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 80) {
            this.age = age;
        } else {
            System.out.println("年龄设置不合理，已设置默认值18");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "name = " + name + " " + "age = " + age + " " + "salary = " + salary;

    }
}