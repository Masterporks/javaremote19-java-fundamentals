package exercises;

/**
 * Examples for Java operators
 *
 * @author Joosep Korela
 */

public class StatementExercises {
    public static void main(String[] args) {

        int i;

        // Odd or even
        // solution 1 - using if-else

        for (i = 0; i <= 20; i++) {
            if (1 % 2 == 0) {
                System.out.println(i + "is even number");
            } else {
                System.out.println(i + " is odd number");
            }

        }
        // soultion 2 = using ternary operator
        for (i = 0; i <= 20; i++) {
            System.out.println(i + " is" + (i % 2 == 0 ? "even" : "odd") + " number"); // i is even/odd number
        }

        //Leap year
        int year = 2022;

        // Solution 1
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year ");
        } else {
            System.out.println(year + " is not a leap year ");
        }

        //solution 2
        System.out.println(year + " is" + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? " " : " not ") + "a leap year");


        // solution 3- simple!
        if (year % 4 == 0) {
            System.out.println("This is leap year");
        } else {
            System.out.println("not leap year");
        }
//FIZZBUZZ
        //solution 1

        int j = 15;

        if (j % 3 == 0 && j % 5 == 0) {
            System.out.println("FIZZBUZZ");

        } else if (j % 3 == 0) {
            System.out.println("FIZZ");

        } else if (j % 5 == 0) {
            System.out.println("BUZZ");


        }

        //solution 2
        //Homework: one line solution for FIZZBUZZ


        System.out.println((j % 3 == 0 && j % 5 == 0 ? "FizzBuzz" : j % 3 == 0 ? "Fizz" : j % 5 == 0 ? "Buzz" : j + ""));

        // If
        //Write a java program to find if the person is adult. (minimum adult age is 18)

        int myAge = 21;
        if (myAge >= 18) {
            System.out.println("The person is an adult");
        }


        // if- else
        //Write a Java program to print if the given is odd or even(use when there are two conditions

        int number = 2020;

        if (2020 % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
        //if, else-if, else  (use when there are two or more conditions)
        //Write a Java program to print if string is empty, if the length is greater than 20 and if the string is null

        String test = "";
        if (test == "") {
            System.out.println("The given string is empty");

        } else if (test.length() > 20) {
            System.out.println("The given String is so long");
        } else if (test.length() < 20) {
            System.out.println("The given String is so long");
        } else if (test == null) {
            System.out.println("The string cannot be null");
        }

        //switch
        // Write a Java program to match the given alphabet
        char test2 = 'A';
        switch (test2) {
            case 'A':
                System.out.println("The given alphabet is A");
                break;
            case 'B':
                System.out.println("The given alphabet is B");
                break;
            case 'K':
                System.out.println("The given alphabet is K");
                break;
            default:
                System.out.println("The given alphabet is not found");


        }
        //Write a Java program to print the odd numbers from 1 to 50

        for (int s = 1; s <= 50; s++) {
            if (s % 2 != 0) {
                System.out.println(s + " is odd number");

            }
        }
    }
}