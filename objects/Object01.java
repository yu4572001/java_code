public class Object01 {
	public static void main(String[]args) {


		// //����Person����
		// //jeckֻ�Ƕ�����(��������)
		// //new Person()�����Ķ���ռ�(����)���������Ķ���
		// Person jeck = new Person();      //ֻ��Ҫ����һ�μ���
		// Person rose = jeck;     //��������ָ��ͬһƬ����ռ�
		// rose = null;            //��rose�ĵ�ַ��գ������֮ǰ����ռ�İ�
		// jeck.speak();    //����Person�෽��
		
		// int plus1 = jeck.plus(2209,12122);
		// System.out.println("plus�����Ľ����" + plus1);
		// int sum1 = jeck.multiply(10);            //()�������Ϊʵ�Σ��û����룬ʹ��sum1�����ܴ�����ֵ
		// System.out.println("10�Ľ׳�Ϊ��" + sum1);



		// Person p = new Person();
		// p.name = "jeck";
		// p.age = 1099;
		// Tools mytools = new Tools();
		// Person p2 = mytools.copyobject(p);
		// System.out.println("main������p.name = " + p.name + "\t" + "p.age = " + p.age);
		// System.out.print("copyobject������p2.name = " + p2.name + "\t" + "p2.age = " + p2.age);


		//�ɱ������ϰ
		Exercise abbprint = new Exercise();
		abbprint.printscore("С��", 56.3, 82.5);


	}
}

	

// class Person {
// 	//����
// 	String name;
// 	int age;
// 	double sal;

// 	//����
// 	//1.public ��ʾ����ʱ������
// 	//2.void ��ʾ����û�з���ֵ
// 	//3.speak()��speak�Ƿ�������()���β��б�
// 	//4.{}�Ƿ��������
// 	public void speak() {
// 		System.out.println("����һ�����ˣ�");
// 	}

	

// 	public int plus(int num1, int num2){       //int��ʾ����һ��intֵ
// 		int res = num1 + num2;
// 		return res;            //return ��ʾ�Ѻ�����res��ֵ����
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


//�ɱ����
class Exercise{

	public void printscore(String name, double... score){
		System.out.println("����Ϊ��" + name);
		double  sum = 0;
		for (int i = 0; i < score.length; i++){
			sum += score[i];
		}
		System.out.println("�ɼ��ܷ�Ϊ��" + sum);

	}



}



