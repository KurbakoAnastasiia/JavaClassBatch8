package Class24;

class Person {
    String name, lastName;
    int age;

    Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
class Employee extends Person {
    int salary;
    Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }

    Employee(String name, String lastName, int age){
        super(name, lastName, age);
    }
    void print() {
        System.out.print(super.name + " " + super.lastName + " " + super.age + " " + this.salary);
        System.out.println();
    }
}

class Student extends Employee {
    int grade;
    Student(String name, String lastName, int age, int grade) {
        super(name, lastName, age);
        this.grade = grade;
    }
    Student(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    void print() {
        System.out.print(super.name + " " + super.lastName + " " + super.age + " " + this.grade);
        System.out.println();
    }
}
class Retiree extends Student {
    String seniorActivity;

    Retiree(String name, String lastName, int age, String seniorActivity) {
        super(name, lastName, age);
        this.seniorActivity = seniorActivity;
    }
    void print() {
        System.out.print(super.name + " " + super.lastName + " " + super.age + " " + this.seniorActivity);
        System.out.println();
    }
}