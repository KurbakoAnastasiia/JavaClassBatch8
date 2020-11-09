package Class17;

public class StudentsMain {
    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();

        student1.studentName = "Anastasiia Kurbako";
        student1.studentID = "21723732";
        Students.numberOfStudent ++;
        System.out.println(student1.studentName);
        System.out.println(student1.studentID);
        System.out.println(Students.numberOfStudent);

        student2.studentName = "Elena Ivanova";
        student2.studentID = "43264286";
        Students.numberOfStudent ++;
        System.out.println(student2.studentName);
        System.out.println(student2.studentID);
        System.out.println(Students.numberOfStudent);

        student3.studentName = "Jack Smith";
        student3.studentID = "64284292";
        Students.numberOfStudent ++;

        System.out.println(student3.studentName);
        System.out.println(student3.studentID);
        System.out.println(Students.numberOfStudent);

        student2.print();
    }
}
