import java.util.Scanner;
public class Stars{
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);


				// *****
				// *****
				// *****
				// *****
				// *****

	// 	for (int i = 1; i <= 5; i++){       //����
	// 		for (int j = 1; j <= 5; j++){       //*����
	// 			System.out.print("*");
	// 		}
	// 		System.out.println(" ");
	// 	}

	// System.out.println("======================");


	// 	   *         ��һ��1��*    ǰ��4���ո�
	//    ***        �ڶ���3��*    ǰ��3���ո�
	//   *****       ������5��*    ǰ��2���ո�
	//  *******      ���Ĳ�7��*    ǰ��1���ո�
	// *********     �����9��*    ǰ��0���ո�


		// for (int a = 1; a <= 5; a++){           //���Ʋ���
		// 	for (int c = 1; c <= 5 - a; c++){        //����*ǰ��Ŀո�
		// 		System.out.print(" ");
		// 	}
		// 	for (int b = 1; b <= 2 * a - 1; b++){         //����ÿ���*�ĸ���
		// 		System.out.print("*");
		// 	}
		// 	System.out.println(" ");
		// }


		// System.out.println("======================");



	// 	   *         ��һ��1��*    ǰ��4���ո�     ֻ�����һ�������һ��*
	//    * *        �ڶ���2��*    ǰ��3���ո�
	//   *   *       ������2��*    ǰ��2���ո�
	//  *     *      ���Ĳ�2��*    ǰ��1���ո�
	// *********     �����9��*    ǰ��0���ո�     ���һ��ȫ�����*

  //       int totalral = 10;    //����
		// for (int i = 1; i <= totalral; i++){      //��������
		// 	for (int a = 1; a <= totalral - i; a++){        //���ƿո�
		// 		System.out.print(" "); 
		// 	}
		// 	for (int j = 1; j <= 2 * i - 1; j++){     //����ÿһ�����Ԫ�صĸ���   
		// 		if (j == 1 || j == 2 * i - 1 || i == totalral){       //�ж��Ƿ������*�����ǿո�
		// 			System.out.print("*");
		// 		}else{
		// 			System.out.print(" "); 
		// 		}
				      
		// 	}
		// 	System.out.println(" ");      //ÿһ�������ϻ���


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
        System.out.println("������һ�������֣�");     //�û���������
        int totalral = myscanner.nextInt();         //������
		for (int i = 1; i <= totalral; i++){        //��������
			for (int a = 1; a <=totalral - i; a++){        //���ƿո�    
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++){          //����ÿһ�����Ԫ�صĸ���
				if (j == 1 || j == 2 * i - 1){              //�ж��Ƿ������*�����ǿո�  ��ֻ�����һ�������һ��*��������ȫ��Ϊ�ո�(����) 
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");       //ÿһ�������ϻ���
		}            //�ϰ����������
 


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
		}          //�°����������




		


		

	}

}