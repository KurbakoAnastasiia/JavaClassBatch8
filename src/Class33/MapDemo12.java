package Class33;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo12 {
    public static void main(String[] args) {
        Map<String,Double> storeItems=new LinkedHashMap<>();
        storeItems.put("Milk",3.2);
        storeItems.put("Bread",0.6);
        storeItems.put("Cake",40.0);
        storeItems.put("Diaper",39.99);
        storeItems.put("Eggs",4.99);
        Collection<Double> values = storeItems.values();
        System.out.println(values);
    }
}
