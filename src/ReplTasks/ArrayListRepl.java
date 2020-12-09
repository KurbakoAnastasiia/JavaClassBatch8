package ReplTasks;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRepl {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.isEmpty());
        arrayList.add("Syntax");
        System.out.println(arrayList.isEmpty());

        ArrayList<String> list = new ArrayList<>();

        list.add("hi");
        list.add("yo");
        list.add("sup");
        list.add("yolo");
        list.add("boop");

        list.remove("hi");
        list.remove("sup");
        list.remove("boop");
        Iterator <String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        }

    }

