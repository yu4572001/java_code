package list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_for {
    public static void main(String[] args) {
        //List接口实现的类的遍历方式有三种
        List list = new ArrayList();
        list.add("jeck");
        list.add("rose");
        list.add("smith");
        list.add("marry");

        System.out.println("===========迭代器===========");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }

        System.out.println("===========增强for===========");
        for (Object o :list) {
            System.out.println(o);
        }

        System.out.println("===========普通for===========");
        for (int i = 0; i < list.size(); i++) {   //集合中获取大小是sizeof()，不是length
            System.out.println(list.get(i));
        }

    }
}
