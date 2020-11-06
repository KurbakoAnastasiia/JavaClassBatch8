package Class16;

public class Student {
    /*Create  class Student that will have a method getGrade.
    Your method should accept the score of a student
    and return a grade:
    score > 90 - A
    score >80 - B
    score >70 - C
    score > 50 - D
    anything else - F (edited)*/

    public static char getGrade(int score) {

        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
           grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 50 && score < 70) {
           grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;

    }

    public static void main(String[] args) {
        Student task3 = new Student();
        System.out.println(" task3.getGrade(90) " + task3.getGrade(90));
        System.out.println(" task3.getGrade(101) " + task3.getGrade(101));
        System.out.println(" task3.getGrade(40) " + task3.getGrade(40));
        System.out.println(" task3.getGrade(70) " + task3.getGrade(70));
        System.out.println(" task3.getGrade(-1) " + task3.getGrade(-1));

    }

}
