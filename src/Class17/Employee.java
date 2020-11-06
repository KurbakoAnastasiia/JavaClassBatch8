package Class17;

public class Employee {
    int empID;
    double salary;
   static String CEO = "Sumair";

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.empID = 129310921;
        emp1.salary = 90000;

        emp2.empID = 756383902;
        emp2.salary = 55500;

        System.out.println("Emplyee 1: ID " + emp1.empID + " salary " + emp1.salary + " CEO " + CEO);
        System.out.println("Emplyee 2: ID " + emp2.empID + " salary " + emp2.salary + " CEO " + CEO);
    }
}
