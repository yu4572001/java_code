package com.high_object.single_mode;

public class Single01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}

/**
 * 1.将构造器私有化
 * 2.在类的内部直接创建对象(该对象是static)
 * 3.提供一个公共的static方法，返回该对象
 */


//单例模式饿汉式，理解：不管有没有使用这个对象，先直接创建好(很急！)
class GirlFriend{
    private String name;

    //在类的内部创建对象，设为statci，类加载时就会创建
    //为了能在static方法中，返回gf对象，所以要设为static
    private static GirlFriend gf = new GirlFriend("小红");

    //将构造器私有化，外部无法new对象
    private GirlFriend(String name) {
        this.name = name;
    }


    //提供一个static方法，使外部能够得到这个对象
    public static GirlFriend getInstance(){
        return gf;
    }
}