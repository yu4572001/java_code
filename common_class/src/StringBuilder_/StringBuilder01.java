package StringBuilder_;

//三个String类的运行时间比较
public class StringBuilder01 {
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;

        StringBuffer stringBuffer = new StringBuffer("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            stringBuffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("stringBuffer 所用时间为：" + (endTime - startTime));





        StringBuilder stringBuilder = new StringBuilder(" ");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            stringBuilder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("stringBuilder 所用时间为：" + (endTime - startTime));



        String str = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            str = str.concat(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("String 所用时间为：" + (endTime - startTime));
    }
}
