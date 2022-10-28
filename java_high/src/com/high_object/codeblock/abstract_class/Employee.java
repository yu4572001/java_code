package com.high_object.abstract_class;

public class Employee {
    public static void main(String[] args) {
        Manager 老王 = new Manager("老王", 10000, 666);
        CommonEmployee ikun = new CommonEmployee("ikun", 6666, 111);
        老王.work();
        ikun.work();
    }

}




 abstract class Employee_ {
    private String name;
    private double sal;
    private int id;

     public Employee_(String name, double sal, int id) {
         this.name = name;
         this.sal = sal;
         this.id = id;
     }

     public abstract void work();

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getSal() {
         return sal;
     }

     public void setSal(double sal) {
         this.sal = sal;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }
 }


 class Manager extends Employee_ {
     private double bonus;
     public Manager(String name, double sal, int id) {
         super(name, sal, id);
     }



     @Override
     public void work() {
         System.out.println("经理" + getName() + "工作中...");
     }
 }


 class CommonEmployee extends Employee_ {
     public CommonEmployee(String name, double sal, int id) {
         super(name, sal, id);
     }

     @Override
     public void work() {
         System.out.println("普通员工" + getName() + "工作中...");
     }
 }