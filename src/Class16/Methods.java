package Class16;

import Class13.Dog;

public class Methods {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark(); // we can access to another packages fron another classe only if they are public

        System.out.println(addNumbers(10, 20));
        System.out.println(addNumbers(10, 60));
        System.out.println(addNumbers(80, 20));
        System.out.println(addNumbers(100, 20));
        System.out.println(addNumbers(10, 30));
    }
    public static int addNumbers(int num1, int num2){
        return num1 + num2;
    }
}
