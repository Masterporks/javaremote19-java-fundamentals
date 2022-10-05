package basics;

import java.util.Scanner;

/**
 * To read two numbers from the user and print the result
 *
 * @author Joosep Korela
 */
public class InputSum {
    public static void main(String[] args) {
        // To get input
        System.out.println("Enter two numbers to Sum");

        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = numbers.nextInt();

        System.out.println("Enter second number");
        int number2 = numbers.nextInt();

        System.out.println("Sum of numbers is : " + (number1 + number2));



    }
}
