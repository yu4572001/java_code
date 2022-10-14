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







//方法重载
class Methods {


	// 方法名：必须相同
	// 形参列表：必须不同(形参类型或个数或顺序，至少有一样不同，参数名无要求)
	// 返回类型：无要求
	public void m(int n){
		System.out.println("平方 = " + (n * n));
	}

	public void m(int a, int b){
		System.out.println("相乘 = " + (a * b));
	}

	public void m(String a){
		System.out.println("输出字符串 = " + a);
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