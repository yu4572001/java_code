import java.util.Scanner;
public class ArrayExercise {
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);


		// //�������ݼ�����
		// int arr[] = {10,13,34,45};
		// int arrnew[] = new int[arr.length + 1];          //��ʱ����arrnew����СΪarr.length + 1
		// System.out.println("������Ҫ���ݵ����֣�");
		// int add = myscanner.nextInt();            
		// arrnew[arrnew.length - 1] = add;    
		// for (int i = 0; i < arr.length; i++){
		// 	arrnew[i] = arr[i];                 //��arr�е�Ԫ�طŽ�arrnew
		// }
		// arr = arrnew;                         //arrnew�ĵ�ַ��ֵ��arr,arr֮ǰ�Ŀռ䱻����

		// //������������
		// int temp = 0;              //��ʱ�м����
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




  		//��ʼ������
		int arr[] = new int[10];
		int num = 0;
		for (int i = 0; i < arr.length; i++){
			num = (int)(Math.random()*100) + 1;           //����1-100֮�����
			arr[i] = num;
		}

		//����
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

		//���
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
		System.out.println("ƽ��ֵΪ��" + average);
		System.out.println("�������ֵΪ��" + arr[0]);
		System.out.println("���ֵ�±�Ϊ��0");
		System.out.println("����������" + count + "��8");

	}

}