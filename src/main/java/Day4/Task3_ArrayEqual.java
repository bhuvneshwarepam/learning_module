package main.java.Day4;

import java.util.HashMap;
import java.util.Map;

public class Task3_ArrayEqual {

    /*
      I have to arrays
       int arr1[] = {21,6,8,9,10,5};
       int arr2[] = {10,21,5,8,6,9};
       write a program to check whether both arrays are equal or not.
     */

    boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Map<Integer, Integer> occuranceMap = new HashMap<>();
        for (int i=0; i<arr1.length; i++) {
            occuranceMap.put(arr1[i], occuranceMap.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i=0; i<arr2.length; i++) {
            occuranceMap.put(arr2[i], occuranceMap.getOrDefault(arr2[i], 0) - 1);
            if(occuranceMap.get(arr2[i]) == 0) {
                occuranceMap.remove(arr2[i]);
            }
        }
        return occuranceMap.size() == 0;
    }

    public static void main(String[] args) {
        int arr1[] = { 21, 6, 8, 9, 10, 5 };
        int arr2[] = { 10, 21, 5, 8, 6, 9 };

        Task3_ArrayEqual obj = new Task3_ArrayEqual();
        System.out.println("Both arrays are equals : " + obj.areArraysEqual(arr1, arr2));
    }
}
