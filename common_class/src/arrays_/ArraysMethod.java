package arrays_;
import java.util.Arrays;
import java.util.List;

public class ArraysMethod {
    public static void main(String[] args) {
        Integer num1[] = {2,4,6,14,73,87,152};
        //binarySearch二分查找，要求数组必须是有序的
        //如果数组中不存在该元素，就返回 -(low + 1)
        int index = Arrays.binarySearch(num1,87);
        int index1 = Arrays.binarySearch(num1,3);  //返回-2
        System.out.println(index1);

        int arr[] = {2,41,4,451,56,14,61};
        //将arr中的元素拷贝arr.length个到newarr中，拷贝数量可以自己指定
        int newarr[] = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newarr));

        //Arrays.fill数组元素的填充
        //将数组中元素全部替换为指定的值
        int arr1[] = {4,1,61,21};
        Arrays.fill(arr1,99);
        System.out.println(Arrays.toString(arr1));


        //equals比较两个数组元素内容是否完全一致
        int arr2[] = {3,16,11,62,145};
        int arr3[] = {3,16,11,62,145};
        boolean b1 = Arrays.equals(arr2,arr3);
        System.out.println(b1);  //true


        //asList 将一组数组值转换为list集合
        //返回的aslist的编译类型为List接口
        //aslist运行类型为java.util.Arrays$ArrayList，注：这是一个静态内部类
        List aslist = Arrays.asList(3,16,11,62,145);
        System.out.println(aslist);   //这里的aslist是一个集合，不是一个数组
        System.out.println("aslist的运行类型为：" +aslist.getClass());
    }
}
