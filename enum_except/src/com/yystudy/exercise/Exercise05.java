package com.yystudy.exercise;

public class Exercise05 {
    public static void main(String[] args) {
        Car car = new Car(44);
        car.getair().flow();

        Car car1 = new Car(-10);
        car1.getair().flow();

        Car car2 = new Car(23);
        car2.getair().flow();

    }
}


class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if (temperature > 40){
                System.out.println("当前吹的是冷风");
            }else if (temperature <= 0){
                System.out.println("当前吹的是热风");
            }else {
                System.out.println("当前空调关闭");
            }
        }
    }

    public Air getair(){
        return new Air();
    }
}