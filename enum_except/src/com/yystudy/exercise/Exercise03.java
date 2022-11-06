package com.yystudy.exercise;


public class Exercise03 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();

        cellphone.testwork(new Calcul() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 199, 128.22);

        cellphone.testwork(new Calcul() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        },342, 12.34);

    }
}


interface Calcul{
    public double work(double n1, double n2);
}

class Cellphone {

    public void testwork(Calcul calcul, double n1, double n2){
        double result = calcul.work(n1,n2);
        System.out.println("计算的结果为：" + result);
    }
}
