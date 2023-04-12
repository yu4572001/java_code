package generic_;

public class Generic02 {
    public static void main(String[] args) {
        //E的具体类型时在创建Person对象时确定的
        Person<String> person = new Person<String>("jack");  //这里确定了E为String，所以在构造器中也要为String
        /*
        相当于：
            class Person<String>{
                String name;

                public Person(String name) {
                    this.name = name;
                }

                public String f1(){
                    return this.name;
                }
            }
         */

        Person<Integer> person1 = new Person<>(1000);   //这里确定了E为Integer，所以在构造器中也要为Integer
        /*
        相当于：
        class Person<Integer>{
            Integer name;

            public Person(Integer name) {
                this.name = name;
            }

            public Integer f1(){
                return this.name;
            }
        }
         */

    }
}

class Person<E>{      //在定义时编写E，那么可以在编译时确定E的类型，则该类中所有的E都会变成这个类型
    E name;    //E可以是数据类型

    public Person(E name) {    //E可以是参数类型
        this.name = name;
    }

    public E f1(){       //E可以是返回类型
        return this.name;
    }
}
