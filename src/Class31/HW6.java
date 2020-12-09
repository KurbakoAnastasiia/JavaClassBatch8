package Class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student {
    String name;
    int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }
}
public class HW6 {
    /*Create a Set collection that will hold Objects of Student Type.
    In this set we do not care about the insertion order.
    Each student object should have name and studentID.
    Display name of each student.*/
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        Student st1 = new Student("John", 46231396);
        Student st2 = new Student("Kate", 56372584);
        Student st3 = new Student("Bob", 564738294);
        Student st4 = new Student("Herni", 63472929);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().name);
        }
    }
}
