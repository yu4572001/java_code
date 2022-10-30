package com.high_object.inner_class.staticinnerclass;

//静态内部类
public class StaticInnerClass01 {
    public static void main(String[] args) {
        //外部其他类访问静态内部类   两种访问方式

        //因为类是静态的，所以可以直接使用类名.成员来访问
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.info();

        //编写一个方法，接收返回的静态内部类
        Outer10.Inner10 inner101 = Outer10.getInner10();
        inner101.info();

    }
}


class Outer10{
    private int age = 10;
    private static String name = "ikun";

    //静态内部类是定义在外部类的成员位置，并且有static修饰
    //可以添加访问修饰符
    public static class Inner10{
        //成员内部类与外部类的成员重名时，遵循就近原则，想访问外部类的重名成员，可以使用外部类名.成员名(因为是static)
        private static String name = "小黑子";
        public void info(){
            //只能访问static修饰的成员
            System.out.println("name = " + Outer10.name);
            System.out.println("name = " + name);

        }
    }

    //提供静态内部类，并返回
    public static Inner10 getInner10(){
        return new Inner10();
    }
}