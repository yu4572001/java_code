package com.high_object.abstract_class;

//抽象类模板设计模式
public class TempPlate_abstractmode {
    public static void main(String[] args) {
        new AA().cal();
        new BB().cal();
    }
}

abstract class Father{
    public void cal(){
        //开始时间
        long start = System.currentTimeMillis();
        job();      //动态绑定机制，会去运行子类中的该方法

        //结束时间
        long end = System.currentTimeMillis();
        System.out.println("程序执行时间为：" + (end - start));

    }

    public abstract void job();    //抽象方法，在子类中重写该方法
}



class AA extends Father{
    @Override
    public void job() {
        int sum = 0;
        for (int i = 1; i < 1000000000; i++) {
            sum += i;
        }
    }
}


class  BB extends Father{
    @Override
    public void job() {
        int sum = 0;
        for (int i = 1; i < 100000000; i++) {
            sum *= i;
        }
    }
}
