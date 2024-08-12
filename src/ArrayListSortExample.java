import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListSortExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(13);
        numbers.add(345);
        numbers.add(32);
        numbers.add(67);

        System.out.println("Before " + numbers);

        Collections.sort(numbers);
        System.out.println("After " + numbers);

    }
}