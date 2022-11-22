package BigInteger_;

import java.math.BigInteger;

public class BigInteger01 {
    public static void main(String[] args) {

        //传入一个字符串大数字
        BigInteger b1= new BigInteger("194818948198497818941");
        BigInteger b2 = new BigInteger("187478191784912789144");

        //加减乘除
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));

        BigInteger b3 = new BigInteger("1000000000");
        System.out.println(b1.divide(b3));
    }
}
