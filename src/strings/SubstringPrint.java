package strings;

import java.util.Scanner;

/**
 * To print substring of a string
 *
 * @author Joosep Korela
 */
public class SubstringPrint {
    public static void main(String[] args) {

        String s = "Estonia is a beautiful country!";
        System.out.println(s);

        System.out.println(s.substring(0,22));  //0 is first letter and 22 is last letter we want to print of sentence
        System.out.println(s.substring(23));  //nr 23 takes from 23 rd letter till the end

        System.out.println(s.substring(0,12) +" " + s.substring(23));

        System.out.println(s.substring(s.indexOf("beau")));
        System.out.println(s.startsWith("Estonia"));

    }
}
