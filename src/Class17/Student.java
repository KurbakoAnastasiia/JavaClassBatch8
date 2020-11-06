package Class17;

public class Student {
    String name; // all instance variables
    int age;
    double marks;
    String collegeName;
   static int numberOfStudentsEnrolled = 0;

    public void printInfo() {
        System.out.println("Name " + name + " age " + age + " marks " + marks);
    }
    public void StudentsReqistered() {
        System.out.println("Total number of student up till " + numberOfStudentsEnrolled);
    }

}
