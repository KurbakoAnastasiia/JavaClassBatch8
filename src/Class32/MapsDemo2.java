package Class32;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        Person jasoorObj = new Person("Jasoor", 111, 20);
        Person kinObj = new Person("Kin", 222, 22);
        Person qasimObj = new Person("Qasim", 333, 26);
        Person aigerhimObj = new Person("Aigerhim", 444, 16);
        Person burjuObj = new Person("Burju", 555, 50);

        Map<Integer, Person> peopleInUSA = new HashMap<>();
        peopleInUSA.put(777, new Person("Sabeen", 777, 20));
        peopleInUSA.put(111, jasoorObj);
        peopleInUSA.put(222, kinObj);
        peopleInUSA.put(333, qasimObj);
        peopleInUSA.put(444, aigerhimObj);
        peopleInUSA.put(555, burjuObj);

        System.out.println(peopleInUSA.get(555).name);
        System.out.println(peopleInUSA);
    }
}
