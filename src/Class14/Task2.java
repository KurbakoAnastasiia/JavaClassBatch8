package Class14;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String momsName, dadsName, gender, babyName, firstPart, secondPart;
        System.out.println("Mom’s first name?");
        momsName = sc.nextLine();
        System.out.println("Dad’s first name?");
        dadsName = sc.nextLine();
        System.out.println("Boy or Girl?");
        gender = sc.nextLine();

        if (gender.equalsIgnoreCase("Boy")) {
       momsName = momsName.substring(momsName.length() - 2);
       dadsName = dadsName.substring(0, 3);
       babyName = dadsName.concat(momsName);
            System.out.println(babyName);
        } else if (gender.equalsIgnoreCase("Girl")) {
            momsName = momsName.substring(0, 2);
            dadsName = dadsName.substring(dadsName.length() - 3);
            babyName = momsName.concat(dadsName);
            System.out.println(babyName);
        } else {
            System.out.println("Enter valid information");
        }
        System.out.println("------------ANOTHER WAY-----------------------");
        if (gender.toLowerCase().startsWith("b")) {
            firstPart = dadsName.substring(0, dadsName.length() / 2);
           secondPart = momsName.substring(momsName.length() / 2);
            babyName = firstPart.concat(secondPart);
        } else if (gender.toLowerCase().startsWith("g")) {
            firstPart = momsName.substring(0, momsName.length() / 2);
            secondPart = dadsName.substring(dadsName.length() / 2);
            babyName = firstPart.concat(secondPart);
        } else {
            babyName = "No suggestion";

        }
        System.out.println(babyName);
    }
}
