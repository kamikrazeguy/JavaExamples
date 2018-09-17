package Examples;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] intList = {9,5,3,1,8,7,2,4,6,10};

        split(intList);

        System.out.println(Arrays.toString(intList));
    }

    private static void split(int[] intArray){

        int n = intArray.length;
        int halfSize = n/2;
        int[] leftArray;
        int[] rightArray;
        boolean oddArray = false;

        //CHECK IF LENGTH IS EVEN OR NOT, IF NOT ASSIGN LEFT ONE LESS WHILE RIGHT ONE MORE INDEX
        if(intArray.length < 2) {
            return;
        }
        if (intArray.length % 2 == 0) {
            leftArray = new int[halfSize];
            rightArray = new int[halfSize];
        } else {
            leftArray = new int[halfSize];
            rightArray = new int[halfSize + 1];
            oddArray = true;
        }

        //SPLIT ARRAY INTO LEFT AND RIGHT ARRAYS
        for (int i = 0; i < halfSize; i++) {
            leftArray[i] = intArray[i];
            rightArray[i] = intArray[halfSize + i];
        }
        if(oddArray) {
            rightArray[halfSize] = intArray[n-1];
        }
//        System.out.println("Left: " + Arrays.toString(leftArray));
//        System.out.println("Right: " + Arrays.toString(rightArray));

        split(leftArray);
        split(rightArray);

        mergeSort(intArray, leftArray, rightArray);
    }

    //merge the split array after sorting it
    private static void mergeSort(int[] array, int[] leftArray, int[] rightArray){

        //Indices
        int i = 0;
        int j = 0;
        int arrayIndex = 0;

        while(i < leftArray.length && j < rightArray.length){
            if(leftArray[i] < rightArray[j]){
                array[arrayIndex] = leftArray[i];
                i++;
            } else {
                array[arrayIndex] = rightArray[j];
                j++;
            }
            arrayIndex++;
        }

        // add every leftover element from the subarray
        while (i < leftArray.length) {
            array[arrayIndex] = leftArray[i];
            i++;
            arrayIndex++;
        }

        // only one of these two while loops will be executed
        while (j < rightArray.length) {
            array[arrayIndex] = rightArray[j];
            j++;
            arrayIndex++;
        }

//        System.out.println("sorted: "+Arrays.toString(array));
    }
}
