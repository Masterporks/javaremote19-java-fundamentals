/**
 *Homework5
 *
 *
 * @author Joosep Korela
 *
 */

package home;

public class Homework5 {
    public static void main(String[] args) {
//Homework A : Print all odd numbers from array

        int[] a = {1, 7, 3, 10, 9};
        System.out.println("This is odd number");

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
        //Homework B Find the number of even and odd numbers from array
        int c = 0;

        for (int m = 0; m < a.length; m++) {
            if (a[m] % 2 == 0)
                c++;
        }
        System.out.println("Number of even numbers: " + c);
        System.out.println("Number of odd numbers : " + (a.length - c));


        //Homework C: Find duplicate values of an array of integer values
        int[] b = {1, 7, 3, 7, 10, 1, 9};
        for (int k = 0; k < b.length-1; k++) {
            for (int r = k + 1; r < b.length; r++) {
                if ((b[k]) == (b[r]) && (k != r)) {
                    System.out.println("Duplicate numbers : " + b[r]);
                }

            }
        }
    }
}



