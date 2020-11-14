package Class23;

public class Computer {
    /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    ●Define common behavior within and some fields in parent class and override some of the methods in child classes
    ●Define some methods specific to child classes
    ●Create objects of child classes and store them into array.
    Loop through each object and execute available methods.*/

    void playMovies() {
        System.out.println("Can play movies");
    }
    void browseInternet() {
        System.out.println("Can browse the Internet");
    }
    void emailSending () { System.out.println("Can send emails"); }
    void storage() { System.out.println("Can store information"); }
    void playGames() {System.out.println("Can play computer games");}

}
class Apple extends Computer {
    void uploadApps() {
        System.out.println("Can iupload apps from AppStore");
    }
    void sync() {
        System.out.println("Can sync all Apple devices with each other");
    }

}

class Lenovo extends Computer {


}

class HP extends Computer {

}

class Dell extends Computer {

}

class TestComputer {

    public static void main(String[] args) {
        Computer[] make = new Computer[4];
        make[0] = new Apple();
        make[1] = new Lenovo();
        make[2] = new HP();
        make[3] = new Dell();

        for (Computer pr : make) {
            pr.browseInternet();
            pr.emailSending();
          pr.playGames();
          pr.playMovies();
          pr.storage();
        }
    }
}