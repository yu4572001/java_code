public class Constructor {
	public static void main(String[]args) {

		Person p1 = new Person("rose", 22);
		System.out.println("p1 name = " + p1.name + "\t" + "age = " + p1.age);
		Person p2 = new Person();        //调用的构造器没有传递参数，要重载一个默认构造器
		System.out.println("p2 的age = " + p2.age);


	}
}




class Person {

	String name;
	int age;

	//编写构造器，在创建对象时，会自动执行进行初始化
	public Person (String Pname, int Page){
		System.out.println("构造器被调用");
		name = Pname;
		age  = Page;
	}
	Person (){        //添加默认构造器，防止没有传递参数，防止创建对象出错
		age = 18;     //默认age=18
	}



}