package Class33;

import java.util.ArrayList;

public class HW7 {
    /*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers*/
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(78);
        numbers.add(456);
        numbers.add(98);
        numbers.add(32);
        numbers.add(-24);
        numbers.add(7);
        numbers.add(809);
        numbers.add(-89);

        int sum = 0;
        for(Integer num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
