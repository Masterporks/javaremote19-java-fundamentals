package home;

public class SecondLargestElementCalculator {

    public String ElementCalculator(int[] array) {

        String result =""+ array[array.length -1];
        int temp, size;
        size = array.length;

        for(int i = 0; i < size; i++ ){
            for(int j = i+1; j < size; j++){

                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;


                }
            }
        }return result;

    }
}




