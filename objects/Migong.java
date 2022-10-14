public class Migong {
	public static void main(String[]args) {

		int map[][] = new int[8][7];

		//设计地图
		for (int i = 0; i < 7; i++){     //1代表墙，0代表空地
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
		play.way(map, 1, 1);          //调用方法
		System.out.println("==========迷宫图==========");
		//输出地图
		for (int i = 0; i < map.length; i++){
			for (int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");


			}
			System.out.println();
		}






	}
}




class Method {

	/*注：0表示可以走
	     1表示为墙，不能走
	     2表示走过的路,不能走
	     3表示死胡同，即上下左右都不能走，就把这里改为3，开始回溯，重新走
	*/



	public boolean way(int map[][], int i, int j){       //传入地图以及i,j的值(位置)，返回类型为布尔类

		if (map[6][5] == 2){       //判断是否到了终点，到了终点，停止调用
			return true;
		}else{
			if (map[i][j] == 0){         //判断此处时否为0，0表示可以走
				map[i][j] = 2;                  //走到这就把这里改为2
				if (way(map, i + 1, j)){               //向下移动
					return true;
				}else if(way(map, i, j + 1)){           //向右移动
					return true;
				}else if(way(map, i - 1, j)){          //向上移动
					return true;
				}else if(way(map, i, j - 1)){           //向左移动
					return true;
				}else{
					map[i][j] = 3;
					way(map, 1, 1);              //设置回溯，重新走(即重新调用该方法，传入初始值)，并把这个位置改为3(下次不走)
					return false;
				}

			}else{
				return false;         //如果此处不为0，即为1，2，3时，返回false，也即是上一次递归调用的if语句为false，
									  //将执行下一个else if(way(map,i,j)),即下一个下右上左
			}
			
		}




	}
}