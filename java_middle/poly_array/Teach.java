package com.yysduty.poly_array;

public class Teach extends Person{
    private double salary;

    public Teach(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + " " + "salary = " + salary;
    }

    public void teachcourse(){
        System.out.println("老师" + getName() + "正在教java。。。");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
