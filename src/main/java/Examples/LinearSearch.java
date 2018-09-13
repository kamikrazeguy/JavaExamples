package Examples;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] intList = {4,9,7,1,3,6,5};

        System.out.println(linearSearch(intList, 3));
    }

    private static int linearSearch(int[] intArray, int numberToBeSearched) {
        int length = intArray.length;
        int numFoundAtIndex;

        for(int i = 0; i < length; i++) {
            if (intArray[i] == numberToBeSearched) {
                return numFoundAtIndex = i;
            }
        }

        return -1;
    }
}
