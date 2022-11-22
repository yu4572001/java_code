package BigInteger_;

import java.math.BigDecimal;

public class BigDecimal01 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("194718.817481791461871");
        BigDecimal b2 = new BigDecimal("378183.9891287973491347");

        //加减乘除操作：调用相应的方法即可
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));

        //作除法运算时，可能会出现无限循环小数，会直接报异常
        //处理方法：在divide方法中的参数加入BigDecimal.ROUND_CEILING，就会保留分子的精度
        System.out.println(b1.divide(b2,BigDecimal.ROUND_CEILING));
    }
}
