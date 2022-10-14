public class This {
	public static void main(String[]args) {

		Person p1 = new Person("jeak",21);
		TestPerson p2 = new TestPerson("jeck",22);
		if (p1.compareTo(p2)){          //传入一个对象
			System.out.println("这俩是同一个人！");
		}else{
			System.out.println("这俩是不同一个人！");
		}


	}
}





class Person{
	String name;
	int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public boolean compareTo(TestPerson p){             //形参为一个对象，传入一个对象来比较
		return this.name.equals(p.name) && this.age == p.age;
			
	
	
	}

}


class TestPerson{          //测试类，创建p2进行比较
	String name;
	int age;
	public TestPerson(String name, int age){
		this.name = name;
		this.age = age;
	}


}