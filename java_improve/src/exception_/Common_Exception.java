package exception_;

public class Common_Exception {
    public static void main(String[] args) {
        A b = new B();    //向上转型
        B b1 = (B)b;       //向下转型

        C c = (C)b;  //错误，抛出ClassCastException异常

        String name = "好好学习";
        int num = Integer.parseInt(name);   //错误，无法强转，抛出NumberFormatException异常
    }
}

class A{}
class B extends A{}
class C extends A{}
