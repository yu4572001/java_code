package com.yysduty.extend_;

public class NotePad extends Compute{
    private String color;
    private String brand;

    public NotePad(String CPU, String neicun, String yingpan, String color, String brand) {
        super(CPU, neicun, yingpan);
        this.color = color;
        this.brand = brand;
    }

    public void info(){
        System.out.println("NodePad信息===================");
        System.out.println("品牌 = " + brand + " " + "颜色 = " + color + " " + "CPU = " + getCPU() + " " + "内存 = " + getNeicun() + " " + "硬盘 = " + getYingpan());
    }
}
