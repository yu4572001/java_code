package customgeneric;

public class CustomGeneric01 {
    public static void main(String[] args) {

    }
}

//当类实现接口时，由于IA接口继承了IUsb接口并指定T为Sting，U为Double
//而在实现接口的方法中，使用String替换了T，使用了Double替换了U
class Test implements IA{

    @Override
    public String get(Double aDouble) {
        return null;
    }

    @Override
    public void hi(String s) {

    }

    @Override
    public void run(String t1, String t2, Double u1, Double u2) {

    }
}

//类实现接口时，也可以直接指定泛型接口的类型
class Test_ implements IUsb<Integer,Float>{

    @Override
    public Integer get(Float aFloat) {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void run(Integer t1, Integer t2, Float u1, Float u2) {

    }
}

class AA implements IUsb{     //这里没有指定泛型接口的类型，默认为Object

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object t1, Object t2, Object u1, Object u2) {

    }
}

interface IUsb<T,U>{
    T get(U u);

    void hi(T t);

    void run(T t1, T t2, U u1, U u2);

    default U method(U u){
        return null;
    }
}

interface IA extends IUsb<String,Double>{
  //继承接口时，要指定泛型接口的类型
}

