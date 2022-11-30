package list_;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //List集合类中元素是有序的（即添加顺序和取出顺序是一致的），且可以重复
        list.add("jeck");
        list.add(90);
        list.add("rose");
        list.add("smith");
        list.add("jeck");
        System.out.println(list);

        //List集合类中的元素可以根据索引号存取集合中的元素，集合.get()
        System.out.println(list.get(3));   //smith

    }
}
