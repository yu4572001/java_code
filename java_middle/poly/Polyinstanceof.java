package com.yysduty.poly;

public class Polyinstanceof {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        AA aa = new BB();        //运行类型为BB，instanceof看的是运行类型
        System.out.println(aa instanceof BB);
        System.out.println(aa instanceof AA);

        String str = "hello";
        //System.out.println(str instanceof AA);        错误
        System.out.println(str instanceof Object);  //正确，str对象是Object顶级类的子类创建的

    }


}





class AA{

}

class BB extends AA{

}