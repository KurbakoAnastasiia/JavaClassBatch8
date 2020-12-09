package Class31;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HW4 {
    /*Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
    Using 2 different ways retrieve all elements from set.*/
    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("France");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("Italy");
        countries.add("Germany");
        countries.add("Finland");

        for (String country :
             countries) {
            System.out.print(country + " ");
        }

        System.out.println();
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
