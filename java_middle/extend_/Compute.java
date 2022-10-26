package com.yysduty.extend_;

public class Compute {
    private String CPU;
    private String neicun;
    private String yingpan;

    public Compute(String CPU, String neicun, String yingpan) {
        this.CPU = CPU;
        this.neicun = neicun;
        this.yingpan = yingpan;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getNeicun() {
        return neicun;
    }

    public void setNeicun(String neicun) {
        this.neicun = neicun;
    }

    public String getYingpan() {
        return yingpan;
    }

    public void setYingpan(String yingpan) {
        this.yingpan = yingpan;
    }
}
