//�����
public class Operator {
	public static void main(String[]args){
		
		//��Ԫ�����
		int a = 22;
		int b = 93;
		int result = a < b ? a++ : --b;
		System.out.println("result=" + result);
		System.out.println("a=" + a);


		int num1 = 1293;
		int num2 = 542232;
		int num3 = 3823;
		int max1 = num1 > num2 ? num1 : num2;
		int max2 = max1 > num3 ? max1 : num3;
		System.out.println("���ֵΪ" + max2);

		System.out.println(2|3);
		System.out.println(2^3);

		int yu = 66;
		System.out.println(++yu+yu);











	}
}