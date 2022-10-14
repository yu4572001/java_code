public class Object01 {
	public static void main(String[]args) {


		// //创建Person对象
		// //jeck只是对象名(对象引用)
		// //new Person()创建的对象空间(数据)才是真正的对象
		// Person jeck = new Person();      //只需要加载一次即可
		// Person rose = jeck;     //两个对象指向同一片对象空间
		// rose = null;            //将rose的地址变空，解除跟之前对象空间的绑定
		// jeck.speak();    //调用Person类方法
		
		// int plus1 = jeck.plus(2209,12122);
		// System.out.println("plus方法的结果：" + plus1);
		// int sum1 = jeck.multiply(10);            //()里的内容为实参，用户传入，使用sum1来接受传出的值
		// System.out.println("10的阶乘为：" + sum1);



		// Person p = new Person();
		// p.name = "jeck";
		// p.age = 1099;
		// Tools mytools = new Tools();
		// Person p2 = mytools.copyobject(p);
		// System.out.println("main方法的p.name = " + p.name + "\t" + "p.age = " + p.age);
		// System.out.print("copyobject方法的p2.name = " + p2.name + "\t" + "p2.age = " + p2.age);


		//可变参数练习
		Exercise abbprint = new Exercise();
		abbprint.printscore("小米", 56.3, 82.5);


	}
}

	

// class Person {
// 	//属性
// 	String name;
// 	int age;
// 	double sal;

// 	//方法
// 	//1.public 表示方法时公开的
// 	//2.void 表示方法没有返回值
// 	//3.speak()：speak是方法名，()是形参列表
// 	//4.{}是方法体代码
// 	public void speak() {
// 		System.out.println("我是一个好人！");
// 	}

	

// 	public int plus(int num1, int num2){       //int表示返回一个int值
// 		int res = num1 + num2;
// 		return res;            //return 表示把后买你res的值返回
// 	} 

// 	public int multiply(int n){
// 		int sum = 1;
// 		for (int i = 1; i <= n; i++){
// 			sum *= i;
// 		}
// 		return sum;
// 	}



class Person {
	String name;
	int age;
}
class Tools {
	public Person copyobject(Person p){
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}



}


//可变参数
class Exercise{

	public void printscore(String name, double... score){
		System.out.println("姓名为：" + name);
		double  sum = 0;
		for (int i = 0; i < score.length; i++){
			sum += score[i];
		}
		System.out.println("成绩总分为：" + sum);

	}



}



