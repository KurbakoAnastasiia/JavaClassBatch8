package ReplTasks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class isPrime {
    /*Create an Linked List that will store all prime numbers from 1 to 100

Step 1. Create a method that will identify wether number is prime or not
Step 2. Add all prime numbers into Linked List*/


    public static boolean isPrime(int num) {

        boolean isItPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isItPrime = false;
                    break;
                }
        }
        return isItPrime;
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 2; i <= 100; i++) {
            if(isPrime(i)) {
                list.add(i);
            }
        }

        System.out.println(list);

    }
}
