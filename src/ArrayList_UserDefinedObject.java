import java.util.*;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
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

public class ArrayList_UserDefinedObject{
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User("John",34));
        users.add(new User("ram",56));
        users.add(new User("Rohan",65));

        users.forEach(user ->{
            System.out.println("Name: " + user.getName()+ ", Age : " + user.getAge());
        });
    }
}