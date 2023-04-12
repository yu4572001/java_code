package customgeneric;

public class CustomGeneric02 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat("大黄",5);   //当调用方法时，编译器就会确定泛型的类型

    }
}

//泛型方法，既可以在普通类中使用，也可以在泛型类中使用
class Cat{  //普通类
    public void run(){
    }

    public <T,R> void eat(T t,R r) {   //泛型方法
        System.out.println(t.getClass());    //class java.lang.String
        System.out.println(r.getClass());    //class java.lang.Integer
    }
}

class Fish<U,O> {  //泛型类
    public void run() {   //普通方法
    }

    public <S, Q> void eat(S s, Q q) {  //泛型方法

    }
    //说明
    //1.下面的hi方法不是泛型方法
    //2.是hi方法使用了类生命的泛型
    public void hi(U u){

    }
    //泛型方法，可以使用类声明的泛型，也可以使用自己声明的泛型
    public <I> void f1(U u, I i){

    }
}