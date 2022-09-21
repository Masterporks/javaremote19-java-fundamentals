/**
 * Examples of Arrays
 *
 * @author Joosep Korela
 */


public class Array {
    public static void main(String[] args) {


        int a = 9;
        //Single-dimensional array
        //Note: Array index always starts with 0
        //int array
        int[] b = {9, 27, 40, 20, 839, 11000};

        //String array
        String[] fruits = {"apple", "orange", "mango"}; // Indexes [0-apple, 1- orange, 2-mango]
    /*
    Boolean[];
    Float[];
    */

        System.out.println(fruits[0]);  //apple
        System.out.println(b[4]);
        // System.out.println(fruits[3]); //Array index out of bound
        System.out.println(b.length);  //return the number of values in the array
        System.out.println(b.length - 1); //returns array's last index

        //Defined array
        String[] veggies = new String[5]; //new object
        veggies[3] = "potato";
        veggies[4] = "carrot";

        System.out.println(veggies[1]);  //shows default value because [1] isn't defined but 3 and 4 are

        String[] food = new String[] {"cake", "porridge", "rice"};

        int[] ageArray = new int[3];

        //processing array
        //conventional for-loop
        for(int i = 0; i < fruits.length; i++){ // i = index of array
            System.out.println(fruits[i]);
        }

        //enhanced for-loop
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        //Find the largest/maximum value in array
        //Brute-force method

        int result = b[0]; // 9

        for(int x : b){
                if(x > result){
                    result = x;

                }
        }
        System.out.println(result);


        // Homework4
        // To find smallest element in the array(b)
        int result1 = b[1]; // 27

        for(int y : b){
            if(y < result1){
                result1 = y;

            }
        }
        System.out.println(result1);

    }

 }

