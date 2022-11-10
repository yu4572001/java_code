package wrapper;


public class Exercise {
    public static void main(String[] args) {
        Integer n1 = new Integer(1);
        Integer n2 = new Integer(1);
        //?  n1 与 n2 是两个不同的对象，比较的是地址，所以返回假
        System.out.println(n1 == n2);   //返回false

        //注意：看源码！！！
        //底层用的是Integer.valueOf(200)这个方法
        //如果值是-128到127之间的话，返回的是值，超出这个范围返回的是对象
        //即200返回的是对象，比较的是对象地址，100返回的是100这个值，比较的就是值

        Integer m = 200;
        Integer n = 200;
        System.out.println(m == n);   //返回false

        Integer x = 1;
        Integer y = 1;
        System.out.println(x == y);   //返回true
    }
}
