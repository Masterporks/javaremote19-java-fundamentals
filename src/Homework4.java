

/** Homework nr 4
 *
 * @author Joosep Korela
 */


public class Homework4 {
    public static void main(String[] args) {


        // Homework4
        // To find smallest element in the array(b)
        int[] b = {9, 27, 40, 20, 839, 11000};

        int result1 = b[1]; // 27

        for (int y : b) {
            if (y < result1) {
                result1 = y;

            }
        }
        System.out.println(result1);
//Homework5
        int[] numbers = {1, 7, 3, 10, 9};
        float sum = 0;
        for(int number : numbers)
            sum += number;
        float average = sum / numbers.length;

            System.out.println(average);


          int[] order = {1, 7, 3 ,10, 9};


    }



}




