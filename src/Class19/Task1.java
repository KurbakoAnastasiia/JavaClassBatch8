package Class19;

public class Task1 {
    int age;
    int year;
    int month;
    int day;
    String name;
    char grade;

    Task1() {
        System.out.println("I will be called when no arguments are passed to the constructor");
    }

    Task1(int ageValue, String nameValue) {
        System.out.println("I will be called when 2 arguments are passed to the constructor");

        age = ageValue;
        name = nameValue;

    }

    Task1(int age, String name, char grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
        System.out.println("I will be called when 3 arguments are passed to the constructor");

    }

    Task1(int ageValue) {
        age = ageValue;
        System.out.println("I will be called when 1 arguments are passed to the constructor");
    }

    public void initFields(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1(30, "Jack", 'K');
        Task1 task2 = new Task1(30, "Jack");
        Task1 task3 = new Task1(30);
        Task1 task4 = new Task1();
        task4.initFields(60);
        System.out.println(task4.age);
    }
}
