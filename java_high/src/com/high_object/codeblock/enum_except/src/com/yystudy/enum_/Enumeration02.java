package com.yystudy.enum_;

//enum关键字实现枚举
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
    }
}
//枚举类

/**
 * 1.使用关键字enum代替class
 * 2.public static final Season SPRING = new Season("春天","温暖");
 * 直接写成 SPRING("春天","温暖")   常量名(实参列表);
 * 3.如果有多个常量对象，使用 , 号分隔开
 * 4.在定义常量对象时，需要写在最前面
 */
enum  Season2 {
    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    ATOMUN("秋天","凉爽"),
    WINTER("冬天","寒冷");
    private String name;
    private String desc;

    private Season2(String name, String desc) {
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
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}