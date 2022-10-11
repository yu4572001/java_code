import java.util.Scanner;
public class ForOperate {
	public static void main(String[]args){


		// for (int i = 0; i <= 10; i++){
		// 	System.out.println("helloworld" + i);

		// }


		// int i = 0;
		// for (; i <= 10 ;){
		// 	System.out.println("helloworld" + i);
		// 	i++;
			//for(;循环条件;)中的初始化和变量迭代可以放到其他地方，但两边分号不能省略

		// }
		// System.out.println(i);


		// int i = 0;
		// for(;;){           //无限循环
		// 	System.out.println("helloworld" + i);
		// }




		// int count = 10;
		// for(int i = 0,j = 0; i <= 10; i++,j+=2){
		// 	System.out.println("i=" + i + "j=" + j);

		// 	//循环初始值可以有多条，但要求类型一样，中间用逗号隔开，循环变量迭代也同样
		// }

  		

		      //输出1-100中能被9整除的数，求和输出以及多少个
		// int count = 0;
		// int sum = 0;
		// for (int i = 1; i <= 100; i++){
		// 	if (i % 9 == 0){
		// 		System.out.println("i=" + i);
		// 		count++;
		// 		sum += i;
		// 	}
		// }
		// System.out.println("count=" + count);
		// System.out.println("sum=" + sum);




						// 0+10=10
						// 1+9=10
						// 2+8=10
						// 3+7=10
						// 4+6=10
						// 5+5=10
						// 6+4=10
						// 7+3=10
						// 8+2=10
						// 9+1=10
						// 10+0=10
		// Scanner myscanner = new Scanner(System.in);                   
		// System.out.println("请输入数字(整数)：");
		// int end = myscanner.nextInt();
		// int i = 0;
		// int j;
		// j = end;

		// for (; i <= end && j >= 0; i++,j--){
		// 	System.out.println(i + "+" + j + "=" + (i+j));
		// }


				//do..while循环
		// int i = 0;
		// do {
		// 	System.out.println("do..while" + i);
		// 	i++;
		// }while(i <= 9);



				//统计1--200之间能被5整除但不能被3整除的个数；
		// int count = 0;   //次数
		// int i = 1;
		// do {
		// 	if (i % 5 == 0 && i % 3 != 0){
		// 		System.out.println("i=" + i);
		// 		count++;
		// 	}
		// 	i++;
		// }while(i <= 200);
		// System.out.println("个数为："+ count);


                       //还钱
		// Scanner myscanner = new Scanner(System.in);
		// char answer = ' ';    //初始化字符为' '(空字符)
		// do{
		// 	System.out.println("还钱吗？y/n");
		// 	answer = myscanner.next().charAt(0);
		// 	System.out.println("你的回答是：" + answer);
			
		// 	System.out.println("闪电五连鞭！");
			
				
		// }while(answer != 'y');   //如果输出的不是y，就继续执行
		// System.out.println("感谢还钱！");



		







	}
}