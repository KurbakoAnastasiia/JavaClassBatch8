package Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);
        doubleArrayList.add(152.00);
        doubleArrayList.add(189.00);
        doubleArrayList.add(185.00);
        doubleArrayList.add(15.00);

        Iterator<Double> iterator = doubleArrayList.iterator();
        System.out.println("Before removal");
        System.out.println(doubleArrayList);

        while(iterator.hasNext()) {
            if(iterator.next() < 20) {
                iterator.remove();
            }
        }
        System.out.println("After removal");
        System.out.println(doubleArrayList);

        Iterator<Double> iterator1 = doubleArrayList.iterator();
        System.out.println(iterator1.next());

    }
}
