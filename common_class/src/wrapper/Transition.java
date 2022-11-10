package wrapper;

//封箱，装箱
public class Transition {
    public static void main(String[] args) {

        //手动封箱，手动拆箱
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //拆箱
        int n2 = integer.intValue();


        int n10 = 200;
        //自动封箱
        Integer integer2 = n10;    //实际底层使用的是 Integer.valueOf(n10)这个方法
        //自动拆箱
        int i = integer2;      //底层使用的是integer2.intValue()这个方法

    }
}
