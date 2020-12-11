package Class33;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HW3 {
    /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/

    public static void main(String[] args) {
        Map<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(7664847, "Printer");
        bestBuy.put(7879885, "TV");
        bestBuy.put(7690876, "Vacuum cleaner");
        bestBuy.put(7865432, "Fridge");
        bestBuy.put(7890543, "Oven");
        bestBuy.put(9035268, "Laptop");
        bestBuy.put(7352629, "Camera");
        bestBuy.put(7890245, "Speaker");
        bestBuy.put(7967534, "Headphones");
        bestBuy.put(7890634, "Phones");

        Set<Map.Entry<Integer, String>> allItems = bestBuy.entrySet();
        Iterator<Map.Entry<Integer, String>> iteratorMap = allItems.iterator();
        while (iteratorMap.hasNext()) {
            Map.Entry<Integer, String> mapElements = iteratorMap.next();
            System.out.println(mapElements.getKey() + " " + mapElements.getValue());
        }
    }
}
