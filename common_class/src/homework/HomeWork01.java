package homework;

//字符串反转
public class HomeWork01 {
    public static void main(String[] args) {
        String str = "abcdefgh";
        System.out.println(reverse(str,1,30));
    }


    public static String reverse(String str, int start, int end){
        if(!(str != null && start >= 0 && end >= start && end < str.length())){
            throw new RuntimeException("参数不正确");

        }

        char temp[] = str.toCharArray();
        int limit = (start + end) / 2;
        char ch = ' ';
        for (int i = start,j = end; i <= limit && j >= limit;i++,j--) {
            ch = temp[i];
            temp[i] = temp[j];
            temp[j] = ch;
        }
        return String.valueOf(temp);
    }
}
