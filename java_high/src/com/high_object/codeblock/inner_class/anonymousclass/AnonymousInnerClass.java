package com.high_object.inner_class.anonymousclass;

//new 接口(){
//};
public class AnonymousInnerClass {
    public static void main(String[] args) {
        /**
         * 匿名内部类
         * 匿名内部类只会实例化对象一次，后面就无法使用该类来创建对象了
         * 编译类型为IA 接口
         * 运行类型实际为  匿名内部类
         * 底层 会自动分配类名：Outer..$..
         * class Outer..$.. implements IA{
         *        @Override
         *        public void cry() {
         *        System.out.println("喵喵叫...");
         *        }
         * }
         */
        IA cat = new IA() {     //类似向上转型
            @Override
            public void cry() {
                System.out.println("喵喵叫...");
            }
        };
        cat.cry();
    }
}


interface IA{
    void cry();
}


