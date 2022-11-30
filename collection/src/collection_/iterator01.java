package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterator01 {
    public static void main(String[] args) {
        //创建数组集合
        Collection list = new ArrayList();
        list.add(new Book("三国演义","罗贯中",100));
        list.add(new Book("小李飞刀","古龙",80));
        list.add(new Book("红楼梦","曹雪芹",99));
        //直接将list集合中的元素全部输出
        System.out.println(list);

        //使用这个集合的iterator迭代器来依次访问
        /**
         * Book{name='三国演义', author='罗贯中', price=100.0}
         * Book{name='小李飞刀', author='古龙', price=80.0}
         * Book{name='红楼梦', author='曹雪芹', price=99.0}
         */
        Iterator iterator = list.iterator();    //先得到该集合的迭代器
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
        //此时next()指针指向的是集合中最后一个元素，不能再下移
        //如果还想要再次遍历，则需要将next()指针重置位置
        iterator = list.iterator();



    }
}


class Book{
    String name;
    String author;
    double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}