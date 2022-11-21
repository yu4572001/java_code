package date_;

import java.util.Calendar;

public class Date02 {
    public static void main(String[] args) {

        //得到日期对象
        Calendar date = Calendar.getInstance();

        //想要具体输出日期，则调用Calendar中具体的属性即可
        System.out.println("年：" + date.get(Calendar.YEAR));
        //Calendar中的月份是从0开始编号，所以要加1
        System.out.println("月：" + date.get(Calendar.MONTH) + 1);
        System.out.println("日：" + date.get(Calendar.DAY_OF_MONTH));
        System.out.println("时：" + date.get(Calendar.HOUR));
        System.out.println("分：" + date.get(Calendar.MINUTE));
        System.out.println("秒：" + date.get(Calendar.SECOND));

        //该类中没有格式化方法，需要自己灵活组合这些属性来实现格式化输出

    }
}
