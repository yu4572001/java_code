package collection_;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_for {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Book("三国演义","罗贯中",100));
        list.add(new Book("小李飞刀","古龙",80));
        list.add(new Book("红楼梦","曹雪芹",99));

        //遍历集合
        for (Object o :list) {
            System.out.println(o);
        }
        //遍历数组
        int nums[] = {2,41,51,41,61};
        for(int i : nums){
            System.out.println(i);
        }
    }
}
