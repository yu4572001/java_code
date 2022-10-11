import java.util.Scanner;
public class ArrayOperate {
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);





		// double meter = 100;
		// double sum = 100;
		// for (int i = 1; i < 11; i++){
		// 	meter = meter / 2;
		// 	sum = sum + meter;
		// }
		// System.out.println("第10次长度为：" + meter + "总长度为：" + sum);



              			//反向输出数组
		// int arr1[] = {11,22,33,44,55,66};
		// int arr2[] = new int[arr1.length];
		// int len = arr1.length;
		// for (int i = len - 1,j = 0; i >= 0; i--,j++){
		// 	arr2[j] = arr1[i];      
		// }
		// arr1 = arr2;      //将arr2的地址赋给arr1，arr1之前的内存空间将被当成垃圾回收，指向跟arr2一样的堆空间


		// for (int i = 0; i < len; i++){
		// 	System.out.print(arr1[i] + "\t");              //输出{66,55,44,33,22,11}
		// }




		                        //数组扩容         效率不高，可以用链表
		int arr[] = {1,2,3};
		while(true){
			int arradd[] = new int[arr.length + 1];        //要大小始终比arr数组大1
			System.out.println("请输入需要扩容的数子：");
			int add = myscanner.nextInt();
			arradd[arradd.length - 1] = add;
			for (int i = 0; i <arr.length; i++){          //将arr中的元素都赋给arradd数组
				arradd[i] = arr[i];
			}
			arr = arradd;             //将数组arradd的地址赋给arr指向同一片空间，可以用arr访问元素
			System.out.println("你还想继续添加元素吗？yes/no ");
			String answer = myscanner.next();
			if ("yes".equals(answer)){
				continue;
			}
			else{
				break;
			}
		}
		System.out.println("arr扩容后的情况：");
		for (int i = 0; i < arr.length; i++){        //输出数组
			System.out.print(arr[i] + "\t");
		}



	}
}