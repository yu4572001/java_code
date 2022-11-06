package com.yystudy.annotation;

public class Annotation01 {
    public static void main(String[] args) {

    }
}



class Father{
    public void say(){}
}


class Son extends Father{
    /**
     * @Override 注解写在方法之上，表示该方法重写了父类的这个方法
     * 如果写上了@Override注解，编译器就会检查该方法是否真的重写了父类的这个方法，如果的确
     * 重写了，则编译通过，如果没有重写，则编译出错
     */

    @Override
    public void say() {
        super.say();
    }
}