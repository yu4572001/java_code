package com.high_object.inner_class.anonymousclass;

//new 类(){
//};
public class AnonymousInnerClassDetail {
    public static void main(String[] args) {

        /**相当于继承关系
         * class Outer04$2 extends Father{
         *      。。。。。。
         * }
         */
        Father father = new Father("jeck"){     //类似向上转型
            @Override
            public void hi() {
                System.out.println("我不叫" + getName());
            }

            public void test(){
                System.out.println("这是一个test...");
            }
        };
        father.hi();
        //father.test();      //特有方法不可调用(向上转型)

    }
}


class Father{
    private String name;

    public Father(String name) {
        this.name = name;
    }
    public void hi(){
        System.out.println("我是" + name);
    }

    public String getName() {
        return name;
    }
}
