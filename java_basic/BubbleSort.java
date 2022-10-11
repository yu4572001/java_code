import java.util.Scanner;
public class BubbleSort {
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);


		//冒泡排序法
		int arr[] = {12,33,1,90,44,12,10};    //7个元素，需要6轮排序
		int temp = 0;        //临时变量
		for (int i = arr.length -1; i > 0; i--){      //外层，6轮排序
			for (int j = 0; j < i; j++){        //内层，每轮排序需要相互比较，第一次比较6次，第二轮比较5次...
				if (arr[j]> arr[j + 1]){
					temp = arr[j];         //借助临时变量,用来辅助交换  一定要记得在外层初始化
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("排序后的数组：");
		for (int i = 0; i < arr.length; i++){	
			System.out.print(arr[i] + "\t");
		}







	}
}