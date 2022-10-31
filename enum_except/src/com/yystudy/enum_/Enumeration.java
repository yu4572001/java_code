package com.yystudy.enum_;


public class Enumeration {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
    }
}

//自定义类实现枚举

/**
 *1.构造器私有化
 *2.在本类内部创建对象
 *3.对外暴露该对象（添加public static final关键字）
 *4.可以提供Get方法，但不要Set方法
 */
class Season{
    private String name;
    private String desc;

    public static final Season SPRING = new Season("春天","温暖");
    public static final Season SUMMER = new Season("夏天","炎热");
    public static final Season ATOMUN = new Season("秋天","凉爽");
    public static final Season WINTER = new Season("冬天","寒冷");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
