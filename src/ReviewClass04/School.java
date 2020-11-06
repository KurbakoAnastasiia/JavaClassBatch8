package ReviewClass04;

public class School {
    String name, lastName;
    int age;
    static String schoolName;

    public void printDetails() {
        System.out.println("Name and Lastname " + name + " " + lastName);
        System.out.println("Age: " + age);
    }
    public void study(int hour) {
        System.out.println(name + " " + lastName + " studies " + hour + " hours per day");
    }

    public static void goToSchool () {
        System.out.println("Students go to " + schoolName);
    }

}
