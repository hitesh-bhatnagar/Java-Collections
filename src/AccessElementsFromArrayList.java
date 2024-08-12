import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {
    public static void main(String[] args) {

        List<String> topcompanies = new ArrayList<String>();

        // Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? "+ topcompanies.isEmpty());
        // isEmpty() returns true if the string is empty [ length() is 0 ] and false if not.
        topcompanies.add("Google");
        topcompanies.add("Apple");
        topcompanies.add("Microsoft");

        // find the size of an ArrayList
        System.out.println("There are the top "+ topcompanies.size()+" companies in the world");
        System.out.println(topcompanies);

        // Retrieve the element at a given index
        String bestCompany = topcompanies.get(0);
        String secondbestCompany = topcompanies.get(1);
        String lastbestcompany = topcompanies.get(topcompanies.size() - 1);

        System.out.println(bestCompany);
        System.out.println(secondbestCompany);
        System.out.println(lastbestcompany);

        // Modify the element at a given index
        topcompanies.set(4,"Walmart" );
        System.out.println("modified top companies list "+ topcompanies);

    }
}