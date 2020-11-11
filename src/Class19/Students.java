package Class19;

public class Students {

    /*Write a java program of Class Students that takes students name
    and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.*/

    String name;
    double subject, subject2, subject3;

    Students(String nameValue, double subject1Value, double subject2Value, double subject3Value) {
        name = nameValue;
        subject = subject1Value;
        subject2 = subject2Value;
        subject3 = subject3Value;
    }
    void printGradeAverage() {
        double avg = (subject + subject2 + subject3)/3;
        System.out.println("Average marks for " + name + " " + avg);
    }


}
