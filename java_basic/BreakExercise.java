import java.util.Scanner;
public class BreakExercise{
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);

        //��ʼ������
		String name = "";
		String password = "";
		int chance = 3;
		for (int i = 1; i <= 3; i++){
			System.out.println("����������û�����");
			name = myscanner.next();
			System.out.println("������������룺");
			password = myscanner.next();
			if ("����".equals(name) && "666".equals(password) ){        //�û���������   ���룺666
				System.out.println("��¼�ɹ���");
				break;
			}else{
				System.out.println("�û����������");
				chance--;
				System.out.println("�㻹��" + chance + "�λ���");
			}

		}


	}
}