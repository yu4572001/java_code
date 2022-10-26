package com.yysduty.extend_;

public class PC extends Compute{
    private String brand;

    public PC(String CPU, String neicun, String yingpan, String brand) {
        super(CPU, neicun, yingpan);
        this.brand = brand;
    }

    public void info(){
        System.out.println("PC信息===================");
        System.out.println("品牌 = " + brand + " " + "CPU = " + getCPU() + " " + "内存 = " + getNeicun() + " " + "硬盘 = " + getYingpan());
    }

}

