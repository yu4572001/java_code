public class MethodLoad {
	public static void main(String[]args) {
	

	// Methods exercise = new Methods();
	// exercise.m(2);
	// exercise.m(22,33);
	// exercise.m("jsoas;sj;fd");


	// System.out.println(exercise.max(122,123));
	// System.out.println(exercise.max(1222.1,1233.1,653233.2));
	// System.out.println(exercise.max(2121.21,123423.1));



	}
}







//��������
class Methods {


	// ��������������ͬ
	// �β��б����벻ͬ(�β����ͻ������˳��������һ����ͬ����������Ҫ��)
	// �������ͣ���Ҫ��
	public void m(int n){
		System.out.println("ƽ�� = " + (n * n));
	}

	public void m(int a, int b){
		System.out.println("��� = " + (a * b));
	}

	public void m(String a){
		System.out.println("����ַ��� = " + a);
	}
	

	public int max(int a, int b){
		if (a > b){
			return a;
		}
		return b;
	}


	public double max(double a, double b){
		if (a > b){
			return a;
		}
		return b;
	}

	public double max(double a, double b, double c){
		double max = a > b ? a : b;
		return max > c ? max : c;
	}
		





}