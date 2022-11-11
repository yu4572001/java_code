package string_;

public class String02 {
    public static void main(String[] args) {
        String str1 = "dayday";
        String str2 = "up";


        /**
         * 注；两个常量相加是在池中进行拼接，如果有这个字符常量就直接返回地址，没有就创建
         *
         * 两个字符变量进行拼接，是在堆中创建一个String对象，
         * 其value值指向池中的这两个字符常量的拼接值，并将该String对象返回
         */
        String str3 = "dayday" + "up";   //这个是常量池中的字符常量
        String str4 = str1 + str2;       //这个是堆中的String对象，其value值指向池中的这两个字符常量的拼接值


    }
}
