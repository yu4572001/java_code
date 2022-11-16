package StringBuffer_;

public class StringBuffer02 {
    public static void main(String[] args) {
        //String --> StringBuffer

        String str = "hello";
        //1.使用构造器
        StringBuffer stringBuffer = new StringBuffer(str);

        //2.使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);


        //StringBuffer --> String
        StringBuffer stringBuffer2 = new StringBuffer("world");

        //1.使用StringBuffer提供的toString方法
        String str1 = stringBuffer2.toString();

        //2.使用String的构造器来创建，传入StringBuffer
        String str2 = new String(stringBuffer2);

    }
}

