public class Exercise {
	public static void main(String[]args){
     
		//温度转换
		double huashi = 1022;
		double degree = 5.0 / 9.0 * (huashi - 100);      //注意数据类型5/9为int型,值为0,所以要写成5.0/9转为double型
		System.out.print("华氏温度" + huashi + "对应摄氏温度为" + degree);
		



	}
}