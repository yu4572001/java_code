public class Migong {
	public static void main(String[]args) {

		int map[][] = new int[8][7];

		//��Ƶ�ͼ
		for (int i = 0; i < 7; i++){     //1����ǽ��0����յ�
			map[0][i] = 1;
			map[7][i] = 1;
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;
		// 1 1 1 1 1 1 1
		// 1 0 0 0 0 0 1
		// 1 0 0 0 0 0 1
		// 1 1 1 0 0 0 1
		// 1 0 0 0 0 0 1
		// 1 0 0 0 0 0 1
		// 1 0 0 0 0 0 1
		// 1 1 1 1 1 1 1



		Method play = new Method();
		play.way(map, 1, 1);          //���÷���
		System.out.println("==========�Թ�ͼ==========");
		//�����ͼ
		for (int i = 0; i < map.length; i++){
			for (int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");


			}
			System.out.println();
		}






	}
}




class Method {

	/*ע��0��ʾ������
	     1��ʾΪǽ��������
	     2��ʾ�߹���·,������
	     3��ʾ����ͬ�����������Ҷ������ߣ��Ͱ������Ϊ3����ʼ���ݣ�������
	*/



	public boolean way(int map[][], int i, int j){       //�����ͼ�Լ�i,j��ֵ(λ��)����������Ϊ������

		if (map[6][5] == 2){       //�ж��Ƿ����յ㣬�����յ㣬ֹͣ����
			return true;
		}else{
			if (map[i][j] == 0){         //�жϴ˴�ʱ��Ϊ0��0��ʾ������
				map[i][j] = 2;                  //�ߵ���Ͱ������Ϊ2
				if (way(map, i + 1, j)){               //�����ƶ�
					return true;
				}else if(way(map, i, j + 1)){           //�����ƶ�
					return true;
				}else if(way(map, i - 1, j)){          //�����ƶ�
					return true;
				}else if(way(map, i, j - 1)){           //�����ƶ�
					return true;
				}else{
					map[i][j] = 3;
					way(map, 1, 1);              //���û��ݣ�������(�����µ��ø÷����������ʼֵ)���������λ�ø�Ϊ3(�´β���)
					return false;
				}

			}else{
				return false;         //����˴���Ϊ0����Ϊ1��2��3ʱ������false��Ҳ������һ�εݹ���õ�if���Ϊfalse��
									  //��ִ����һ��else if(way(map,i,j)),����һ����������
			}
			
		}




	}
}