package Class14;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1, name2, gender, babyName;
        System.out.println("Mom’s first name?");
        name1 = sc.nextLine();
        System.out.println("Dad’s first name?");
        name2 = sc.nextLine();
        System.out.println("Boy or Girl?");
        gender = sc.nextLine();

        if (gender.equalsIgnoreCase("Boy")) {
       name1 = name1.substring(name1.length() - 2);
       name2 = name2.substring(0, 3);
       babyName = name2.concat(name1);
            System.out.println(babyName);
        } else if (gender.equalsIgnoreCase("Girl")) {
            name1 = name1.substring(0, 2);
            name2 = name2.substring(name2.length() - 3);
            babyName = name1.concat(name2);
            System.out.println(babyName);
        } else {
            System.out.println("Enter valid information");
        }
    }
}
