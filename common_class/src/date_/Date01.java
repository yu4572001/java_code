package date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {

        //无参构造器：获取当前时间
        //默认的格式是国外的格式，可以进行格式化
        Date date = new Date();
        System.out.println(date);

        /**
         * SimpleDateFormat类来进行日期的格式化
         *创建一个SimpleDateFormat类的对象来指定相应的日期格式
         * 格式中的字母都是规定好的，不能随意更改
         * 然后调用这个格式对象的format方法传入一个日期就可以格式化
         */
        //字母日期例：y M d E
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss E");
        String da = sdf.format(date);
        System.out.println("当前时间为：" + da);

        //sdf.parse方法可以将一段字符串转换为Date类对象，默认的Date形式，前提是字符串必须与sdf对象形式相同
        Date dd = sdf.parse(da);
        System.out.println(dd);
    }
}
