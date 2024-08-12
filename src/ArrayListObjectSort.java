import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class ArrayListObjectSort {
        public static void main(String[] args) {
            List<Person> people = new ArrayList<>();
            people.add(new Person("Sachin", 34));
            people.add(new Person("Chris", 34));
            people.add(new Person("Ram", 25));

            System.out.println("Person List: " + people);

            // Sort People by their age
            people.sort((person1, person2) -> person1.getAge() - person2.getAge());

            // A more concise way of writing the above sorting function
            people.sort(Comparator.comparingInt(Person::getAge));

            System.out.println("Sorted person list by age: " + people);

            // Sort using Collections.sort() method with a custom Comparator
            Collections.sort(people, Comparator.comparing(Person::getName));
            System.out.println("Sorted person list by name: " + people);
        }
    }
}
