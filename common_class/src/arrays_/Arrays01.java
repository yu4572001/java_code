package arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    public static void main(String[] args) {

        //1.toString方法，显示数组信息，相当于遍历数组
        int arr1[] = {2,41,5,12,7,1,71};
        System.out.println(Arrays.toString(arr1));

        /**2.sort方法，对数组进行排序
         * 因为数组是引用类型，所以通过sort排序后，会直接影响到数组中的内容
         * sort有很多重载方法，可以通过传入一个接口与Comparator接口实现定制排序
         * 调用定制排序时，需要传入两个参数：（1）待排的数组
         *                 （2）实现了Comparator接口的匿名内部类，要求实现compare方法
         */
        //普通排序
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //定制排序
        Integer arr2[] = {2,541,51,13,6,1,3,65};
        Arrays.sort(arr2, new Comparator(){   //这里使用的是匿名内部类实现一个接口，当作一个参数来使用
            @Override       //重写方法，根据动态绑定机制，调用这个方法时，会使用这里的方法，而不是接口中的
            public int compare(Object o1, Object o2) {   //向上转型
                Integer i1 = (Integer)o1;    //向下转型，一次来使用Integer的方法
                Integer i2 = (Integer)o2;
                //return i1 - i2;   升序   根据i1 - i2是否大于0来决定排序
                return i2 - i1;    //降序
            }
        });
        System.out.println(Arrays.toString(arr2));

    }

}
