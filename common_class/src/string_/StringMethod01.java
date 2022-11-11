package string_;

public class StringMethod01 {
    public static void main(String[] args) {

        //toUpperCase 将字符串转换为大写
        String s = "hello";
        System.out.println(s.toUpperCase());

        //toLowerCase  将字符串转换为小写
        System.out.println(s.toLowerCase());

        //concat   字符串拼接方法
        String s1 = "好好学习";
        System.out.println(s1.concat("天天向上").concat("。。。"));

        //replace   替换字符串中的字符
        String name = "林黛玉，薛宝钗，薛宝钗";
        //将所有的薛宝钗替换为林黛玉
        //这个方法是将替换后的值返回，对之前的字符串不会修改
        System.out.println(name.replace("薛宝钗","林黛玉"));;

        //split按某个符号分割字符串，对于某些字符，需要使用转义字符 |\\等
        //该方法返回的是一个字符数组
        //例：
        String poem = "锄禾日当午，汗滴禾下土，谁之盘中餐，粒粒皆辛苦";
        String poems[] = poem.split("，");    //按“，”分割成四个，并装入数组返回
        //输出：
        //锄禾日当午
        //汗滴禾下土
        //谁之盘中餐
        //粒粒皆辛苦
        for(String i : poems){
            System.out.println(i);
        }

        //转义字符\
        String test = "E:\\java\\java_pro";      //按"\\"进行分割
        String tests[] = test.split("\\\\");   //进行了两次转义，按"\\"进行分割
        //输出
        for(String i : tests){
            System.out.println(i);
        }


        //toCharArray  将一个字符串转为字符数组
        String arr = "abcdefg";
        char arr_[] = arr.toCharArray();   //返回一个字符数组给arr_[]

        //compareTo 比较两个字符串的大小
        /**
         * 如果前面的字符大，则返回正数，否则返回负数
         * 当两个字符长度相等时，如果内容都一样，返回0
         * 当两个字符长度相等时，但字符内容不一样，则前一个字符ASCLL码减去后一个ASCLL码
         * 当两个字符长度不相等时，但前面部分内容与另一个字符串整体相同(或这个字符串整体内容与另一个字符串前一部分相同)，
         * 则返回 前长度 - 后长度
         * 当两个字符长度不相等时，字符内容也不一样，则前一个字符ASCLL码减去后一个ASCLL码
         */
        String a = "jeckb";   //len 5
        String b = "jeck";    //len 4
        System.out.println(a.compareTo(b));  //返回1  5 - 4

        //format格式化，即可以使用占位符
        String na = "jeck";
        int age = 21;
        char sex = '男';
        /**
         * 使用String.format(.....) 会将格式化的内容返回
         * %s，%d，%.2f，%c是占位符
         * %s 表示后面由字符串来替换
         * %d 表示后面由整数来替换
         * %.2f 表示后面由小数来替换，且保留小数点后两位，遵循四舍五入
         * %c 表示后面由字符char来替换
         */
        System.out.println(String.format("大家好，我叫%s，性别%c，我今年%d岁",na,sex,age));


    }
}
