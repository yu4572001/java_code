import java.util.Scanner;
public class IfOperator{
	public static void main(String[]args){
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("������������䣺");
		// int age = myscanner.nextInt();
		// if (age > 16){
		// 	System.out.println("���������16�꣬Ӧ�ö��Լ������������");

		// }
		// else{
		// 	System.out.println("������䲻����ηŹ�����");
		// }



		//��ϰ
		// double num1 = 32.1;
		// double num2 = 12.1;
		// if (num1 > 10.0 && num2 < 20.0){
		// 	System.out.println("�������ĺ�Ϊ��" + (num1 + num2));

		// }else{
		// 	System.out.println("�������");

		// }



		//��ϰ
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("����������");
		// int num1 = myscanner.nextInt();
		// System.out.println("������ڶ�������");
		// int num2 = myscanner.nextInt();
		// int sum = num1 + num2;

		// if (sum % 3 == 0 && sum % 5 == 0){
		// 	System.out.println("���ǵĺͿ��Ա�3��5����");

		// }else{
		// 	System.out.println("���ǵĺͲ��ܿ��Ա�3��5����");
		// }



		//�ж�����
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("��������ݣ�");
		// int year = myscanner.nextInt();
		// if (year % 4 == 0 && year % 100 != 0) {
		// 		System.out.println("����������");
		// }else if (year % 400 == 0){
		// 	System.out.println("����������");
		// }else{
		// 	System.out.println("���겻������");
		// }



		//֥�����÷�----���֧
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("���������֥�����÷�");
		// int score = myscanner.nextInt();
		// if (score == 100){
		// 	System.out.println("���ü���");
		// }else if (score >=80 && score <= 99){
		// 	System.out.println("��������");
		// }else if (score >=60 && score < 80 ){
		// 	System.out.println("����һ��");
		// }else{
		// 	System.out.println("���ò�����");
		// }






		//Ƕ�׷�֧����Ʊϵͳ

		Scanner myscanner = new Scanner(System.in);
		System.out.println("�������·�(1-12)��");
		int month = myscanner.nextInt();
		if (month >= 4 && month <= 10){
			System.out.println("�������������");
			int age = myscanner.nextInt();
			if (age >= 18 && age <= 60){
				System.out.println("���ǳ��ˣ�Ʊ��Ϊ60Ԫ");

			}else if (age < 18){
				System.out.println("���Ƕ�ͯ��Ʊ�۰��");

			}else if(age > 60){
				System.out.println("�������ˣ�Ʊ��Ϊ����");
			}
		}else{
			System.out.println("�������������");
			int age = myscanner.nextInt();
			if (age >= 18 && age <= 60){
				System.out.println("���ǳ��ˣ�Ʊ��Ϊ40Ԫ");
			}else{
				System.out.println("�㲻�ǳ��ˣ�Ʊ��Ϊ20Ԫ");
			}


		}

	} 
}