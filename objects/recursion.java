public class recursion {
	public static void main(String[]args) {
		// Exercise num = new Exercise();
		// int abb = num.count(7);
		// System.out.println("7��쳲�������Ϊ��" + abb);

		// int acc = num.mokey(1);
		// System.out.println("һ����" + acc + "������");
	

		//�˻ʺ�        ����
		int huang[][] = new int[8][8];
		for (int i = 0; i < map.length; i++){
			for (int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");


			}
			System.out.println();
		}
		// 0 0 0 0 0 0 0 0
		// 0 0 0 0 0 0 0 0
		// 0 0 0 0 0 0 0 0
		// 0 0 0 0 0 0 0 0
		// 0 0 0 0 0 0 0 0
		// 0 0 0 0 0 0 0 0
		// 0 0 0 0 0 0 0 0 
		// 0 0 0 0 0 0 0 0


	}

}







class Exercise {
	

	//쳲���������
	/*�������� int 
	  ����count
	  �β� һ��int��
	  ������ 1,1,2,3,5
	        ��n=1ʱ��쳲�������Ϊ1
	        ��n=2ʱ��쳲�������Ϊ1
	        ��n=3ʱ��쳲�������Ϊǰ�������ĺ�
	*/
	public int count(int n){
		if (n > 2){
			return count(n - 1) + count(n - 2);
		}else{
			return 1;
		}
	}


    //�ݹ����˼��
	public int mokey(int day){
		if (day == 10){
			return 1;
		}else if(day >= 1 && day <=9){
			return (mokey(day + 1) + 1) * 2;   //��������������ں�һ������Ӽ�1 * 2��
		}else{
			System.out.println("������1-10�������");
			return -1;
		}



	}



	//�˻ʺ�         ����
	public int  play(int huang[][], int i, int j){
		for (int a = 0; a < 7; a++){
			if (huang[a][j] != 1){
				return true;
			}
		}


		for (int b = 0; b < 7; b++){
			if (huang[i][b] != 1){
				return true;
			}
		}

		for (int c = 0,d = 0; i >= 0 && j >=0; c++,d++ ){

		}

	}





}