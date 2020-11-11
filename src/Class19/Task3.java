package Class19;

public class Task3 {
    /*
     * Write a program  that will have 4 different access levels of constructors
     * and create 3 objects of this class:
     * 1 - inside same class;
     * 2 - from outside the class;
     * 3 - from different class inside different package  and observe result.
     */

    String name;
    int age;
    public double salary;

    private Task3(String name) {
        this.name = name;
    }

    Task3(int age) {
        this.age = age;
    }

    public Task3(double salary) {
        this.salary = salary;
        // I can only create objects of my class from the same class
    }


    public static void main(String[] args) {
        Task3 sub1 = new Task3("Kate");
        System.out.println(sub1.name);
        System.out.println(sub1.age);
        System.out.println(sub1.salary);

        Task3 sub2 = new Task3(12);
        System.out.println(sub2.name);
        System.out.println(sub2.age);
        System.out.println(sub2.salary);

        Task3 sub3 = new Task3(80000.0);
        System.out.println(sub3.name);
        System.out.println(sub3.age);
        System.out.println(sub3.salary);
    }

}
