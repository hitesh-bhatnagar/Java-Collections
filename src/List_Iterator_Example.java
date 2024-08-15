import java.util.*;
public class List_Iterator_Example {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();

        names.add("Welcome");
        names.add("to");
        names.add("Repository");

        // Getting ListIterator
        ListIterator<String> namesIterator = names.listIterator();

        // Traversing elements using next() method
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        // for-each loop creates Internal Iterator here.
        for (String s : names) {
            System.out.println(s);
        }
    }
}