package com.yysduty.poly_apply;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){          //本类特有方法
        System.out.println("经理" + getName() + "  is managing");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + this.bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
