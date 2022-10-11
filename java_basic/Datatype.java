public class Datatype {

	public static void main(String[]args){
		System.out.println("数据类型练习");

		//布尔类型s
		// boolean isPass = false;
		// if (isPass == true){
		// 	System.out.println("考试通过");
		// }else{
		// 	System.out.println("考试没有通过");
		// }

		// System.out.println("===================");
		// String s1 = "1345556";
		// String s2 = "1234840";
		// System.out.println(s1 + "\n" + s2);

		// System.out.println("===================");
		// char c1 = '男';
		// char c2 = '女';
		// System.out.println(c1 + c2);    //字符型会被转成码值  c1 + c2 =52906


		// System.out.println("===================" + "\t" + "练习");
		// String name = "YY";
		// int age = 21;
		// char gender = '男';
		// String hobby = "Games";
		// System.out.println("姓名\t年龄\t性别\t爱好" +
		// 	"\n" + name + "\t" + age + "\t" + gender + "\t" + hobby);


		System.out.println("===================");
		System.out.println(10 / 4);       //10/4为int型 即=2
		System.out.println(10.0 / 4);      //值为2.5   因为10.0为double型
		double num1 = 10 / 4;     //java中10/4=2  赋值给num1--->2.0
		System.out.println(num1);

		// int j = 8;
		// int k = ++j;     //前++ : ++i先自增再赋值
		// int a = 10;
		// int s = a++;     //后++ : i++先赋值再自增
		// System.out.println("j=" + j + "k=" + k);  
		// System.out.println("a=" + a + "s=" + s);  

		// int i = 1;
		// i = i++;
		// System.out.println(i);  //(1)临时变量temp = i (2)i = i + 1 (3)i = temp 即i的值为1
            					//先赋值后自增


		System.out.println("===================");
		//短路与  短路或
		int a = 10;
		int b = 22;
		if (a > 9 | b <33){
			System.out.println("okokokookokokok"); 
		}

		if (a > 44 | b <6){
			System.out.println("okokokookokokok"); 
		}












	}

}