package Class16;

import java.sql.SQLOutput;

public class Task4 {
    // Create a method that will say Hello in different language based on the country that will passed when method is executed.

    static void sayHello(String countryName) {
        switch (countryName) {
            case "USA":
                System.out.println("Hello");
                break;
            case "Russia":
                System.out.println("Privet");
                break;
            case "Germany":
                System.out.println("Guten Tag");
                break;
            case "Spain":
                System.out.println("Buenas Dias");
                break;
            case "Italian":
                System.out.println("Buon giorno");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "China":
                System.out.println("Ni hao");
                break;
            case "Turkey":
                System.out.println("Merhaba");
                break;
            default:
                System.out.println("I dont know");
        }


    }
}


