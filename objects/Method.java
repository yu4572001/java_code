public class Method {
	public static void main(String[]args) {

		// int map[][] = {{123,12,2},{245,6623,12},{0,0,0},{5,223,1233}};
		
		// //ʵ�������󣬵��÷���  
		// Tools mytools = new Tools();
		// mytools.printarr(map);
		// mytools.printarr(map);
		// mytools.printarr(map);
		// mytools.printarr(map);  


		AA isfalse = new AA();
		boolean a = isfalse.odd(100);
		System.out.println(a);

		isfalse.print(5,7,"%$^&%&*^");




	}
}




class AA{

	//�ж�����ż��
	public boolean odd(int num){  
		if (num % 2 == 0){
			return true;
		}else{
			return false;
		}
	}


	//��ӡh��l�е�z�ַ�
	public void print(int h, int l, String z){
		for (int i = 0; i < h; i ++){
			for (int j = 0; j < l; j++){
				System.out.print(z + " ");
			}
			System.out.println();
		}
	}



}



class Tools {


	//���ô�ӡ��ά����
	public void printarr(int arr[][]){
		System.out.println("======================");
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}




}