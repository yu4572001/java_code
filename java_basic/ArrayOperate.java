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
		// System.out.println("��10�γ���Ϊ��" + meter + "�ܳ���Ϊ��" + sum);



              			//�����������
		// int arr1[] = {11,22,33,44,55,66};
		// int arr2[] = new int[arr1.length];
		// int len = arr1.length;
		// for (int i = len - 1,j = 0; i >= 0; i--,j++){
		// 	arr2[j] = arr1[i];      
		// }
		// arr1 = arr2;      //��arr2�ĵ�ַ����arr1��arr1֮ǰ���ڴ�ռ佫�������������գ�ָ���arr2һ���Ķѿռ�


		// for (int i = 0; i < len; i++){
		// 	System.out.print(arr1[i] + "\t");              //���{66,55,44,33,22,11}
		// }




		                        //��������         Ч�ʲ��ߣ�����������
		int arr[] = {1,2,3};
		while(true){
			int arradd[] = new int[arr.length + 1];        //Ҫ��Сʼ�ձ�arr�����1
			System.out.println("��������Ҫ���ݵ����ӣ�");
			int add = myscanner.nextInt();
			arradd[arradd.length - 1] = add;
			for (int i = 0; i <arr.length; i++){          //��arr�е�Ԫ�ض�����arradd����
				arradd[i] = arr[i];
			}
			arr = arradd;             //������arradd�ĵ�ַ����arrָ��ͬһƬ�ռ䣬������arr����Ԫ��
			System.out.println("�㻹��������Ԫ����yes/no ");
			String answer = myscanner.next();
			if ("yes".equals(answer)){
				continue;
			}
			else{
				break;
			}
		}
		System.out.println("arr���ݺ�������");
		for (int i = 0; i < arr.length; i++){        //�������
			System.out.print(arr[i] + "\t");
		}



	}
}