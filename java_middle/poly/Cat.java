package com.yysduty.poly;

public class Cat extends Animal{
    public void eat(){               //重写父类方法
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){             //子类特有方法
        System.out.println("猫抓老鼠");
    }
}
