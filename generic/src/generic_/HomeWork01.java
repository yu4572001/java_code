package generic_;

import java.util.ArrayList;
import java.util.Comparator;

public class HomeWork01 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack",12000,new MyDate(2001,1,1)));
        employees.add(new Employee("rose",9999,new MyDate(1998,12,12)));
        employees.add(new Employee("smith",19000,new MyDate(1995,11,11)));
        employees.add(new Employee("jack",20000,new MyDate(1992,1,1)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName() == o2.getName()){
                   return o1.getBirthday().compareTo(o2.getBirthday());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee employee :employees) {
            System.out.println(employee);
        }


    }
}


class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}


class MyDate implements Comparable<MyDate>{   //实现Comparable接口，并指定类型为MyDate
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int sum(){
        return this.year + this.month + this.day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public int compareTo(MyDate o) {     //重写compareTo方法 封装！！！
        int yearMin = this.year - o.year;
        if (yearMin != 0){
            return yearMin;
        }
        int monthMin = this.month - o.month;
        if (monthMin != 0){
            return monthMin;
        }
        return this.day - o.day;
    }
}