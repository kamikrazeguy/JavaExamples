package Examples;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intList = {4,9,7,1,3,6,5};

        System.out.println(Arrays.toString(selectionSort(intList)));
    }

    private static int[] selectionSort(int[] intArray){

        int n = intArray.length;

        //One by one move of unsorted array
        for(int i = 0; i < n-1; i++) {
            //Find smallest element
            int smallestIndex = i;
            for(int j = i+1; j < n; j++) {
                if (intArray[j] < intArray[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            //SWAP ARRAY INDICES
            int temp = intArray[smallestIndex];
            intArray[smallestIndex] = intArray[i];
            intArray[i] = temp;
        }
        return intArray;
    }
}