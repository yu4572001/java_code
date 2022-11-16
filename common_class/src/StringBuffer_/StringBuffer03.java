package StringBuffer_;

import java.util.Scanner;

public class StringBuffer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("请输入商品名称：");
        StringBuffer str1= new StringBuffer(scanner.next());
        System.out.println("请输入商品价格：");
        double prise = scanner.nextDouble();

        System.out.println("");

    }
}
