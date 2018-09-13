package Examples;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intList = {4,9,7,1,3,6,5};

        System.out.println(Arrays.toString(bubbleSort(intList)));
    }

    private static int[] bubbleSort(int[] intArray){

        int n = intArray.length;

        //Grab first index and 2nd index, compare if 1st is larger than 2nd, swap
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < (n - i - 1); j++) {
                if (intArray[j] > intArray[j+1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
        return intArray;
    }
}
