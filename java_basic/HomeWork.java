import java.util.Scanner;
public class HomeWork{
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);


		              //ĳ����100000Ԫ����money>50000ʱ����һ��·�ڿ�%5����money<=50000ʱ����һ��·�ڿ�1000����������ܹ�����·��
		// double money = 100000;
		// int count = 0;
		// while(true){
		// 	if (money >= 1000){
		// 		if (money > 50000){
		// 		money = money - money * 0.05;
		// 		}else{
		// 			money = money - 1000;

		// 		}
		// 		count++;

		// 	}else{
		// 		break;
		// 	}


		// }
		// System.out.println("����һ��������" + count + "��·��");


	       			//�ж�ˮ�ɻ���

		// System.out.println("������һ����λ��������");
		// int num = myscanner.nextInt();
		// for (int num = 100; num <= 999; num++){

		// 	int hud = num / 100;        //��λ
		// 	int ten = (num % 100) / 10;          //ʮλ
		// 	int one = num % 10;          //��λ


		// 	if (ten * ten * ten + hud * hud * hud + one * one * one == num){
		// 		System.out.println(num + "��ˮ�ɻ�����");
		// 	}
				

		// }



		// int count = 0;
		// for (int i = 1; i <= 100; i++){
		// 	if (i % 5 != 0){
		// 		System.out.print(i + "\t");
		// 		count++;
		// 		if (count % 5 == 0){
		// 			System.out.println("\n");
		// 		}
		// 	}
		// }



				//���a-z��A-Z

		// for (char i = 'a'; i <= 'z'; i++){
		// 	System.out.print(i + "\t");         //a----97��b-----98��c------99
		// }

		// for (char i = 'A'; i <= 'Z'; i++){
		// 	System.out.print(i + "\t");
		// }



		// double sum = 0;
		// for (double i = 1; i <= 100; i++){
		// 	if (i % 2 != 0){
		// 		sum = sum + (1 / i);          //1��һ�����ͣ�����iҪ�����һ��double�ͣ����ܽ��г������㣬�����ʡ�Գ�0
		// 	}else{
		// 		sum = sum - (1 / i);
		// 	}
		// }
		// System.out.println("�ܺ�Ϊ" + sum);




		int sum = 0;
		for (int j = 1; j <= 100; j++){

			for (int i = 1; i <= j; i++){
				sum += i;
			}
		}
		System.out.println("sum = " + sum);	

	}
}