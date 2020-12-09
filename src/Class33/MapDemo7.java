package Class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String, Double> storeItemsDay1 = new HashMap<>();
        storeItemsDay1.put("Milk", 3.2);
        storeItemsDay1.put("Bread", 0.6);
        storeItemsDay1.put("Cake", 40.0);
        storeItemsDay1.put("Diaper", 39.99);
        storeItemsDay1.put("Eggs", 4.99);

        HashMap<String, Double> storeItemsDay2 = new HashMap<>();
        storeItemsDay2.put("beer", 12.0);
        storeItemsDay2.put("coffee", 5.0);
        storeItemsDay2.put("snack", 5.0);

        storeItemsDay2.putAll(storeItemsDay1);

        System.out.println(storeItemsDay2.get(null));
        System.out.println(storeItemsDay2.get("lion"));

        Set<String> set = storeItemsDay2.keySet();
        storeItemsDay2.remove("beer");
        Iterator<String> iterator = set.iterator();

        Double sum = 0.0;
        /*for (String item : set) {

            if(item.equals("beer")) {
                storeItemsDay2.remove(item);
            }
            if (storeItemsDay2.get(item) != null) { Exception never use foreach to remove the items
            sum += storeItemsDay2.get(item);
           }
        }
        System.out.println("Total spending " + sum);*/
        System.out.println(storeItemsDay2.size());
        while (iterator.hasNext()) {
            String item = iterator.next();

            if(storeItemsDay2.get(item) != null) {
                sum += storeItemsDay2.get(item);
            }
        }
        System.out.println("Total spending " + sum);
    }
}
