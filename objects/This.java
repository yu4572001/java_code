public class This {
	public static void main(String[]args) {

		Person p1 = new Person("jeak",21);
		TestPerson p2 = new TestPerson("jeck",22);
		if (p1.compareTo(p2)){          //����һ������
			System.out.println("������ͬһ���ˣ�");
		}else{
			System.out.println("�����ǲ�ͬһ���ˣ�");
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
	public boolean compareTo(TestPerson p){             //�β�Ϊһ�����󣬴���һ���������Ƚ�
		return this.name.equals(p.name) && this.age == p.age;
			
	
	
	}

}


class TestPerson{          //�����࣬����p2���бȽ�
	String name;
	int age;
	public TestPerson(String name, int age){
		this.name = name;
		this.age = age;
	}


}