package homeworks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * To read a number from user and print the same number like this:
 * Given number 4, then print
 * 4,44,444,4444...
 *
 * @author Joosep Korela
 */
public class IntegerDisplay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("How many times to run: ");
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];

        for (int i = 1; i <= arrLength; i++) {  //To print number of times /lines
            for (int j = 0; j <= i; j++) {  //To print the number of digits
                System.out.print(n);
            }
            System.out.print(", ");

        }
    }
}