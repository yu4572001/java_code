package exception_.try_catch;

public class Try_Catch01 {
    public static void main(String[] args) {
        try {
            String name = "好好学习";
            int num1 = Integer.parseInt(name);
            //如果前面出现异常，后面的代码就不会执行，直接执行catch
            System.out.println("name = " + name);

            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;

        } catch (NumberFormatException e) {
            //如果异常没有发生，catch中的代码不会执行
            System.out.println("异常信息：" + e.getMessage());
        //可以有多个catch，但子类异常必须要在前面，父类异常Exception要在后面，如果发生异常，只会匹配到一个catch
        } catch (ArithmeticException e){
            System.out.println("算数异常：" + e.getMessage());
        } catch (Exception e){
            System.out.println("发生异常...");
        } finally {
            //不管有没有出现异常，都会执行finally中的代码
            System.out.println("finally 被调用...");
        }

        System.out.println("程序继续执行...");
    }
}


