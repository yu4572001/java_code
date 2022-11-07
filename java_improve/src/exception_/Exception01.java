package exception_;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        //除数为0，出现异常
        //使用快捷键Ctrl + Alt + t 快速编写try--catch语句
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("程序继续执行");
    }
}
