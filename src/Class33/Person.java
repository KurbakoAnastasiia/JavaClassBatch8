package Class33;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Person {
    /*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.*/

    private String name;
    private String lastName;
    private int age;
    private double salary;
    public Person() {}
    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void printInfo() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class TestClass {

    public static void main(String[] args) {

        Map<Integer, Person> users = new TreeMap<>();
        Person user1 = new Person("John", "Smith", 30, 55000);
        Person user2 = new Person("Kate", "Tenner", 34, 90000);
        users.put(356422819, new Person("Bob", "Danney", 28, 87000));
        users.put(657392058, new Person("Frank", "Slown", 45, 122000));
        users.put(575849202, user1);
        users.put(256182629,user2);

        Collection<Person> allusers = users.values();
        Iterator<Person> iterator = allusers.iterator();
        while(iterator.hasNext()) {
            Person user = iterator.next();
            user.printInfo();
        }

    }
}
