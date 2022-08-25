package main.java.Day2;

public class Task1_SearchNumberInSortedArray {
    /*
    Given a sorted array of n elements, write a function to find the index of a given element.
    if not found return -1.


    input: arr[] = {11, 23, 32, 52, 76, 81, 111, 135, 140, 170},
    and search element  = 111
    Output: 6
        search element = 110, Then output should be -1.
     */

    int findIndexOfElement(int[] arr, int value) {
        return indexOfElement(arr, value, 0, arr.length - 1);
    }

    int indexOfElement(int[] arr, int value, int low, int high) {

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (value < arr[middle]) {
                high = middle - 1;
            } else if (value > arr[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {11, 23, 32, 52, 76, 81, 111, 135, 140, 170};
        int input = 110;
        Task1_SearchNumberInSortedArray obj = new Task1_SearchNumberInSortedArray();
        int index = obj.findIndexOfElement(arr, input);

        System.out.println("Index of '"+ input + "' is : "+ index);
    }
}
