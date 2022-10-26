package com.yysduty.encap;
//封装练习， Account     AccountTest执行
public class Account {
    private String name;
    private double salary;
    private String password;

    public Account() {
    }

    public Account(String name, double salary, String password) {
        setName(name);
        setPassword(password);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 10) {
            this.name = name;
        } else {
            System.out.println("名字长度为2位-4位，已设置名字位ikun");
            this.name = "ikun";
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 20) {
            this.salary = salary;
        } else {
            System.out.println("工资必须要大于20，已设置工资为2000");
            this.salary = 2000;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码必须是六位，已设置默认密码000000");
            this.password = "000000";
        }
    }

    public String info() {
        return "name = " + name + " " + "password = " + password + " " + "salary = " + salary;
    }
}
