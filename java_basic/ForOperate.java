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
			//for(;ѭ������;)�еĳ�ʼ���ͱ����������Էŵ������ط��������߷ֺŲ���ʡ��

		// }
		// System.out.println(i);


		// int i = 0;
		// for(;;){           //����ѭ��
		// 	System.out.println("helloworld" + i);
		// }




		// int count = 10;
		// for(int i = 0,j = 0; i <= 10; i++,j+=2){
		// 	System.out.println("i=" + i + "j=" + j);

		// 	//ѭ����ʼֵ�����ж�������Ҫ������һ�����м��ö��Ÿ�����ѭ����������Ҳͬ��
		// }

  		

		      //���1-100���ܱ�9�����������������Լ����ٸ�
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
		// System.out.println("����������(����)��");
		// int end = myscanner.nextInt();
		// int i = 0;
		// int j;
		// j = end;

		// for (; i <= end && j >= 0; i++,j--){
		// 	System.out.println(i + "+" + j + "=" + (i+j));
		// }


				//do..whileѭ��
		// int i = 0;
		// do {
		// 	System.out.println("do..while" + i);
		// 	i++;
		// }while(i <= 9);



				//ͳ��1--200֮���ܱ�5���������ܱ�3�����ĸ�����
		// int count = 0;   //����
		// int i = 1;
		// do {
		// 	if (i % 5 == 0 && i % 3 != 0){
		// 		System.out.println("i=" + i);
		// 		count++;
		// 	}
		// 	i++;
		// }while(i <= 200);
		// System.out.println("����Ϊ��"+ count);


                       //��Ǯ
		// Scanner myscanner = new Scanner(System.in);
		// char answer = ' ';    //��ʼ���ַ�Ϊ' '(���ַ�)
		// do{
		// 	System.out.println("��Ǯ��y/n");
		// 	answer = myscanner.next().charAt(0);
		// 	System.out.println("��Ļش��ǣ�" + answer);
			
		// 	System.out.println("���������ޣ�");
			
				
		// }while(answer != 'y');   //�������Ĳ���y���ͼ���ִ��
		// System.out.println("��л��Ǯ��");



		







	}
}