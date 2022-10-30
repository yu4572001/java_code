package com.high_object.inner_class.anonymousclass;

public class AnonymousInnerClassAcc {
    public static void main(String[] args) {
        speak(new UU() {     //直接将匿名内部类当成实参进行传递，只使用一次
            @Override
            public void say() {
                System.out.println("hello，你好");
            }
        });

    }

    public static void speak(UU uu){    //这里相当于向上转型
        uu.say();      //动态绑定
    }

}

interface UU {
    void say();
}
