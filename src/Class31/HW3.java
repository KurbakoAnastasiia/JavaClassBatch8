package Class31;

import java.util.*;

public class HW3 {
    public static void main(String[] args) {
        /*How can you remove all duplicates from ArrayList?*/
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        Set<String> linkedhashSetList = new LinkedHashSet<>(aList);
        System.out.println(linkedhashSetList);
    }
}
