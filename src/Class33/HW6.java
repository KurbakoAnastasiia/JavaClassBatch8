package Class33;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW6 {
    /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
*/
    public static String wordsConcat(LinkedHashSet<String> set){
        String longWord="";
        for (String word:set){
            longWord=longWord+word;
        }
        return longWord;
    }
    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("My ");
        words.add("name ");
        words.add("is ");
        words.add("Anastasiia");

        System.out.println(wordsConcat(words));
    }
}
