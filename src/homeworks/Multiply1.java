package homeworks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Multiply given array
 *
 * @author Joosep Korela
 */
public class Multiply1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many array elements?");
        int arrLength = scanner.nextInt();


        System.out.println("Enter array elements one after an other");

        float[] arr = new float[arrLength];

        for(int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Input array is: " + Arrays.toString(arr));
        float multiply = arr[0];
        for(int i = 1; i < arrLength; i++) {
            multiply = multiply * arr[i];



        }
        System.out.println("Multiply is: " +multiply);

    }
}
