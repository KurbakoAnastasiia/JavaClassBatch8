package Class32;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        Person jasoorObj = new Person("Jasoor", 111, 20);
        Person kinObj = new Person("Kin", 222, 22);
        Person qasimObj = new Person("Qasim", 333, 26);
        Person aigerhimObj = new Person("Aigerhim", 444, 16);
        Person burjuObj = new Person("Burju", 555, 50);

        Map<Integer, Person> peopleInUSA = new HashMap<>();
        Map<Integer, Person> peopleInPAK = new HashMap<>();
        peopleInPAK.put(777, new Person("Sabeen", 777, 20));
        peopleInPAK.put(888, new Person("Asghar", 888, 25));

        peopleInUSA.put(111, jasoorObj);
        peopleInUSA.put(222, kinObj);
        peopleInUSA.put(333, qasimObj);
        peopleInUSA.put(444, aigerhimObj);
        peopleInUSA.put(555, burjuObj);

       Map<Integer, Person> peopleInWorld = new HashMap<>();
       peopleInWorld.putAll(peopleInUSA);
       peopleInWorld.putAll(peopleInPAK);

        System.out.println(peopleInWorld);
    }
}