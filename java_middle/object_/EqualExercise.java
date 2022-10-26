package com.yysduty.object_;


//重写父类Object的equals()方法
public class EqualExercise {
    public static void main(String[] args) {
        Person person1 = new Person("jeck", 21, '男');
         Person person2 = new Person("jeck", 21, '男');
        System.out.println(person1.equals(person2));
        System.out.println(person1);

    }
}


class Person {
    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public boolean equals(Object obj) {       //向上转型，父类Object的引用指向了子类Person
        if (this == obj) {                //引用比较，如果地址一样，即是同一个对象
            return true;
        }

        if (obj instanceof Person) {             //判断传入的对象是不是Person类创建的
            Person p = (Person) obj;       //向下转型，以此来访问到传入对象的属性
            return this.name.equals(p.name) && this.age == p.age && this.sex == p.sex;   //这里的equals调用的是String类中的方法
        }

        return false;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}