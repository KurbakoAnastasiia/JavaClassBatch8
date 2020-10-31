package Class15;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {


        System.out.println("---------------TASK 1-------------------");
        // Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        String sentence = "I love Java!";
        System.out.println(sentence.replaceAll("\\s+", ""));


        System.out.println("---------------TASK 2-------------------");
        // Create a String that should be combination of letters,
        // numbers and special characters. Find out how many alpha characters are there in the String

        String str = "chfdseGYCVn  1223087***7&$%^#% lkHRTBJokos";

        System.out.println(str.replaceAll("[^0-9]", "").length());
        System.out.println(str.replaceAll("[^0-9]", ""));
        System.out.println("------------------TASK 3--------------------");
        // You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String

        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] array = a.split("[^A-Z a-z 0-9]");

        for (String sentense : array) {
            System.out.println(sentense);

        }
        System.out.println(array.length);

        System.out.println(a.replaceAll("[\\sA-Za-z0-9]", ""));
        System.out.println(a.replaceAll("[\\sA-Za-z0-9]", "").length());

    }
}
