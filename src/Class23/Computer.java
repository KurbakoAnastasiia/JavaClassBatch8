package Class23;

class SmartMachine {
    public void smart() {
        System.out.println("I am a smart machine");
    }
}

public class Computer extends SmartMachine {
    /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    ●Define common behavior within and some fields in parent class and override some of the methods in child classes
    ●Define some methods specific to child classes
    ●Create objects of child classes and store them into array.
    Loop through each object and execute available methods.*/

    String brand;

    Computer(String brand) {
        this.brand = brand; // using this to differentiate between local and instance variable
    }

    public void run() {
        System.out.println(brand + " can run");
    }
    public void storage() {
        System.out.println(brand = " can store data");
    }

    public void transfer() {
        System.out.println(brand = " can transfer data");
    }

   /* void playMovies() {
        System.out.println("Can play movies");
    }
    void browseInternet() {
        System.out.println("Can browse the Internet");
    }
    void emailSending () { System.out.println("Can send emails"); }
    void playGames() {System.out.println("Can play computer games");}*/

}
class Apple extends Computer {

    Apple(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Runs faster");
    }

    @Override
    public void storage() {
        System.out.println("Saves the data in a different way");
    }

    @Override
    public void transfer() {
        super.transfer();
    }

    void uploadApps() {
        System.out.println("Can iupload apps from AppStore");
    }
    void sync() {
        System.out.println("Can sync all Apple devices with each other");
    }
}

class Lenovo extends Computer {

    Lenovo(String brand) {
        super(brand);
    }
    void tableMode() {
        System.out.println(brand + " Can also be used as a tablet");
    }
}

class HP extends Computer {

    HP(String brand) {
        super(brand);
    }
    public void secure() {
        System.out.println(brand + " can be unlocked with fingerprints");
    }
}

/*class Dell extends Computer {

    Dell(String brand) {
        super(brand);
    }
}*/

class TestComputer {

    public static void main(String[] args) {

        Computer[] allComputersInSingleVar = {new Apple("Apple"), new Lenovo("Lenovo"), new HP("Brand")};

        for (Computer computer: allComputersInSingleVar) {
            computer.run();
            computer.transfer();
            computer.storage();

        }
        Apple apple = new Apple("Apple");
        apple.sync();

        Lenovo lenovo = new Lenovo("Lenovo");
        lenovo.tableMode();
    }
}