package com.yysduty.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account p1 = new Account();
        p1.setName("zhangsan");
        p1.setPassword("29383938");
        p1.setSalary(15124);
        System.out.println("============zhangsan的信息===========");
        System.out.println(p1.info());


        //调用默认构造器
        Account lisi = new Account("lisi", 10, "123456");
        System.out.println("============lisi的信息===========");
        System.out.println(lisi.info());
    }
}
