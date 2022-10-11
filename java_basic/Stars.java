import java.util.Scanner;
public class Stars{
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);


				// *****
				// *****
				// *****
				// *****
				// *****

	// 	for (int i = 1; i <= 5; i++){       //层数
	// 		for (int j = 1; j <= 5; j++){       //*个数
	// 			System.out.print("*");
	// 		}
	// 		System.out.println(" ");
	// 	}

	// System.out.println("======================");


	// 	   *         第一层1个*    前面4个空格
	//    ***        第二层3个*    前面3个空格
	//   *****       第三层5个*    前面2个空格
	//  *******      第四层7个*    前面1个空格
	// *********     第五层9个*    前面0个空格


		// for (int a = 1; a <= 5; a++){           //控制层数
		// 	for (int c = 1; c <= 5 - a; c++){        //控制*前面的空格
		// 		System.out.print(" ");
		// 	}
		// 	for (int b = 1; b <= 2 * a - 1; b++){         //控制每层的*的个数
		// 		System.out.print("*");
		// 	}
		// 	System.out.println(" ");
		// }


		// System.out.println("======================");



	// 	   *         第一层1个*    前面4个空格     只输出第一个和最后一个*
	//    * *        第二层2个*    前面3个空格
	//   *   *       第三层2个*    前面2个空格
	//  *     *      第四层2个*    前面1个空格
	// *********     第五层9个*    前面0个空格     最后一行全部输出*

  //       int totalral = 10;    //行数
		// for (int i = 1; i <= totalral; i++){      //控制行数
		// 	for (int a = 1; a <= totalral - i; a++){        //控制空格
		// 		System.out.print(" "); 
		// 	}
		// 	for (int j = 1; j <= 2 * i - 1; j++){     //控制每一行输出元素的个数   
		// 		if (j == 1 || j == 2 * i - 1 || i == totalral){       //判断是否输出“*”还是空格
		// 			System.out.print("*");
		// 		}else{
		// 			System.out.print(" "); 
		// 		}
				      
		// 	}
		// 	System.out.println(" ");      //每一行输出完毕换行


		System.out.println("======================");



	// 	   *       
	//    * *       
	//   *   *       
	//  *     *      
	// *       *
	//  *     *
	//   *   *
	//    * *
	//     *
        System.out.println("请输入一个整数字：");     //用户输入行数
        int totalral = myscanner.nextInt();         //总行数
		for (int i = 1; i <= totalral; i++){        //控制行数
			for (int a = 1; a <=totalral - i; a++){        //控制空格    
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++){          //控制每一行输出元素的个数
				if (j == 1 || j == 2 * i - 1){              //判断是否输出“*”还是空格  即只输出第一个和最后一个*，其他的全部为空格(空心) 
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");       //每一行输出完毕换行
		}            //上半个空心菱形
 


		for (int ia = totalral - 1; ia >= 1; ia--){
			for (int b = totalral - 1; b >= ia; b--){
				System.out.print(" ");
			}
			for (int ja = 1; ja <= 2 * ia - 1; ja++){
				if (ja == 1 || ja == 2 * ia - 1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}          //下半个空心菱形




		


		

	}

}