package Class30;

import java.util.ArrayList;

public class HW2 {
    /*Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.*/
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Water");
        drinks.add("Milk");
        drinks.add("Juice");
        drinks.add("Soda");
        drinks.add("Beer");
        drinks.add("Wine");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);
    }
}
