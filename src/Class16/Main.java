package Class16;

public class Main {
    public static void main(String[] args) {
       // we can access to methods in class VoidMethods only if we create the object
        // because it is not static methods
        VoidMethods voidMethods = new VoidMethods();
        voidMethods.print();
        VoidMethods.print1(); // can use method print1 without creating objects because its static

        voidMethods.print("Hello Alladin");

    }
}
