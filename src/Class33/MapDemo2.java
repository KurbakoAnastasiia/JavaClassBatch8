package Class33;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jack", 111) ;
        hashMap.put("Vladimir",222);
        hashMap.put("Maria", 333);
        hashMap.put("Denis", 444);
        hashMap.put("Daria", 555);
        hashMap.put("Jasoor", 666);

        System.out.println(hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Jack", 111) ;
        linkedHashMap.put("Vladimir",222);
        linkedHashMap.put("Maria", 333);
        linkedHashMap.put("Denis", 444);
        linkedHashMap.put("Daria", 555);
        linkedHashMap.put("Jasoor", 666);

        System.out.println(linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Jack", 111) ;
        treeMap.put("Vladimir",222);
        treeMap.put("Maria", 333);
        treeMap.put("Denis", 444);
        treeMap.put("Daria", 555);
        treeMap.put("Jasoor", 666);

        System.out.println(treeMap);

    }
}
