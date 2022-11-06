package com.yystudy.exercise;

public class Exercise04 {
    public static void main(String[] args) {
        A a = new A();
        a.local_class();
    }
}

class A{
    private final String NAME = "rose";
    public void local_class(){
        class B{
            private final String NAME = "jeck";
            public void show(){
                System.out.println("name = " + NAME + "外部类name = " + A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}
