package ReplTasks;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRepl {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 50; i <= 100; i++) {
            numbers.add(i);
        }
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            if(iterator.next() % 3 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
