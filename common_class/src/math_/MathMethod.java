package math_;

public class MathMethod {
    public static void main(String[] args) {
        //Math常用方法(静态方法)
        //1.绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);  //9

        //2.pow 求幂
        double pow = Math.pow(2,4);
        System.out.println(pow);   //2的4次方

        //3.ceil 向上取整 返回>=该参数的最小整数
        double ceil = Math.ceil(3.66);
        System.out.println(ceil);   //4.0

        //4.floor 向下取整 返回<=该参数的最大整数
        double floor = Math.floor(3.99);
        System.out.println(floor);   //3.0

        //5.round 四舍五入
        double round = Math.round(5.6);
        System.out.println(round);  //6.0

        //6.sqrt 开方
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);  //3.0

        //7.random 求随机数
        //返回一个[0,1)之间的一个double数，注：可以使用强转成其他数
        //例：返回一个2-7之间的随机数
        for (int i = 0; i < 10; i++) {
            int num = (int)(2 + Math.random() * 6);
            System.out.println(num);
        }
        //公式：放回a - b之间的随机数
        //(int)(a + Math.random() * (b - a + 1))

    }
}
