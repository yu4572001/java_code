package com.yystudy.enum_;

public class EnumExercise {
    public static void main(String[] args) {

        //得到枚举类Week的所有常量对象，是一个数组，将其存入week[]中
        Week week[] = Week.values();
        System.out.println("所有星期的信息如下：");
        for (Week i : week){
            System.out.println(i.getName());
        }
    }
}



enum Week {
    MONDAY("星期一"),
    TUEDDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
