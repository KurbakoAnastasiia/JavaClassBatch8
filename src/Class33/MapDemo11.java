package Class33;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo11 {
    public static void main(String[] args) {

        Map<String,Double> storeItems=new LinkedHashMap<>();
        storeItems.put("Milk",3.2);
        storeItems.put("Bread",0.6);
        storeItems.put("Cake",40.0);
        storeItems.put("Diaper",39.99);
        storeItems.put("Eggs",4.99);

        Set<String> set = storeItems.keySet();

        System.out.println(storeItems);
        for (String key:set
        ) {
            if(key.equals("Bread")){
                storeItems.replace(key,10.0);
            }
        }
        System.out.println(storeItems);

    }
}
