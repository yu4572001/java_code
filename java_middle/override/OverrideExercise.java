package com.yysduty.override;



public class OverrideExercise {
    public static void main(String[] args) {
        Student jeck = new Student("jeck", 21, "123456", 91);
        System.out.println(jeck.say());
        Person laowang = new Person("laowang", 18);
        System.out.println(laowang.say());
    }
}
