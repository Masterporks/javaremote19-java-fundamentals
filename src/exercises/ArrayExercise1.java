package exercises;

/**
 * Find numbers which sum is = 4
 *
 * @author Joosep Korela
 *
 */
public class ArrayExercise1 {
    public static void main(String[] args) {
        int[] b = {1, 2, 7, 3, 10, 2, 9};
        for (int i = 0; i < b.length - 1; i++) {

            for (int j = i + 1; j < b.length; j++) {
                if (b[i] + b[j] == 4){
                    System.out.println("Sum is equal for numbers : "+ b[i] + "+" + b[j] + "=" + 4 );
                }
            }
        }
    }
}