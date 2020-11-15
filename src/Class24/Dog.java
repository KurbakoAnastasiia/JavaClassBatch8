package Class24;

public class Dog {
    void bark() {
        System.out.println("Dod is barking");
    }
    void sleep() {
        System.out.println("Dog is sleeping");
    }
    void eat(){
        System.out.println("Dog is Eating");
    }
    void appearance() {
        System.out.println("I dont have any appearance I am general dog class");
    }
}
class Cockapoo extends Dog {
    void appearance() {
        System.out.println("I have long hairs");
    }
    void sleep() {
        System.out.println("I sleep 16 hours a day");
    }
}
class Chow extends Dog {
    void appearance() {
        System.out.println("I have sharp teeth");
    }
    void special() {
        System.out.println("I love kids");
    }
    void hunt() {
        System.out.println("hunt Squirrels");
    }
}
