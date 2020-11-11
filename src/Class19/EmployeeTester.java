package Class19;

public class EmployeeTester {
    public static void main(String[] args) {
        Employees employees1 = new Employees();
        employees1.age = 200;
        employees1.grade = 'M';
        employees1.name = "Davit";
        System.out.println(employees1.age);
        System.out.println();
        Employees employees2 = new Employees(5, "Vlad", 'A');
        System.out.println(employees2.age);

        // Constructors
        // constructors name of the variables
        // = assignment
        // new - we want an object
        // Constructors ()

    }
}
