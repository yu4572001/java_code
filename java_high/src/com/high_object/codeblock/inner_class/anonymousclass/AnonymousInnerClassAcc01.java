package com.high_object.inner_class.anonymousclass;

public class AnonymousInnerClassAcc01 {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        phone.alarmclock(new Bell() {       //匿名内部类当实参传递
            @Override
            public void ring() {
                System.out.println("懒猪起床了...");
            }
        });

        phone.alarmclock(new Bell() {      //再次调用该方法
            @Override
            public void ring() {
                System.out.println("小伙伴上课了。。。");
            }
        });
    }
}

//接口
interface Bell{
    void ring();
}

class CellPhone{
    public void alarmclock(Bell bell){     //向上转型，编译类型为Bell接口
        bell.ring();   //动态绑定
    }
}
