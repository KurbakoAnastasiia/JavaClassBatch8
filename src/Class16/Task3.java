package Class16;

public class Task3 {

    // Create a method that will print whether given String is palindrome or not.

    /* public static boolean palindrome(String word) {
     *//**//* *//**//**//**//*String wordReverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            wordReverse = wordReverse + word.charAt(i);
        }
        if (word.equalsIgnoreCase(wordReverse)) {
            return true;
        } else {
            return false;
        }*//**//**//**//*
    }*//*

    public static void main(String[] args) {
        System.out.println("The word is palindrome: " + palindrome("Cat"));
    }*/

    public void isStringPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                System.out.println("String is not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("String is a palindrome");
    }

}