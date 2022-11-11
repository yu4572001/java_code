package string_;

public class StringMethod {
    public static void main(String[] args) {
        //equals  比较字符串内容是否相同
        String str = "jeck";
        String str1 = "jecK";
        System.out.println(str.equals(str1));   //false
        //equalsIgnoreCase   忽略大小写，比较字符串内容是否相同
        String str2 = "jeck";
        String str3 = "jecK";
        System.out.println(str2.equalsIgnoreCase(str3));   //true
        //length  获取字符串的长度
        String name = "rose";
        System.out.println(name.length());   //4
        //indexOf  获取字符在字符串中第一次出现的索引值，注：索引值从0开始
        String s1 = "aaajjj@ss";
        System.out.println(s1.indexOf('@'));     //6
        //lastIndexOf   获取字符在字符串中最后一次出现的索引
        String s2 = "aj@sfh@ssj@a";
        System.out.println(s2.lastIndexOf('@'));    //10
        //substring    截取指定范围的子串
        String say = "hello,老王";
        System.out.println(say.substring(1,7));   //ello,老 截取从下标1开始到第7位(不是从0开始)
        System.out.println(say.substring(6));     //输出从下标6开始后面的子串



    }
}
