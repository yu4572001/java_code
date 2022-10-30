package com.high_object.inner_class.inner01;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        System.out.println("n1 = " + outer.getN1());
        //Inner inner = new Inner()   错误，外部其他类是不能访问内部局部类的，也不能实例化对象(因为内部局部类是一个局部变量)
    }
}


class Outer{
    private int n1 = 10;
    private void say(){
        System.out.println("Outer 的方法say");

    }

    /**
     * 1.局部内部类是定义在外部类的局部位置，通常在方法，代码块
     */

    public void test(){
        //类不能添加访问修饰符，但是可以使用final修饰，使其不能被继承
        //作用域：仅仅在定义它的方法或代码块中
        class Inner{
            //局部内部类与外部类的成员重名时，遵循就近原则
            //想访问外部类的成员，可以使用外部类名.this.成员名
            private int n1 = 100;

            public void see(){
                //可以直接访问外部类的所有成员，包括私有的
                System.out.println("n1 = " + n1);
                say();
            }
        }
        Inner inner = new Inner();
        inner.see();
    }

    {
        class inner01{
            //...
        }
    }

    public int getN1() {
        return n1;
    }
}
