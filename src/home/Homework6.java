package home;

public class Homework6 {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 10, 9};

        SecondLargestElementCalculator arrayElementCalculator = new SecondLargestElementCalculator();
        String result = arrayElementCalculator.ElementCalculator(array);
        System.out.println(result);

    }
}