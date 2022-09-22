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
    }
}
