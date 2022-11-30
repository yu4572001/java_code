package collection_;

import java.util.ArrayList;
import java.util.List;

public class Collection01 {
    public static void main(String[] args) {
        //集合当中可以存储不同类型的元素对象
        //使用这个接口指向其实现了这个接口的类的对象，这个就能使用其Collection接口中的方法
        //add()添加单个元素
        List list = new ArrayList();
        list.add(100);   //相当于list.add(new Integer(100))，当中的元素都是对象
        list.add(true);
        list.add("jeck");
        System.out.println(list);  //[100, true, jeck]

        //remove() 删除指定元素
        list.remove(1);     //删除下标为0的元素
        list.remove("jeck");     //删除”jeck“这个元素

        //contains() 查找指定元素是否存在，返回布尔值
        System.out.println(list.contains(100));   //true

        //size()  获取集合中的元素个数
        System.out.println(list.size());     //1

        //isEmpty()   判断集合是否为空
        System.out.println(list.isEmpty());  //false

        //clear()   清空集合中的元素
        list.clear();
        System.out.println(list);   //[] 为空了

        //addAll()   添加多个元素进集合中
        ArrayList list2 = new ArrayList();
        list2.add(999);
        list2.add(true);
        list2.add("rose");
        list.addAll(list2);   //将list2集合添加进list中
        System.out.println(list);  //[999, true, rose]

        //containsAll()  查找多个元素是否存在
        System.out.println(list.containsAll(list2));   //true

        //removeAll()    删除多个元素
        list.removeAll(list2);   //将list中的list2的元素都删除掉
        list.add(100);
        System.out.println(list);     //[100]

    }
}
