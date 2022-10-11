import java.util.Scanner;
public class SwitchOperator{
	public static void main(String[]args){

		// 大小写转换
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("请输入小写字母：");
		// char c1 = myscanner.next().charAt(0);
		// switch(c1) {
		// 	case 'a' :
		// 		System.out.println("A");
		// 		break;
		// 	case 'b' :
		// 		System.out.println("B");
		// 		break;
		// 	case 'c' :
		// 		System.out.println("C");
		// 		break;
		// 	case 'd' :
		// 		System.out.println("D");
		// 		break;
		// 	case 'e' :
		// 		System.out.println("E");
		// 		break;
		// 	case 'f' :
		// 		System.out.println("F");
		// 		break;
		// 	default:
		// 		System.out.println("请输入正确范围的字母!");
		// }
		// System.out.println("switch结束，程序继续....");





		//判断学生成绩是否合格
		//60-100合格，其他不合格
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入一个分数0-100：");
		double score = myscanner.nextDouble();
		if (score >=0 && score <= 100){
			switch((int)score/60){   //进行一个类型强转 及格/60=1  不及格/60=0
				case 1:
					System.out.println("你的成绩合格");
					break;
				case 0:
					System.out.println("你的成绩不合格");
					break;
			}
		}else{
			System.out.println("你输入的成绩有误");

		}



	}
}