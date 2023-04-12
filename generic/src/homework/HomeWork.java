package homework;
import org.junit.jupiter.api.Test;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) {

    }

    @Test    //利用JUnit单元进行测试
    public void test(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001",new User(1,21,"jack"));
        userDAO.save("002",new User(2,32,"smith"));
        userDAO.save("003",new User(3,27,"rose"));
        userDAO.save("004",new User(4,54,"john"));

        System.out.println(userDAO.get("002"));
        userDAO.update("004",new User(4,45,"john"));
        userDAO.delete("003");
        System.out.println(userDAO.list());
    }
}

class DAO<T>{
    private Map<String,T> map = new HashMap<>();
    public void save(String id, T entity){
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id, T entity){
        if (map.containsKey(id)){
            map.put(id,entity);
        }
    }

    public List<T> list(){
        ArrayList<T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key :keySet) {
            list.add(map.get(key));
        }
        return list;

    }

    public void delete(String id){
        if (map.containsKey(id)) {
            map.remove(id);
        }
    }


}


class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}