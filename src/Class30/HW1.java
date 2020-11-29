package Class30;

import java.util.ArrayList;
import java.util.Iterator;

public class HW1 {
    /*Create an arraylist of cars and retrieve all the values using 3 different ways.*/

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Jeep");

        System.out.println("----------------1st way---------------");
        for (String car:
             cars) {
            System.out.println(car);
        }

        System.out.println("----------------2nd way-----------------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println("-----------------3rd way-----------------");

        Iterator<String> iterator = cars.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
