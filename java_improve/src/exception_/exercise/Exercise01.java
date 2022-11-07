package exception_.exercise;


import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("请输入两个要相处的数：");
        int n1 = 0;
        int n2 = 0;
        try {
            n1 = myscanner.nextInt();
            n2 = myscanner.nextInt();
            cal(n1,n2);
        } catch (Exception e) {
            System.out.println("请输入正确的数字！");
        }
    }


    public static void cal(int n1, int n2){
        try {
            double res = n1 / n2;
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("除数不能为0！");
        }
    }
}


