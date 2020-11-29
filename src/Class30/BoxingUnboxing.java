package Class30;

public class BoxingUnboxing {
    public static void main(String[] args) {
        Integer nonPrimitive = 10; // AutoBoxing
        int primitiveInt = nonPrimitive; // AutoUnBoxing

        Integer integer = new Integer(10); // Boxing

        int number = integer.intValue(); // UnBoxing

    }
}
