import java.util.Scanner;
public class MulFor {
	public static void main(String[]args){


		       //打印九九乘法表
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");

			}
			System.out.println("");
		}




		     //统计学生成绩 每个班级的平均成绩及3个班级的平均成绩，还有3个班级的及格人数

		// Scanner myscanner = new Scanner(System.in);
		// int count = 0;
		// double sum_score = 0;
		// for (int i = 1; i <= 3; i++ ){      //外层是班级
			
		// 	double sum = 0;
		// 	for (int j = 1; j <= 5; j++){     //内层是成绩
		// 		System.out.println("请输入第" + i + "个班第" + j + "个学生的成绩：" );
		// 		double score = myscanner.nextDouble();
		// 		sum = sum + score;    //每个班级的总成绩
		// 		if (score >= 60){
		// 			count++;      //及格人数加1
		// 		}
		// 	}
		// 	double ascore = sum / 5;    //每个班级的平均成绩
		// 	sum_score += sum;         //3个班级的总成绩
		// 	System.out.println(i + "班的总分为"+ sum + "    " + i + "班的平均成绩为：" + ascore);
			

		// }
		// double allclass = sum_score / 15;      //3个班级的平均成绩
		// System.out.println("3个班的平均成绩为：" + allclass);
		// System.out.println("3个班级共及格" + count + "人");







	}

}