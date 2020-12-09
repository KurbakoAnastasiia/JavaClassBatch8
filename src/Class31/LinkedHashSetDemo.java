package Class31;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Strawberry");
        linkedHashSet.add("Avocado");
        linkedHashSet.add("Olives");

        System.out.println(linkedHashSet);
    }
}
