package examples;

/**
 * examples.Statements examples
 *
 * @author Joosep Korela
 */


public class Statements {
    public static void main(String[] args) {
        int i = 8;
        int y = 10;

        String name = "Joosep";
        if (name == "Joosep" && name != "Katlin") {
            System.out.println("The name is correct");
        }

        if ((i > y && y > 0) || i == 100) {
            System.out.println("i is greater than y");

        }

        System.out.println("This is simple program");

        /* If (shirt size == M && shirt color == black) {
        //buy shirt
        {

        If (shirt size == M && shirt color == black) {
        // buy shirt
        } else {
        // buy the shirt from another shop
        }
         */
        if (i > y) {
            System.out.println("i is greater than y");
        } else {
            System.out.println("y is greater than i");
        }
        /*
        if (shirt size == M && shirt color == black) {
        // buy the shirt
        } else if(shirt size == M && shirt color == blue) {
        // buy the shirt
        } else {
        // buy the shirt from other shop
        }
         */

        if (i > y) {
            System.out.println("i is greater than y");


        } else if (i < 9) {
            System.out.println("i is lesser");
        } else {
            System.out.println("i is invalid");
        }

        /*SWITCH
        If we want to check one condition for multiple values.
         */
        int x = 5;
        int j = 6;
        int z= x + j; // 11

        switch(z) {
            case 10:
                System.out.println("The value of z is 10");
            case 11:
                System.out.println("The value of z is 11");
                break;
            case 12:
                System.out.println("The value of z is 12");
            default:
                System.out.println("Default block executed!");
        }

        String color = "Red";
        switch(color) {
            case "Red":
                System.out.println("I´am Red");
                break;
            case "White":
                System.out.println("I´m white");
                break;
        }

        int valueOnTheDice = 5;
        switch (valueOnTheDice) {
            case 1:
            case 3:
            case 5:
                System.out.println("Odd number of pips");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("Even number of pips");
                break;
            default:
                System.out.println("Error or the dice has landed on the edge!");
        }

        // WHILE ( Entry - check loop)

        int money = 0;

        while(money <= 5) {

            System.out.println("Doing job. Money = " + money);
            money++; //money = money + 1
        }

        // Do-WHILE ( Exit-check loop)
        do{
            System.out.println("money = " + money);
            money += 10;  // money = money + 10
        } while(money < 100);

        //FOR
        for (int g = 0; g <= 6; g++) {
            System.out.println("g value is: " + g);
        }



    }
}
