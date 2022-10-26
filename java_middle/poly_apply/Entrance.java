package com.yysduty.poly_apply;

//多态的应用----多态参数，熟用instanceof
public class Entrance {
    public static void main(String[] args) {
        Worker worker = new Worker("jeck",5000);
        Manager laowang = new Manager("laowang", 9000, 10000);
        Entrance test = new Entrance();
        System.out.println(worker.getAnnual());
        System.out.println(laowang.getAnnual());
        test.startWork(laowang);
        test.startWork(worker);
    }


    public void startWork(Employee employ){           //向上转型，父类的引用指向了子类对象，下面就可以使用向下转型
        if (employ instanceof Worker){
            ((Worker) employ).work();     //向下转型，调用子类特有方法
        }else if (employ instanceof Manager){
            ((Manager) employ).manage();       //向下转型
        }else {
            //跳过
        }
    }

}
