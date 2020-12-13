package Class35;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Map<String, Integer> hashTable = new Hashtable<>();
        // hashTable.put(null, 111) ;
        // hashTable.put("Vladimir", null);  Null not allowed will get NullPointer exception
        hashTable.put("Maria", 333);
        hashTable.put("Denis", 444);
        hashTable.put("Daria", 555);
        hashTable.put("Jasoor", 666);

    }
}
