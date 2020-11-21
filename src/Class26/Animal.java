package Class26;

public class Animal {
    String nameClass;
    Animal(String nameClass) {
        this.nameClass = nameClass;
    }
    void eat() {
        System.out.println("All animals eat");
    }
    void sleep() {
        System.out.println("All animals sleep");
    }
}

class Cat extends Animal {
    Cat(String nameClass) {
        super(nameClass);
    }
    void eat() {
        System.out.println(nameClass + " eats");
    }
    void sleep() {
        System.out.println(nameClass + " sleeps a lot");
    }
}

class Kitten1 extends Cat {
    Kitten1(String nameClass) {
        super(nameClass);
    }
    void eat() {
        System.out.println(nameClass + "eats milk");
    }
}
class Kitten2 extends Cat {
    Kitten2(String nameClass) {
        super(nameClass);
    }
    void eat() {
        System.out.println(nameClass + "eats milk");
    }
}
class Kitten3 extends Cat {
    Kitten3(String nameClass) {
        super(nameClass);
    }
    void eat() {
        System.out.println(nameClass + "eats milk");
    }
}

class MainAnimal {
    public static void main(String[] args) {

        Animal[] catKittens = {new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3")};
        for(Animal animals : catKittens) {
            animals.eat();
            animals.sleep();
        }
    }
}

