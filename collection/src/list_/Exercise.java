package list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i = 0; i < 15; i++) {
            list.add("hello  " + i);
        }
        System.out.println(list);

        list.add(1,"老六儿");
        System.out.println(list);

        System.out.println(list.get(4));

        list.remove(5);
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

    }
}
