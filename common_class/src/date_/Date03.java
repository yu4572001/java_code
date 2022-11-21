package date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date03 {
    public static void main(String[] args) {

        //调用LocalDateTime类中静态方法now(),返回一个LocalDateTime对象
        LocalDateTime now = LocalDateTime.now();

        //LocalDateTime中既有时间属性又有日期属性
        System.out.println(now);
        System.out.println("年：" + now.getYear());
        System.out.println("月：" + now.getMonthValue());
        System.out.println("日：" + now.getDayOfMonth());
        System.out.println("时：" + now.getHour());
        System.out.println("分：" + now.getMinute());
        System.out.println("秒：" + now.getSecond());

        //LocalDate中只有日期年月日属性和方法
        //LocalTime中只有时间时分秒属性和方法
        LocalDate now1 = LocalDate.now();
        LocalTime now2 = LocalTime.now();

        //格式化输出日期时间
        DateTimeFormatter patt = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss E");
        String nowtime = patt.format(now);
        System.out.println("格式化的时间日期：" + nowtime);

    }
}
