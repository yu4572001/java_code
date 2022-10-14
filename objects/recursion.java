public class recursion {
	public static void main(String[]args) {
		// Exercise num = new Exercise();
		// int abb = num.count(7);
		// System.out.println("7的斐波那契数为：" + abb);

		// int acc = num.mokey(1);
		// System.out.println("一共有" + acc + "个桃子");
	

		//八皇后，        待定
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
	

	//斐波那契数列
	/*返回类型 int 
	  名字count
	  形参 一个int数
	  方法体 1,1,2,3,5
	        当n=1时，斐波那契数为1
	        当n=2时，斐波那契数为1
	        当n=3时，斐波那契数为前两个数的和
	*/
	public int count(int n){
		if (n > 2){
			return count(n - 1) + count(n - 2);
		}else{
			return 1;
		}
	}


    //递归回溯思想
	public int mokey(int day){
		if (day == 10){
			return 1;
		}else if(day >= 1 && day <=9){
			return (mokey(day + 1) + 1) * 2;   //这天的桃子数等于后一天的桃子加1 * 2；
		}else{
			System.out.println("请输入1-10天的数！");
			return -1;
		}



	}



	//八皇后         待定
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