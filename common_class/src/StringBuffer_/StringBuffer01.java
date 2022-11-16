package StringBuffer_;

public class StringBuffer01 {
    public static void main(String[] args) {
        //创建一个大小为 16的 char[]数组，用于存放字符内容
        //调用默认构造器的话，char[]，也就是value大小默认为16
        StringBuffer stringBuffer = new StringBuffer();

        //也可以通过构造器来指定数组大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //给定一个字符来创建StringBuffer，其大小为字符.length() + 16
        StringBuffer hello = new StringBuffer("hello");   //大小为 5 + 16 = 21


    }
}
