package com.yystudy.exercise;

public class Exercise06 {
    public static void main(String[] args) {
        Color red = Color.RED;
        red.show();


        //switch()中放的是枚举对象，case中放的是枚举值的名字，然后与switch中的枚举值进行比较s
        switch (Color.BLACK){
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            default:
                System.out.println("没有匹配到相应颜色");
        }
    }
}

interface Color_inter{
    public void show();
}

enum Color implements Color_inter{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(redValue + "," + greenValue + "," + blueValue);
    }
}
