public class ClassHomeWork {
	public static void main(String[]args) {
		double arr[] = {13.2,324.2,343.2,332.1,67};
		A01 a1 = new A01();
		Double res = a1.max(arr);       //��Double������һ�����󣬷����ܽӿ�ֵ
		if (res != null){
			System.out.println("arr[]��������Ϊ" + a1.max(arr));

		}else{
			System.out.println("arr��ֵ����");
		}

		System.out.println("===============================");


		String names[] = {"����","����","����","�϶�","����"};
		A02 p1 = new A02();
		System.out.println("������ֵ��±�Ϊ��" + p1.find(names,"��"));
		System.out.println("===============================");


		Book b1 = new Book("love story",199);
		b1.updatePrice();           //�����鼮�۸�
		System.out.println("���������鼮�۸�" + b1.bookname + "Ϊ��" + b1.price);
		System.out.println("===============================");
		

		int orignnum[] = {1,25,534,12,35,134,552,14}; 
		A03 arr1 = new A03();
		int goalnum[] = arr1.copyArr(orignnum);
		for (int i = 0; i < goalnum.length; i++){
			System.out.print(goalnum[i] + "  ");
		}
		System.out.println("===============================");




		Circle yuan = new Circle();
		System.out.println("Բ�����Ϊ��" + yuan.mianJ(3));
		System.out.println("Բ���ܳ�Ϊ��" + yuan.zhouC(3));
		System.out.println("===============================");




		Cale calcul = new Cale();
		calcul.jia(32,12);
		calcul.jian(32,12);
		calcul.cheng(32,12);
		calcul.chu(32,0); 



	}

}




class A01{                  //�ҳ�һ�������е����ֵ

	public Double max(double num[]){
		if (num != null && num.length != 0){       //�жϴ���������Ƿ�Ϊ��


			double max = num[0];
			for (int i = 1; i < num.length; i++){
				if (max < num[i]){
					max = num[i];
				}
			}
			return max;
		}else{
			return null;          //��������ΪDouble��������null���бȽϣ���double����
		}
	}
}



class A02{                   //����һ���ַ������е�����

	public int find(String names[], String name){
		for (int i = 0; i < names.length; i++){
			if (names[i].equals(name)){
				System.out.println("���ҳɹ���");				
				return i;
			}
		}
		return -1;
		
	}


}



 
class Book{                    //�����鱾�۸�
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


class A03{             //����һ������

	public int[] copyArr(int num[]){                   //��������Ϊһ������ints[]
		int arr[] = new int[num.length];
		for (int i = 0; i < num.length; i++){
			arr[i] = num[i];
		}
		return arr;
	}


}


class Circle{              //��Բ��������ܳ�

	double r;
	public double zhouC(double r){
		return 2  * 3.14 * r;
	}
	public double mianJ(double r){
		return 3.14 * r * r;
	}
}



class Cale{                   //����Ӽ��˳� 

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
			System.out.println("��������Ϊ0��");
		}
	}

}



class Employee{          //��д��������������
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