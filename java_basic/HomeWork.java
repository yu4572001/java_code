import java.util.Scanner;
public class HomeWork{
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);


		              //某人有100000元，当money>50000时，过一次路口扣%5，当money<=50000时，过一次路口扣1000，问这个人能过几次路口
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
		// System.out.println("此人一共经过了" + count + "次路口");


	       			//判断水仙花数

		// System.out.println("请输入一个三位数整数：");
		// int num = myscanner.nextInt();
		// for (int num = 100; num <= 999; num++){

		// 	int hud = num / 100;        //百位
		// 	int ten = (num % 100) / 10;          //十位
		// 	int one = num % 10;          //个位


		// 	if (ten * ten * ten + hud * hud * hud + one * one * one == num){
		// 		System.out.println(num + "是水仙花数！");
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



				//输出a-z和A-Z

		// for (char i = 'a'; i <= 'z'; i++){
		// 	System.out.print(i + "\t");         //a----97，b-----98，c------99
		// }

		// for (char i = 'A'; i <= 'Z'; i++){
		// 	System.out.print(i + "\t");
		// }



		// double sum = 0;
		// for (double i = 1; i <= 100; i++){
		// 	if (i % 2 != 0){
		// 		sum = sum + (1 / i);          //1是一个整型，所以i要定义成一个double型，才能进行除法运算，否则会省略成0
		// 	}else{
		// 		sum = sum - (1 / i);
		// 	}
		// }
		// System.out.println("总和为" + sum);




		int sum = 0;
		for (int j = 1; j <= 100; j++){

			for (int i = 1; i <= j; i++){
				sum += i;
			}
		}
		System.out.println("sum = " + sum);	

	}
}