package generic_;

import org.junit.jupiter.api.Test;

public class GenericDetail {
    public static void main(String[] args) {
        //在给泛型指定类型后，可以传入该类型或者其子类型
        Pig<A> aPig = new Pig<>(new A());
        Pig<A> aPig1 = new Pig<>(new B());
        aPig1.f1();     //class generic_.B
        aPig.f1();      //class generic_.A

    }
}

class A{}
class B extends A{}

class Pig<E>{
    E type;

    public Pig(E type) {
        this.type = type;
    }

    public void f1(){
        System.out.println(type.getClass());
    }
}
