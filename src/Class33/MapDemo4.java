package Class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jack", 111);
        hashMap.put("Vladimir", 222);
        hashMap.put("Maria", 333);
        hashMap.put("Denis", 444);
        hashMap.put("Daria", 555);
        hashMap.put("Jasoor", 666);

        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
        // Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();  short way to iterate

        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> element = iterator.next();
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }
}