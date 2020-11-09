package Class18;

public class Tasks {
       /* Create a method that will accept an array as parameters and
       will return a sum of all elements from that array.
       Method should be visibly only within same package and
       accessible by the creating an instance of the class.*/


    double sumArray (double[] arr) {
           double sum = 0;
           for (double v : arr) {
               sum += v;
           }
           return sum;
    }

    /*Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.*/

   public static String reversedStr(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
       return stringBuilder.reverse().toString();
        }

    /*Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.*/

    private static String vowelsOnly(String name) {
        return name.replaceAll("[^aAeEoOiIuU]", "");
    }

    public static void main(String[] args) {
        System.out.println(vowelsOnly("all the vowels will be removed"));

    }

}
