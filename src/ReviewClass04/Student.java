package ReviewClass04;

public class Student {
    public static void main(String[] args) {

        School.schoolName = "Harvard University";

        School stu1 = new School();
        stu1.name = "John";
        stu1.lastName = "Terry";
        stu1.age = 12;

        School stu2 = new School();
        stu2.name = "James";
        stu2.lastName = "Miller";
        stu2.age = 9;
        System.out.println(stu1.name);
        System.out.println(stu2.name);
        System.out.println(stu1.schoolName);
        System.out.println(stu2.schoolName);

        stu1.printDetails();
        stu2.printDetails();

        stu1.study(4);
        School.goToSchool();
    }
}
