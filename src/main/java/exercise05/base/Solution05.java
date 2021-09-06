package exercise05.base;

    /*
         UCF COP3330 Fall 2021 Assignment 1 Solution
         Copyright 2021 first_name last_name
     */

import java.util.Scanner;

public class Solution05 {

    /*
    print: What is the first number?
    'firstNum': reads string from user
    print: What is the second number?
    'secondNum': reads string from user

    convert firstNum and secondNum to integer

    create individual intergers to compute
    print: all the computations and strings
     */

    public static void main(String[] args) {

        System.out.println("What is the first number? ");
        Scanner input = new Scanner(System.in);
        String firstNum = input.nextLine();
        int fN = Integer.parseInt(firstNum);

        System.out.println("What is the second number? ");
        Scanner input2 = new Scanner(System.in);
        String secondNum = input2.nextLine();
        int sN = Integer.parseInt(secondNum);

        int addition = fN + sN;
        int subtraction = fN - sN;
        int multiplication = fN * sN;
        int division = fN / sN;

        System.out.println(firstNum + " + " + secondNum + " = " + addition + "\n"
                + firstNum + " - " + secondNum + " = " + subtraction + "\n"
                + firstNum + " * " + secondNum + " = " + multiplication + "\n"
                + firstNum + " / " + secondNum + " = " + division + "\n");
    }
}
