package arrays;

/**
 * Write a program that does the following(the code should be written in seperate methods)
 * Generated an array with elements random 0 and 99 (see Random class in Java)
 * Display the generated array
 * Display only the odd numbers
 * Display only even numbers
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomEven {
    public static void main(String[] args) {
        // final - variable cannot be changed
        final int min = 0;
        final int max = 99;
        final int arrayLimit = 10;
        int[] array = new int[arrayLimit];

        //Task 1
        for (int i = 0; i < arrayLimit; i++) {
            array[i] = getRandomNumber(min, max);

        }
        System.out.println("Random Array");
        displayArray(array);
        displayOddArray(array);
        displayEvenArray(array);
    }


    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    private static void displayArray(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));
    }

    private static void displayOddArray(int[] inputArray) {
        List<Integer> oddArrayList = new ArrayList<>();
        for (int number : inputArray) {
            if (number % 2 != 0) {
                oddArrayList.add(number);
            }
        }
        System.out.println("Odd number of array: ");

        displayArray(convertListToArray(oddArrayList));
    }

    private static int[] convertListToArray(List<Integer> intList) {
        int[] result = new int[intList.size()];

        for (int i = 0; i < intList.size(); i++) {
            result[i] = intList.get(i);

        }
        return result;
    }

    private static void displayEvenArray(int[] inputArray) {
        List<Integer> evenArrayList = new ArrayList<>();
        for (int number : inputArray) {
            if (number % 2 == 0) {
                evenArrayList.add(number);
            }
        }
        System.out.println("Even number of array: ");

        displayArray(convertListToArray(evenArrayList));
    }
}