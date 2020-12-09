package Class33;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(111, "Jack");
        map.put(111, "Vladimir");
        map.put(111, "Maria");
        map.put(111, "Denis");
        map.put(111, "Daria");
        map.put(111, "Jasoor");

        System.out.println(map);  //only one value will be stored in the map because we are providing the same key again and again

    }
}
