import java.util.Scanner;
public class SwitchOperator{
	public static void main(String[]args){

		// ��Сдת��
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("������Сд��ĸ��");
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
		// 		System.out.println("��������ȷ��Χ����ĸ!");
		// }
		// System.out.println("switch�������������....");





		//�ж�ѧ���ɼ��Ƿ�ϸ�
		//60-100�ϸ��������ϸ�
		Scanner myscanner = new Scanner(System.in);
		System.out.println("������һ������0-100��");
		double score = myscanner.nextDouble();
		if (score >=0 && score <= 100){
			switch((int)score/60){   //����һ������ǿת ����/60=1  ������/60=0
				case 1:
					System.out.println("��ĳɼ��ϸ�");
					break;
				case 0:
					System.out.println("��ĳɼ����ϸ�");
					break;
			}
		}else{
			System.out.println("������ĳɼ�����");

		}



	}
}