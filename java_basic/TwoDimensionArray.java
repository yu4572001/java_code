import java.util.Scanner;
public class TwoDimensionArray {
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);


				//杨辉三角
		int arr[][] = new int[10][];           //共有10个一维数组
		for (int i = 0; i < arr.length; i++){
			arr[i] = new int[i + 1];           //依次给每个一维数组开空间，一开一，二开二
		
			for (int j = 0; j < arr[i].length; j++){        //赋值
				if (j == 0 || j == arr[i].length - 1){       //第一行和最后一行都是1
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];      //杨辉三角规律，中间的数=上一行的同一列的数 + 上一行的前一列的数
				}
			}
		}

		for (int i = 0; i < arr.length; i++){             //遍历输出
			for (int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}




	}
}