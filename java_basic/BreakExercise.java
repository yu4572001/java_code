import java.util.Scanner;
public class BreakExercise{
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);

        //初始化变量
		String name = "";
		String password = "";
		int chance = 3;
		for (int i = 1; i <= 3; i++){
			System.out.println("请输入你的用户名：");
			name = myscanner.next();
			System.out.println("请输入你的密码：");
			password = myscanner.next();
			if ("老六".equals(name) && "666".equals(password) ){        //用户名：老六   密码：666
				System.out.println("登录成功！");
				break;
			}else{
				System.out.println("用户名密码错误！");
				chance--;
				System.out.println("你还有" + chance + "次机会");
			}

		}


	}
}