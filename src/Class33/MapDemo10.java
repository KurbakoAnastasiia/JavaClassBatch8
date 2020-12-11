package Class33;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo10 {
    public static void main(String[] args) {
        Map<String,Double> storeItems=new LinkedHashMap<>();
        storeItems.put("Milk",3.2);
        storeItems.put("Bread",0.6);
        storeItems.put("Cake",40.0);
        storeItems.put("Diaper",39.99);
        storeItems.put("Eggs",4.99);

        Iterator<String> iterator = storeItems.keySet().iterator();

        System.out.println(storeItems);

        while (iterator.hasNext()){
            if(iterator.next().equals("Bread")){
                iterator.remove();
            }
        }
        System.out.println(storeItems);


        Iterator<Map.Entry<String, Double>> iterator1 = storeItems.entrySet().iterator();

        while (iterator1.hasNext()){
            Map.Entry<String, Double> next = iterator1.next();
            if(next.getKey().equals("Diaper")){
                iterator1.remove();
            }

        }

        System.out.println(storeItems);

        Map<String,Integer> map= new LinkedHashMap<>();
        Map<String,Integer> map1= new TreeMap<>();
        Map<String,Integer> map2= new Hashtable<>();

        Map<String,Integer> map3= new WeakHashMap<>();
        Map<String,Integer> map4= new IdentityHashMap<>();
        Map<String,Integer> map5= new ConcurrentHashMap<>();




    }
}
