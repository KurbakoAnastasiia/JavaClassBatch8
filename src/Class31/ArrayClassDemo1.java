package Class31;

import java.util.ArrayList;

public class ArrayClassDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.9);
        doubleArrayList.add(15.0);
        System.out.println("Before replacing");
        System.out.println(doubleArrayList);
        // replace the value at specified index
        doubleArrayList.set(1, 20.25);
        System.out.println("After replacing");
        System.out.println(doubleArrayList);
        System.out.println("After removal");
        doubleArrayList.remove(0);
        System.out.println(doubleArrayList);

        System.out.println("Printing from top to bottom");
        for(Double singleNum : doubleArrayList) {
            System.out.println(singleNum);
        }
        System.out.println("Looping in reverse order");
        for(int i = doubleArrayList.size() - 1; i >= 0; i--) {
            System.out.print(doubleArrayList.get(i) + ", ");
        }

    }
}
