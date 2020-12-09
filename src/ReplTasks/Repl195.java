package ReplTasks;

import java.util.Iterator;
import java.util.LinkedList;

public class Repl195 {
    /*Create Linked List that will store Integer Objects

Add the values below:
111
222
333
444
555
666

Create a logic to calculate sum of the all the values in list.
*/
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i * 111);
        }
        int sum = 0;
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            sum += it.next();
        }
        System.out.println("Result of sum is " + sum);
    }
}

