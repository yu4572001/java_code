package generic_;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        Students red = new Students("小红", 14);
        Students small = new Students("小明", 21);
        Students big = new Students("小强", 16);

        //HashSet
        HashSet<Students> setStu = new HashSet<>();
        setStu.add(red);
        setStu.add(small);
        setStu.add(big);

        //遍历：
        for (Students students :setStu) {
            System.out.println(students.getName() + " " + students);
        }


        //HashMap
        HashMap<String, Students> stu = new HashMap<>();
        stu.put(red.getName(),red);
        stu.put(small.getName(),small);
        stu.put(big.getName(),big);

        //遍历：
        Set<Map.Entry<String, Students>> entries = stu.entrySet();
        for (Map.Entry entry :entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Iterator<Map.Entry<String, Students>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Students> entry =  iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

class Students{
    private String name;
    private int age;

    public Students(String name, int age) {
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

    @Override
    public String toString() {
        return "age=" + age;
    }
}
