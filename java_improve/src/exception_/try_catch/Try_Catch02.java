package exception_.try_catch;

public class Try_Catch02 {
    public static void main(String[] args) {

        try {
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1 / n2);
        } finally {
            System.out.println("finally执行...");
        }

        System.out.println("程序继续...");

    }
}
