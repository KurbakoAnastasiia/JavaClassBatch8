package Class33;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jack", 111);
        hashMap.put("Vladimir", 222);
        hashMap.put("Maria", 333);
        hashMap.put("Denis", 444);
        hashMap.put("Daria", 555);
        hashMap.put("Jasoor", 666);


        Set<String> keySet= hashMap.keySet();
        for (String key:keySet
        ) {
            System.out.println(key);
            System.out.println(hashMap.get(key));
        }
    }
}
