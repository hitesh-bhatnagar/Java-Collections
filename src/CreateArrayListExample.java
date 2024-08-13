import java.util.*;

public class CreateArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of String using
        List<String> animals = new ArrayList<String>();

        // Adding new elements to the ARrayList

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayLisy
        animals.add(2,"Elephant");

        System.out.println(animals);
    }
}