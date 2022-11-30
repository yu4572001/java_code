package list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jeck");
        list.add("rose");
        System.out.println(list);
        //add(int index, object o)
        list.add(1,"ikun");
        System.out.println(list);   //[jeck, ikun, rose]

        //addAll(int index, Collection else)
        List list1 = new ArrayList();
        list1.add("张三");
        list1.add("李四");
        list.addAll(1,list1);
        System.out.println(list);   //[jeck, 张三, 李四, ikun, rose]

        //get(int index) 获取指定索引的元素
        System.out.println(list.get(3));   //ikun

        //indexOf(Object obj)  获取obj在集合中首次出现的位置
        System.out.println(list.indexOf("ikun"));   //3

        //lastIndexOf(Object obj) 获取obj在集合中最后出现的位置
        list.add("ikun");
        System.out.println(list);
        System.out.println(list.lastIndexOf("ikun"));  //5

        //remove(int index)  移除指定位置的元素，并返回此元素
        list.remove(0);
        System.out.println(list);   //移除jeck

        //set(int index, Object obj) 将指定位置的元素进行替换
        list.set(1,"王二麻子");
        System.out.println(list);   //[张三, 王二麻子, ikun, rose, ikun]

        //subList(int fromIndex, int toIndex)  获取指定范围内的集合内的元素，相当于subString
        List newlist = list.subList(1,3);    //此范围为前闭后开
        System.out.println(newlist);


    }
}
