public class StringToBasic {
	public static void main(String[]args){
		System.out.println("代码测试");
		
		//String类型转换，字符串转其他数据类型
		int n1 = 100;
		float n2 = 1.1f;
		double  n3 = 4.22;
		boolean n4 = true;
		String s1 = n1 + "";    //n1(100)int类型转成字符串
		String s2 = n2 + "";
		String s3 = n3 + "";
		String s4 = n4 + "";
		System.out.println(s1 + "    " + s2 + "    " + s3 + "    " + s4);   //输出100   1.1   4.22   true
        

		System.out.println("=======================");

 		//其他数据类型转字符串
        String s5 = "100";     //字符串转换成其他数据 利用基本数据类型对应的包装类方法parse
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        byte num4 = Byte.parseByte(s5);	
        boolean num5 = Boolean.parseBoolean("true");
        //输出
        System.out.println(num4);
        System.out.println(num2);

	}
}