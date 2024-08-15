import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayList{
    public static void main(String[] args) {
        List<String> tvshows = new ArrayList<>();

        tvshows.add("Breaking Bad");
        tvshows.add("Friends");
        tvshows.add("How I met your mother");
        tvshows.add("Game of thrones");

        System.out.println("=== Iterate using Java 8 forEach and lanmbda =====");

        tvshows.forEach(tvshow -> {
            System.out.println(tvshow);
        });
        System.out.println("\n=== Iterate using an iterator() === ");
        Iterator<String> tvshowIterator = tvshows.iterator();
        while (tvshowIterator.hasNext()) {
            String tvshow = tvshowIterator.next();
            System.out.println(tvshow);
        }

        System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method === ");
        tvshowIterator = tvshows.iterator();
        tvshowIterator.forEachRemaining(tvshow -> {
            System.out.println(tvshow);
        });


        System.out.println("\n=== Iterate using a listIterator() to traverse in both direction === ");

        // here we start from the end of the list and traverse backwards.
        ListIterator<String> tvshowListIterator = tvshows.listIterator(tvshows.size());

        while(tvshowListIterator.hasPrevious()) {
            String tvshow = tvshowListIterator.previous();
            System.out.println(tvshow);
        }

        System.out.println("\n === Iterate using simple for-each loop ===");
        for(String tvshow: tvshows){
            System.out.println(tvshow);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for(int i = 0; i < tvshows.size(); i++){
            System.out.println(tvshows.get(i));
        }
    }
}