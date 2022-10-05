package strings;

import java.util.Scanner;

/**
 * Write a program to replace a string
 *
 * @author Joosep Korela
 */
public class ReplaceString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");

        String s = scanner.nextLine();
        boolean isMatching = false; //if its false then it enters to loop and starts checking the correct string.
        String source = null;

        while (!isMatching) {
            System.out.println("Which string to replace?");
            source = scanner.nextLine();

           /* // Check case -sensitive
            if (s.contains(source)) {
                isMatching = true;  //if the word is a match , it comes out the loop and takes the next print line
            } else {
                System.out.println("String not found! Enter again");
            }
*/

            //Check non-case sensitive
            String[] sArr = s.split(" ");
            for (String word : sArr) {
                if (word.equalsIgnoreCase(source)) {
                    isMatching = true;
                    break;

                }
                }

            if(!isMatching) {
                System.out.println("String not found! Enter again");
            }

                System.out.println("Enter the replacement string");
                String destination = scanner.nextLine();

                 String result = s.replace(source, destination);  // changes only one word in sentence
                //String result = s.replaceAll("\\d", destination);  //\d : numbers
                System.out.println(result);


            }
        }
    }
