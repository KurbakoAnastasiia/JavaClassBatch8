package ReplTasks;

import java.util.LinkedList;


public class Repl192 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int a = 0, b = 1, c;

        for (int i = 0; i < 10; i++) {
            list.add(a);
            c = a + b;
            a = b;
            b = c;


        }
        for (Integer numbers:
             list) {
            System.out.print(numbers + " ");
        }
    }
}
