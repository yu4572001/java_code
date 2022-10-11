import java.util.Scanner;
public class IfOperator{
	public static void main(String[]args){
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("请输入你的年龄：");
		// int age = myscanner.nextInt();
		// if (age > 16){
		// 	System.out.println("你年龄大于16岁，应该对自己负责，送入监狱");

		// }
		// else{
		// 	System.out.println("你的年龄不大这次放过你了");
		// }



		//练习
		// double num1 = 32.1;
		// double num2 = 12.1;
		// if (num1 > 10.0 && num2 < 20.0){
		// 	System.out.println("两个数的和为：" + (num1 + num2));

		// }else{
		// 	System.out.println("程序继续");

		// }



		//练习
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("请输入数字");
		// int num1 = myscanner.nextInt();
		// System.out.println("请输入第二个数字");
		// int num2 = myscanner.nextInt();
		// int sum = num1 + num2;

		// if (sum % 3 == 0 && sum % 5 == 0){
		// 	System.out.println("他们的和可以被3和5整除");

		// }else{
		// 	System.out.println("他们的和不能可以被3和5整除");
		// }



		//判断闰年
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("请输入年份：");
		// int year = myscanner.nextInt();
		// if (year % 4 == 0 && year % 100 != 0) {
		// 		System.out.println("该年是闰年");
		// }else if (year % 400 == 0){
		// 	System.out.println("该年是闰年");
		// }else{
		// 	System.out.println("该年不是闰年");
		// }



		//芝麻信用分----多分支
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("请输入你的芝麻信用分");
		// int score = myscanner.nextInt();
		// if (score == 100){
		// 	System.out.println("信用极好");
		// }else if (score >=80 && score <= 99){
		// 	System.out.println("信用优秀");
		// }else if (score >=60 && score < 80 ){
		// 	System.out.println("信用一般");
		// }else{
		// 	System.out.println("信用不及格");
		// }






		//嵌套分支，出票系统

		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入月份(1-12)：");
		int month = myscanner.nextInt();
		if (month >= 4 && month <= 10){
			System.out.println("请输入你的年龄");
			int age = myscanner.nextInt();
			if (age >= 18 && age <= 60){
				System.out.println("你是成人，票价为60元");

			}else if (age < 18){
				System.out.println("你是儿童，票价半价");

			}else if(age > 60){
				System.out.println("你是老人，票价为三折");
			}
		}else{
			System.out.println("请输入你的年龄");
			int age = myscanner.nextInt();
			if (age >= 18 && age <= 60){
				System.out.println("你是成人，票价为40元");
			}else{
				System.out.println("你不是成人，票价为20元");
			}


		}

	} 
}