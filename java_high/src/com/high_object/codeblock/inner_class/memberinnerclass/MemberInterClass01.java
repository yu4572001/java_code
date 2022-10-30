package com.high_object.inner_class.memberinnerclass;

//成员内部类
public class MemberInterClass01 {
    public static void main(String[] args) {
        Desk desk = new Desk();

        //两种访问方式
        Desk.Show show = desk.new Show();   //语法，直接访问
        show.info();

        Desk.Show show1 = desk.getShow();   //方法返回一个对象，然后接收
        show1.info();

    }
}


class Desk{
    private String name = "木桌";
    public int price = 900;

    //成员内部类是定义在外部类的成员位置上的(跟属性，方法同级)
    //可以添加任意的访问修饰符
    public class Show{
        public void info() {
            System.out.println("名字：" + name + "价钱：" + price);
        }
    }

    public Show getShow(){
        return new Show();
    }
}
