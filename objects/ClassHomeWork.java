public class ClassHomeWork {
	public static void main(String[]args) {
		double arr[] = {13.2,324.2,343.2,332.1,67};
		A01 a1 = new A01();
		Double res = a1.max(arr);       //将Double看作是一个对象，否则不能接空值
		if (res != null){
			System.out.println("arr[]中最大的数为" + a1.max(arr));

		}else{
			System.out.println("arr的值有误");
		}

		System.out.println("===============================");


		String names[] = {"张三","李四","王五","老二","老三"};
		A02 p1 = new A02();
		System.out.println("这个名字的下标为：" + p1.find(names,"王"));
		System.out.println("===============================");


		Book b1 = new Book("love story",199);
		b1.updatePrice();           //更新书籍价格
		System.out.println("更新数据书籍价格" + b1.bookname + "为：" + b1.price);
		System.out.println("===============================");
		

		int orignnum[] = {1,25,534,12,35,134,552,14}; 
		A03 arr1 = new A03();
		int goalnum[] = arr1.copyArr(orignnum);
		for (int i = 0; i < goalnum.length; i++){
			System.out.print(goalnum[i] + "  ");
		}
		System.out.println("===============================");




		Circle yuan = new Circle();
		System.out.println("圆的面积为：" + yuan.mianJ(3));
		System.out.println("圆的周长为：" + yuan.zhouC(3));
		System.out.println("===============================");




		Cale calcul = new Cale();
		calcul.jia(32,12);
		calcul.jian(32,12);
		calcul.cheng(32,12);
		calcul.chu(32,0); 



	}

}




class A01{                  //找出一个数组中的最大值

	public Double max(double num[]){
		if (num != null && num.length != 0){       //判断传入的数组是否为空


			double max = num[0];
			for (int i = 1; i < num.length; i++){
				if (max < num[i]){
					max = num[i];
				}
			}
			return max;
		}else{
			return null;          //返回类型为Double，可以与null进行比较，而double不行
		}
	}
}



class A02{                   //查找一个字符数组中的名字

	public int find(String names[], String name){
		for (int i = 0; i < names.length; i++){
			if (names[i].equals(name)){
				System.out.println("查找成功！");				
				return i;
			}
		}
		return -1;
		
	}


}



 
class Book{                    //更新书本价格
	double price;
	String bookname;
	public Book(String bookname, double price){
		this.bookname = bookname;
		this.price = price;
	}
	public void updatePrice(){
		if (this.price > 150){
			this.price = 150;
		}else if(this.price > 100){
			this.price = 100;
		}

	}

}


class A03{             //复制一个数组

	public int[] copyArr(int num[]){                   //返回类型为一个数组ints[]
		int arr[] = new int[num.length];
		for (int i = 0; i < num.length; i++){
			arr[i] = num[i];
		}
		return arr;
	}


}


class Circle{              //求圆的面积和周长

	double r;
	public double zhouC(double r){
		return 2  * 3.14 * r;
	}
	public double mianJ(double r){
		return 3.14 * r * r;
	}
}



class Cale{                   //计算加减乘除 

	public void jia(double a, double b){
		System.out.println(a + "+" + b + "=" + (a + b));
	}
	public void jian(double a, double b){
		System.out.println(a + "-" + b + "=" + (a - b));
	}
	public void cheng(double a, double b){
		System.out.println(a + "*" + b + "=" + (a * b));
	}
	public void chu(double a, double b){
		if (b != 0){
			System.out.println(a + "/" + b + "=" + (a / b));
		}else {
			System.out.println("除数不能为0！");
		}
	}

}



class Employee{          //编写三个构造器重载
	String name;
	char sex;
	int age;
	String profess;
	double salary;

	public Employee(String name, char sex, int age, String profess, double salary){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.profess = profess;
		this.salary = salary;
	}

	public Employee(String name, char sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public Employee(String profess, double salary){
		this.profess = profess;
		this.salary = salary;
	}



}