package Class14;

public class Substring {
    public static void main(String[] args) {
        String str = "Welcome to Happy World";
        System.out.print("Return Value :" );
        System.out.println(str.substring(10));
        System.out.print("Return Value :" );
        System.out.println(str.substring(10, 15));


        String name = "Can u write the second m too ?";
        System.out.println(name.substring(10)); // first 10 characters will be ignored
        System.out.println(name.substring(0)); // redundant
        // System.out.println(name.substring(-1)); // Error
        System.out.println(name.substring(5, 10)); // "Can u" will be ignored (first 5 characters)
                                                   // and "e the second m too ?" will be ignored (all characters after 10 index character
        System.out.println(name.substring(6, 11) + name.substring(15, 22));
    }
}
