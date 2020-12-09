package Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo5 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Tea");
        drinks.add("Coffee");
        drinks.add("Milk");
        drinks.add("Soda");
        drinks.add("Scotch");
        drinks.add("Vodka");
        drinks.add("Turkish Raki");

        Iterator<String> iterator = drinks.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if(next.equals("Scotch") || next.equals("Vodka") || next.equals("Turkish Raki")) {
                iterator.remove();
            }
        }
        System.out.println(drinks);
    }
}
