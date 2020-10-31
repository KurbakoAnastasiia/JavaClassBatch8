package Class14;

import java.util.Scanner;

public class Task2AnotherWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String momsName, dadsName, gender, babyName, firstPart, secondPart;
        System.out.println("Mom’s first name?");
        momsName = sc.nextLine();
        System.out.println("Dad’s first name?");
        dadsName = sc.nextLine();
        System.out.println("Boy or Girl?");
        gender = sc.nextLine();
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
