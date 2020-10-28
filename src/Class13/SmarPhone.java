package Class13;

public class SmarPhone {
    String brand;
    String make;
    String model;
    String color;
    int memory;


    void call(String phoneNumber) {
        System.out.println("Calling" + phoneNumber);
    }
    void text(String text) {
        System.out.println(brand + "can send the text: " + text);
    }
    void pics() {
        System.out.println(brand + "can take a picture");
    }

}
