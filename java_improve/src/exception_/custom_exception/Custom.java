package exception_.custom_exception;

public class Custom {
    public static void main(String[] args) {
        AgeException.f1(30);
    }

}

//一般情况，自定义异常都是继承RuntimeException
//好处是可以使用默认的处理机制，即比较方便
class AgeException extends RuntimeException{
    //message为异常提示信息
    public AgeException(String message) {
        super(message);
    }

    public static void f1(int age){
        if (!(age > 18 && age < 80)){
            //抛出异常信息
            throw new AgeException("年龄设置错误！");
        }
        System.out.println("年龄设置正确");
    }

}
