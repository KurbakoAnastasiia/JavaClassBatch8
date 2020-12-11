package Class33;

import java.util.*;

public class HW2 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();

        countries.put("France", "Paris");
        countries.put("Austria", "Vienna");
        countries.put("Belgium", "Brussels");
        countries.put("Canada", "Ottawa");
        countries.put("England", "London");
        countries.put("Germany", "Berlin");
        countries.put("Greece", "Athens");
        countries.put("USA", "Washington DC");
        countries.put("Russia", "Moscow");

        System.out.println("Print all keys and values from a country map using for each loop");
        Set<String> keys = countries.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + countries.get(key));
        }
        System.out.println("Print all keys and values from a country map using iterator");
        Iterator<String> iteratorKey = keys.iterator();
        while(iteratorKey.hasNext()) {
            String key = iteratorKey.next();
            System.out.println(key + ": " + countries.get(key));
        }

        Collection<String> values = countries.values();
        System.out.println("Print all values from a country map using for each loop");
        for(String value : values) {
            System.out.println(value);
        }
        System.out.println("Print all values from a country map using iterator");
        Iterator<String> iteratorValue = values.iterator();
        while(iteratorValue.hasNext()) {
            String value = iteratorValue.next();
            System.out.println(value);
        }

    }
}
