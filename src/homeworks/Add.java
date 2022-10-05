package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many array elements?");
        int arrLength = scanner.nextInt();


        System.out.println("Enter array elements one after an other");

        int[] arr = new int[arrLength];
        int[] add = new int[arrLength];
        for(int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Input array is: " + Arrays.toString(arr));

        for(int i = arrLength; i >= 0; i++) {



        }
        System.out.println("Add is: " + Arrays.toString(add));

    }
}
