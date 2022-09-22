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

        String[] food = new String[]{"cake", "porridge", "rice"};

        int[] ageArray = new int[3];

        //processing array
        //conventional for-loop
        for (int i = 0; i < fruits.length; i++) { // i = index of array
            System.out.println(fruits[i]);
        }

        //enhanced for-loop
        for (String fruit : fruits) {  // String:String[]    int: int[]
            System.out.println(fruit);
        }

        //Find the largest/maximum value in array
        //Brute-force method

        int result = b[0]; // 9

        for (int x : b) {
            if (x > result) {
                result = x;

            }
        }
        System.out.println(result);


        // Homework4
        // To find smallest element in the array(b)
        int result1 = b[1]; // 27

        for (int y : b) {
            if (y < result1) {
                result1 = y;

            }
        }
        System.out.println(result1);


        //Multi-dimensional array
        // 2D array

        //Row - 1
        int[][] array2d = new int[3][3];
        array2d[0][0] = 1;
        array2d[0][1] = 0;
        array2d[0][2] = 1;

        //Row - 2
        array2d[1][0] = 2;
        array2d[1][1] = 10;
        array2d[1][2] = 9;

        //Row - 3
        array2d[2][0] = 4;
        array2d[2][1] = 9;
        array2d[2][2] = 8;

        //Can also write as a one row
        int[][] array2dVer2 = {{1, 0, 1}, {2, 10, 9}, {4, 9, 8}};

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(array2dVer2[x][y] + " ");
            }
            System.out.println();
        }

        //3D array 1D + 2D array
        //1D=> number of tables
        //2D array => array with rows and columns

        int[][][] array3d = new int[3][3][3];

        //TABLE-1
        //Row - 1
        array3d[0][0][0] = 1;
        array3d[0][0][1] = 0;
        array3d[0][0][2] = 1;

        int[][][] array3dVer2 = {
                {{1, 0, 1}, {1, 8, 0}, {2, 5, 7}},
                {{9, 8, 7}, {5, 8, 9}, {3, 5, 0}},
                {{5, 6, 2}, {4, 5, 7}, {2, 6, 8}}
        };

        for (int w = 0; w < 3; w++) {
            for (int z = 0; z < 3; z++) {
                for (int q = 0; q < 3; q++) {


                    System.out.print(array3dVer2[w][z][q] + "\t");  // \t prints space between numbers
                }
                System.out.println();


            }
            System.out.println("\n\n"); //  \n\n  prints space between each matrix
        }
    }
 }

