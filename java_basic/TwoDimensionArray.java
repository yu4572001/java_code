import java.util.Scanner;
public class TwoDimensionArray {
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);


				//�������
		int arr[][] = new int[10][];           //����10��һά����
		for (int i = 0; i < arr.length; i++){
			arr[i] = new int[i + 1];           //���θ�ÿ��һά���鿪�ռ䣬һ��һ��������
		
			for (int j = 0; j < arr[i].length; j++){        //��ֵ
				if (j == 0 || j == arr[i].length - 1){       //��һ�к����һ�ж���1
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];      //������ǹ��ɣ��м����=��һ�е�ͬһ�е��� + ��һ�е�ǰһ�е���
				}
			}
		}

		for (int i = 0; i < arr.length; i++){             //�������
			for (int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}




	}
}