package arrays_;

import java.util.Arrays;
import java.util.Comparator;

//利用定制排序来实现冒泡排序
public class Arrays02 {
    public static void main(String[] args) {
        int arr[] = {1,-1,4,23,0,6,10};

        bubble(arr, new Comparator() {
            @Override    //这里重写了compare方法，动态绑定机制，会执行这里的方法
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                return i2 - i1;  // -1 - 1 = -2 < 0 返回的值小于0，为降序(Debug看看)
            }
        });
        System.out.println(Arrays.toString(arr));
    }




    public static void bubble(int arr[], Comparator c){
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (c.compare(arr[j],arr[j + 1]) > 0){   //根据这里返回的值是否大于0来决定执行下面的代码，即决定升序还是降序
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}



