package Class17;

public class MainHW {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.empID = 129310921;
        emp1.salary = 90000;
        Employee.CEO = "Sumair";

        emp2.empID = 756383902;
        emp2.salary = 55500;

        System.out.println("Emplyee 1: ID " + emp1.empID + " salary " + emp1.salary + " CEO " + Employee.CEO);
        System.out.println("Emplyee 2: ID " + emp2.empID + " salary " + emp2.salary + " CEO " + Employee.CEO);

        System.out.println(emp2.CEO);
    }


}
