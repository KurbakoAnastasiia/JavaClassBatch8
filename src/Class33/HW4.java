package Class33;


import java.util.*;

public class HW4 {
    /*Create a Map from array of cities that will sort keys in alphabetical order.
    As a key store the name of the city and as a value store the length of the city
    (Example: Paris=5, Moscow =6, Washington DC=13 etc..).
If any city name is more than 7 characters remove that city . */

    public static void main(String[] args) {
        String[] citiesArray = {"Paris", "Moscow", "Washington DC", "Helsinki", "Oslo", "Berlin", "Ottawa"};

        Map<String, Integer> citiesMap = new TreeMap<>();

        for(int i = 0; i < citiesArray.length; i++) {
            citiesMap.put(citiesArray[i], citiesArray[i].length());
        }
        System.out.println(citiesMap);

        Set<Map.Entry<String, Integer>> citiesSet = citiesMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = citiesSet.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> element = iterator.next();

            if(element.getValue() > 7) {
                iterator.remove();
            }
        }
        System.out.println(citiesMap);
    }
}
