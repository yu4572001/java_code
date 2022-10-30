package com.high_object.inner_class.anonymousclass;

public class AnonymousInnerClassDetail01 {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.f1();


    }
}

class Outer01{
    private int n1 = 10;
    public void f1(){
        new Person(){
            private int n1 = 100;     //访问重名遵循就近原则
            @Override
            public void hello() {
                System.out.println("匿名内部类重写了Person类的 hello()方法");
                System.out.println("n1 = " + Outer01.this.n1);   //这里访问的是外部类的n1
            }
        }.hello();   //快速调用内部类的方法，类似于匿名对象调用方法
    }
}


class Person{
    public void hello(){
        System.out.println("hello，你好");
    }
}



