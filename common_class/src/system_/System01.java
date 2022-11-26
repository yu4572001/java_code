package system_;

import java.util.Arrays;

public class System01 {
    public static void main(String[] args) {


//        System.out.println("ok1");
//        System.exit(0);
//        System.out.println("ok2");


        int num1[] = {1,2,3,4,5};
        int num2[] = new int[5];
        //传入五个参数来拷贝数组，通常用Arrays.copyOf()
        System.arraycopy(num1,0,num2,0,num1.length);
        System.out.println(Arrays.toString(num2));
    }
}
