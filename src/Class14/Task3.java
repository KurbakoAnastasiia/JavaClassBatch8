package Class14;

public class Task3 {
    public static void main(String[] args) {
        /* Create a String and if the String is not empty perform the following:
       if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
         */

        String str = "Anastasiia839";
        int length = str.length();

        if (!str.isEmpty()) {
            if(length >= 3 && length % 2 != 0) {
                System.out.println(str.charAt(length / 2));
            }
        }
    }
}
