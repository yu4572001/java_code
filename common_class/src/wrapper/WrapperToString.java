package wrapper;

public class WrapperToString {
    public static void main(String[] args) {

        //包装类 ---> String类
        //方式1
        Integer n1 = 100;
        String str1 = n1 + "";    //字符拼接，转成字符串型
        //方式2
        String str2 = n1.toString();
        //方式3
        String str3 = String.valueOf(n1);

        //String类 ---> 包装类
        String str5 = "123456";
        Integer n2 = Integer.parseInt(str5);         //类型转换，返回一个int类型
        Integer n3 = new Integer(str5);    //用构造器

    }
}
