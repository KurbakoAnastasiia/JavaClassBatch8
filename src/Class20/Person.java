package Class20;

public class Person {
    String name;
    String address;
    int age;
    String id;
    String phone;
    String SSN;
    char gender;
    char martialStatus;
    double height;
    double weight;
    int numberOfKids;
    double salary;
    String education;

    Person(){
        System.out.println(" line 1");
    }
    Person(String name, int age, String phone, double salary) {
        this();
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
        System.out.println("I am the first constructor I only have 4 fields as mandatory");
    }

    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids) {
        this(name, age, phone, salary);
        this.martialStatus = martialStatus;
        this.numberOfKids = numberOfKids;
        System.out.println("I am the first constructor I only have 6 fields as mandatory");
    }

    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids, String education) {
        this(name, age, phone, salary, martialStatus, numberOfKids);
        this.education = education;
        System.out.println("I am the first constructor I only have 7 fields as mandatory");
    }

    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids, String education, double height, double weight) {
        this(name, age, phone, salary, martialStatus, numberOfKids, education);
        this.height = height;
        this.weight = weight;
        System.out.println("I am the first constructor I only have 9 fields as mandatory");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Kate", 30, "4728472942", 80000.0, 'M', 0, "SDET", 5.7, 100);
        Person person2 = new Person("John", 45, "4563728910", 99000, 'M', 3);
        System.out.println();
    }
}
