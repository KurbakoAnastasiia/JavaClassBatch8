package Class15;

import java.util.Arrays;

public class HW {
    public static void main(String[] args) {

        System.out.println("-----------------TASK 1------------------------");
        // How would you reverse a String character by character?
        StringBuilder str = new StringBuilder("Programming");
        System.out.println(str.reverse().toString());

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
    }
        System.out.println("----------------Another way-------------------");
        String str1 = "Anna";
        String reverse = "";
        for (int n = str1.length() - 1; n >= 0; n--) {
            reverse += str1.charAt(n);
        }
        System.out.println(reverse);
        System.out.println("Is " + str1 + " palindrome?" + reverse.equalsIgnoreCase(str1));

        System.out.println();
        System.out.println("-----------------TASK 2----------------------");
        // How would you reverse a String word by word?

        String sentence = "What did u use the most?";
        String[] stringArray = sentence.split(" "); // to split ellements inside array
        System.out.println(Arrays.toString(stringArray)); // to print all elements array
        for (int i = 0; i < stringArray.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(stringArray[i]); // to store element of array in another String
            // System.out.println(stringBuilder); // to print array[i] before reversing
            stringArray[i] = stringBuilder.reverse().toString(); // to reverse elements
            // System.out.println(stringArray[i]); // to print array[i] after reversing
        }
        System.out.println(Arrays.toString(stringArray));
        System.out.println();
        System.out.println("-----------------TASK 3----------------------");
        // How would you check if String is palindrome or not?
        String a = new String("Java");
        String b = "";
        for (int j = a.length() - 1; j >= 0; j--) {
            b = b + a.charAt(j);
        }
        if (b.equalsIgnoreCase(a)) {
            System.out.println("String " + a + " is palindrome");
        } else {
            System.out.println("String " + a + " is not palindrome");
        }
        System.out.println();
        System.out.println("-----------------TASK 4----------------------");
        // How would you swap  2 strings without a temporary variable?

        String word1 = new String("Hello");
        String word2 = new String("World");

        word1 = word1 + word2;
        word2 = word1.replaceAll(word2, "");
        word1 = word1.replaceAll(word2, "");

        System.out.println(word1);
        System.out.println(word2);
    }
}
