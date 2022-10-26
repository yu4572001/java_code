package com.yysduty.poly_apply;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){          //本类特有方法
        System.out.println("员工" + getName() + "  is working");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
