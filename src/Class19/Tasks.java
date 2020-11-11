package Class19;

import Class16.Task1;
import Class17.Students;
import ReviewClass04.Test;

public class Tasks {
    /*Write a program that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.*/
    int sum;
    Tasks(int i, int j) {
        sum = i + j;
        System.out.println("The sum = " + sum);
    }
    Tasks() {
        System.out.println("I dont know what is the sum");
    }



    }

