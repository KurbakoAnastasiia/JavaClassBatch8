package ReplTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListScanner {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            numbers.add(num);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
