package Examples;

public class BinarySearch {
    public static void main(String[] args) {
        int[] intList = {1,3,5,6,7,9};

        int result = binarySearch(intList, 0, intList.length-1, 6);
        if(result == -1) {
            System.out.println("Number not found!");
        } else System.out.println("Number found at index: "+ result);
    }

    private static int binarySearch(int[] intArray, int startingIndex, int endingIndex, int numberToBeSearched) {
        int arrayLength = intArray.length;
        int index = -1;

        //IF INDEX IS MORE THAN 0
        if (startingIndex > endingIndex) {
            return -1;
        }

        int mid = (startingIndex+endingIndex)/2;

        if (intArray[mid] == numberToBeSearched) {
            index= mid;
        } else if (intArray[mid] < numberToBeSearched) {
            index = binarySearch(intArray, mid + 1, endingIndex, numberToBeSearched);
        } else if (intArray[mid] > numberToBeSearched){
            index = binarySearch(intArray, startingIndex, mid - 1, numberToBeSearched);
        }

        return index;
    }
}
