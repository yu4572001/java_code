package arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExercise {

    public static void main(String[] args) {
        Book books[] = new Book[4];
        books[0] = new Book("简爱",122);
        books[1] = new Book("红楼梦",200);
        books[2] = new Book("青年文摘",90);
        books[3] = new Book("java从入门到放弃",50);

        //按价格进行排序
//        Arrays.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o2.getPrice() - o1.getPrice();
//            }
//        });
//
//        for (int i = 0; i < books.length; i++) {
//            System.out.println(books[i]);
//        }

        //按书名长度进行排序
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book i1 = (Book)o1;
                Book i2 = (Book)o2;
                return i1.getName().length() - i2.getName().length();
            }
        });

        System.out.println(Arrays.toString(books));
    }
}


class Book{
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
