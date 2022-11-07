package exception_.throws_;

public class Throws01 {
    public static void main(String[] args) {
        fa();
    }

    public static void fa() /*throws ArithmeticException*/{
        //这里相当于默认隐藏了一个throws，抛出异常给JVM
        int n1 = 10;
        int n2 = 0;
        int res = n1 / n2;
    }
}

class Father{
    public void f1() throws RuntimeException{

    }
}

class Son extends Father{
    @Override
    //子类重写父类的方法时，对抛出的异常规定：重写的方法所抛出的异常类型要么与父类的保持一致，要么是父类抛出异常类型的子类型
    public void f1() throws NullPointerException {
        super.f1();
    }
}