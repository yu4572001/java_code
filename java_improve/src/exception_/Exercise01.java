package exception_;

import java.util.Scanner;

//循环输入，直到输入一个数字
public class Exercise01 {
    public static void main(String[] args) {
        //inputNum();
        Scanner myscanner = new Scanner(System.in);
        int num;
        String inputStr;
        while (true){
            System.out.print("请输入一个数字：");
            inputStr = myscanner.next();
            try {
                //可能出现异常的代码：
                num = Integer.parseInt(inputStr);
                break;
            } catch (Exception e) {
                System.out.println("请输入一个正确的数字！");
            }
        }

        System.out.println("你输入的数为：" + num);

    }
}

