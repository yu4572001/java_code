package customgeneric;

import java.util.ArrayList;
import java.util.List;

public class CustomGeneric03 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<A> arrayList3 = new ArrayList<>();
        ArrayList<B> arrayList4 = new ArrayList<>();
        ArrayList<C> arrayList5 = new ArrayList<>();

        //List<?> c  表示可以接受任意类型的泛型
        printCollection1(arrayList1);//√
        printCollection1(arrayList2);//√
        printCollection1(arrayList3);//√
        printCollection1(arrayList4);//√
        printCollection1(arrayList5);//√

        //<? extends A>  表示上限，可以接受A类或者A类的子类
        //printCollection2(arrayList1);//x
       // printCollection2(arrayList2);//x
        printCollection2(arrayList3);//√
        printCollection2(arrayList4);//√
        printCollection2(arrayList5);//√

        //<? super A>   表示下限，可以接受A类或者A类的父类，且不限于直接父类
        printCollection3(arrayList1);//√
       // printCollection3(arrayList2);//x
        printCollection3(arrayList3);//√
       // printCollection3(arrayList4);//x
       // printCollection3(arrayList5);//x
    }


    //<?>  表示可以接受任意类型的泛型
    public static void printCollection1(List<?> c){

    }

    //<? extends A> 表示上限，可以接受A类或者A类的子类
    public static void printCollection2(List<? extends A> c){

    }

    //<? super A> 表示下限，可以接受A类或者A类的父类，且不限于直接父类
    public static void printCollection3(List<? super A> c){

    }
}

class A{}

class B extends A{}

class C extends B{}