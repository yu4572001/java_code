import java.util.Scanner;
public class MulFor {
	public static void main(String[]args){


		       //��ӡ�žų˷���
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");

			}
			System.out.println("");
		}




		     //ͳ��ѧ���ɼ� ÿ���༶��ƽ���ɼ���3���༶��ƽ���ɼ�������3���༶�ļ�������

		// Scanner myscanner = new Scanner(System.in);
		// int count = 0;
		// double sum_score = 0;
		// for (int i = 1; i <= 3; i++ ){      //����ǰ༶
			
		// 	double sum = 0;
		// 	for (int j = 1; j <= 5; j++){     //�ڲ��ǳɼ�
		// 		System.out.println("�������" + i + "�����" + j + "��ѧ���ĳɼ���" );
		// 		double score = myscanner.nextDouble();
		// 		sum = sum + score;    //ÿ���༶���ܳɼ�
		// 		if (score >= 60){
		// 			count++;      //����������1
		// 		}
		// 	}
		// 	double ascore = sum / 5;    //ÿ���༶��ƽ���ɼ�
		// 	sum_score += sum;         //3���༶���ܳɼ�
		// 	System.out.println(i + "����ܷ�Ϊ"+ sum + "    " + i + "���ƽ���ɼ�Ϊ��" + ascore);
			

		// }
		// double allclass = sum_score / 15;      //3���༶��ƽ���ɼ�
		// System.out.println("3�����ƽ���ɼ�Ϊ��" + allclass);
		// System.out.println("3���༶������" + count + "��");







	}

}