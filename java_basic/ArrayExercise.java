import java.util.Scanner;
public class ArrayExercise {
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);


		// //数字扩容加排序
		// int arr[] = {10,13,34,45};
		// int arrnew[] = new int[arr.length + 1];          //临时数组arrnew，大小为arr.length + 1
		// System.out.println("请输入要扩容的数字：");
		// int add = myscanner.nextInt();            
		// arrnew[arrnew.length - 1] = add;    
		// for (int i = 0; i < arr.length; i++){
		// 	arrnew[i] = arr[i];                 //将arr中的元素放进arrnew
		// }
		// arr = arrnew;                         //arrnew的地址赋值给arr,arr之前的空间被回收

		// //进行排序排序
		// int temp = 0;              //临时中间变量
		// for (int i = arr.length - 1; i > 0; i--){
		// 	if (arr[i] < arr[i - 1]){
		// 		temp = arr[i];
		// 		arr[i] = arr[i - 1];
		// 		arr[i - 1] = temp;
		// 	}
		// }				

		// System.out.println("======arr======");
		// for (int i = 0; i < arr.length; i++){
		// 	System.out.print(arr[i] + " ");
		// }




  		//初始化数组
		int arr[] = new int[10];
		int num = 0;
		for (int i = 0; i < arr.length; i++){
			num = (int)(Math.random()*100) + 1;           //返回1-100之间的数
			arr[i] = num;
		}

		//排序
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++){
			for (int j = arr.length - 1; j > 0; j--){
				if (arr[j] > arr[j - 1]){
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		//输出
		int count = 0;
		double sum = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == 8){
				count++;
			}
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		double average = sum / arr.length;
		System.out.println("平均值为：" + average);
		System.out.println("数组最大值为：" + arr[0]);
		System.out.println("最大值下标为：0");
		System.out.println("数组里面有" + count + "个8");

	}

}