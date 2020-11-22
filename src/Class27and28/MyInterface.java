package Class27and28;

public interface MyInterface extends MyInterface2, MyInterface3 {
    // before Java 8
    String name = "hi";
    public void printInfo();
    //Java 8
    static void printNumber() {
        System.out.println("102384879453");
    }
    default void printName() {
        //these default are used to support lambdas
    }
}
