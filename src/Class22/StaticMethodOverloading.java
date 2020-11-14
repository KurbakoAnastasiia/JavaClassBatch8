package Class22;

public class StaticMethodOverloading {
    /*Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.*/

    static void println(int a, int b) {
        System.out.println(a + b);
    }
    static void println(String a, String b) {
        System.out.println(a + b);
    }

    static void println(double a, int b, float c) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        println(6, 235);
        StaticMethodOverloading.println(3.99, 98, 8.67f);
        println("Hello", " Wolrd");
    }
}
