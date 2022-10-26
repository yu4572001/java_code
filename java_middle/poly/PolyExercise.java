package com.yysduty.poly;

public class PolyExercise {
    public static void main(String[] args) {
        Ssub ssub = new Ssub();
        System.out.println(ssub.count);  //20
        ssub.display();     //20

        Bbase bbase = ssub;           //向上转型，bbase与ssub指向的是同一片对象空间
        System.out.println(bbase == ssub);   //true
        System.out.println(bbase.count);    //10，访问属性看编译类型
        bbase.display();    //20，访问方法看运行类型
    }

}




class Bbase{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}


class Ssub extends Bbase {
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }

}