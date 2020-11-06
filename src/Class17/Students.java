package Class17;

public class Students {
    String studentName;
    int studentID;
    static int numberOfStudent = 0;

    void print() {
        System.out.println("Total number of students is " + numberOfStudent);
    }

    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();

        student1.studentName = "Anastasiia Kurbako";
        student2.studentName = "Elena Ivanova";
        student3.studentName = "Jack Smith";

        student1.studentID = 21723732;
        student2.studentID = 43264286;
        student3.studentID = 64284292;

        student1.numberOfStudent ++;
        student2.numberOfStudent ++;
        student3.numberOfStudent ++;

        student3.print();
    }
}
