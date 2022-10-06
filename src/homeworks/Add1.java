package homeworks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Sum given array
 *
 * @author Joosep Korela
 */
public class Add1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many array elements?");
        int arrLength = scanner.nextInt();


        System.out.println("Enter array elements one after an other");

        int[] arr = new int[arrLength];

        for(int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Input array is: " + Arrays.toString(arr));
        int sum = 0;
        for(int i = 0; i < arrLength; i++) {
        sum += arr[i];



        }
        System.out.println("Sum is: " +sum);

    }
}
