package Class31;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Kiwi");
        treeSet.add("Apple");
        treeSet.add("Strawberry");
        treeSet.add("Avocado");
        treeSet.add("Olives");

        System.out.println(treeSet);
    }
}
