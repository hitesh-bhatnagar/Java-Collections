// Let's see the example of HashSet. Notice the elements iterate in an unordered collection

import java.util.HashSet;
import java.util.Iterator;

class IgnoreDuplicateElements {

    // hashset example ignoring duplicate elements

        }
class HashSETExample {
    public static void Creation(){
        // creating HashSet and adding elements

        HashSet<String> set = new HashSet<>();

        set.add("ONE");
        set.add("TWO");
        set.add("THREE");
        set.add("FOUR");
        set.add("FIVE");

        Iterator<String> i = set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }

}

public class HashSET {
    public static void main(String[] args) {
        HashSETExample example = new HashSETExample();
        example.Creation();

    }
}



