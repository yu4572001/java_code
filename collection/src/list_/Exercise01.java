package list_;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国",99,"罗贯中"));
        list.add(new Book("红楼梦",120,"曹雪芹"));
        list.add(new Book("西游记",50,"吴承恩"));


        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book book = (Book)list.get(j);
                Book book1 = (Book)list.get(j + 1);
                if (book.getPrice() > book1.getPrice()){
                    list.set(j, book1);
                    list.set(j + 1, book);
                }
            }
        }


        for (Object o :list) {
            System.out.println(o);
        }


    }
}


class Book{
    private String name;
    private double price;
    private String anothor;

    public Book(String name, double price, String anothor) {
        this.name = name;
        this.price = price;
        this.anothor = anothor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAnothor() {
        return anothor;
    }

    public void setAnothor(String anothor) {
        this.anothor = anothor;
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t" +
                "价格：" + price + "\t" +
                "作者：" + anothor;
    }
}
