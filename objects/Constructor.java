public class Constructor {
	public static void main(String[]args) {

		Person p1 = new Person("rose", 22);
		System.out.println("p1 name = " + p1.name + "\t" + "age = " + p1.age);
		Person p2 = new Person();        //���õĹ�����û�д��ݲ�����Ҫ����һ��Ĭ�Ϲ�����
		System.out.println("p2 ��age = " + p2.age);


	}
}




class Person {

	String name;
	int age;

	//��д���������ڴ�������ʱ�����Զ�ִ�н��г�ʼ��
	public Person (String Pname, int Page){
		System.out.println("������������");
		name = Pname;
		age  = Page;
	}
	Person (){        //���Ĭ�Ϲ���������ֹû�д��ݲ�������ֹ�����������
		age = 18;     //Ĭ��age=18
	}



}