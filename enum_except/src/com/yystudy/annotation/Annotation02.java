package com.yystudy.annotation;

@SuppressWarnings("all")   //该注解用于抑制警告信息
public class Annotation02 {
    public static void main(String[] args) {
        A a = new A();
        a.say();
    }
}

/**
 * @Deprecated 修饰某个元素，表示该元素已经过时
 *
 * 即不推荐使用，但是仍然可以使用
 *
 * @Deprecated 通常用于版本升级过度使用
 */

@SuppressWarnings("all")   //该注解用于抑制警告信息
@Deprecated
class A {
    @Deprecated
    String name;
    @Deprecated
    public void say(){}
}
