package string_;

public class String03 {
    String str = new String("yystudy");
    final char ch[] = {'j','a','v','a'};
    public void change(String str,char ch[]){
        /**
         * 这里是将堆中的数组空间的值修改了，final只是不能指向新的地址，但其中的值可以修改
         * 这里的str指向了一片新的String对象，并不是修改了之前的String对象
         * 当这个方法的栈空间释放掉时，这个str以及创建的String对象将被回收
         */
        ch[0] = 'h';
        str = new String("daydayup");

    }

    public static void main(String[] args) {
        String03 string03 = new String03();
        string03.change(string03.str,string03.ch);
        System.out.println(string03.str);
        System.out.println(string03.ch);
    }
}
