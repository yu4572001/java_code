import java.util.Scanner;
public class BubbleSort {
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);


		//ð������
		int arr[] = {12,33,1,90,44,12,10};    //7��Ԫ�أ���Ҫ6������
		int temp = 0;        //��ʱ����
		for (int i = arr.length -1; i > 0; i--){      //��㣬6������
			for (int j = 0; j < i; j++){        //�ڲ㣬ÿ��������Ҫ�໥�Ƚϣ���һ�αȽ�6�Σ��ڶ��ֱȽ�5��...
				if (arr[j]> arr[j + 1]){
					temp = arr[j];         //������ʱ����,������������  һ��Ҫ�ǵ�������ʼ��
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("���������飺");
		for (int i = 0; i < arr.length; i++){	
			System.out.print(arr[i] + "\t");
		}







	}
}