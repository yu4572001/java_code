package com.yysduty.poly_array;

//多态数组
public class Entrance {
    public static void main(String[] args) {
        Person[] persons= new Person[5];
        persons[0] = new Person("smith",60);         //本类
        persons[1] = new Student("jeck",18,88.88);    //多态向上转型
        persons[2] = new Student("tom",21,66);
        persons[3] = new Teach("laowang",54,9000);     //多态向上转型
        persons[4] = new Teach("rose",45,10000);

        for (int i = 0; i < persons.length; i++) {      //循环遍历数组对象中的say()方法
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student){
                Student student = (Student)persons[i];      //向下转型，进行子类强转来使用student类的特有方法
                student.study();        //使用子类特有方法
            }else if(persons[i] instanceof Teach){
                Teach teach = (Teach)persons[i];
                teach.teachcourse();     //使用子类特有方法        两部可以简写为：((Teach)persons[i].teachcourse())
            }else if (persons[i] instanceof Person){
                //跳过
            }else {
                System.out.println("类型有误！");
            }


        }
    }
}
