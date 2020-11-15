package Class24;

public class DogTester {
    public static void main(String[] args) {
        // all 4 methiods can be accessed from Dog because
        // type of box and type of object are same    no extra cost
        Dog dog = new Dog();
        dog.appearance();
        dog.bark();
        dog.eat();
        dog.sleep();
        // type of box and type of object are not the same so we must
        // pay some price if we are trying to store a parent in a child
        // we will get an error o if we try to store a child in a parent
        // we will not be able to access all of the additional methods from
        // our child class this is the cost
        dog = new Chow();
        dog.appearance();
        /*dog = new Dog();*/ // if we uncomment this we will get an error
        //if we try this Chow chow = (Chow) dog;
        dog.sleep();
        /*
        we can extract the contents of box/variable/container and
        we store these contens in the new box but we must follow
        all of the above rules
         */

        Chow chow = (Chow) dog;
        chow.special();
        chow.hunt();
    }
}
