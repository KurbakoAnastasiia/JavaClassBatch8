package Class33;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW6 {
    /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
*/
    public static void main(String[] args) {
        Set<String> objects = new LinkedHashSet<>();
        objects.add("My ");
        objects.add("name ");
        objects.add("is ");
        objects.add("Anastasiia");

        String str = "";

        for(String obj : objects) {
            str += obj;
        }

        System.out.println(str);
    }
}
