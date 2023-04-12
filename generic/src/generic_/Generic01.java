package generic_;

import java.util.ArrayList;

//泛型快速入门
public class Generic01 {
    public static void main(String[] args) {
        //1.ArrayList<Dog> 表示存放到该集合中的元素类型为Dog类型
        //2.如果编译器在发现添加的类型不为Dog时，会报错
        //3.在遍历时，可以直接取出Dog类，而不是Object类
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("旺财",10));
        dogs.add(new Dog("发财",4));
        dogs.add(new Dog("招财",9));

        for (Dog dog : dogs) {   //这里可以写成Dog，不需要再进行向下转型
            System.out.println(dog.getName() + "=" + dog.getAge());
        }

    }
}


class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
