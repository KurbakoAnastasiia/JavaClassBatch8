package Class22;

public class PrivateMethodOverloading {

    /*Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.*/

    private void demo() {
        System.out.println("I love  Java");
    }
    private void demo(String hobby) {
        System.out.println("I love " + hobby);
    }
    private void demo(String name, int age){
        System.out.println("My name is " + name + ". I'm " + age + " years old");
    }

    public static void main(String[] args) {
        PrivateMethodOverloading obj1 = new PrivateMethodOverloading();
        obj1.demo("Ilya", 15);
        obj1.demo("Programming");
        obj1.demo();
    }
}
