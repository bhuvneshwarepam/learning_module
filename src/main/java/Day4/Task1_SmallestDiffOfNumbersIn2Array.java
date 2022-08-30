package main.java.Day4;

import java.util.Arrays;

public class Task1_SmallestDiffOfNumbersIn2Array {

    /*
    Given two arrays of integers, compute the pair of values (one value in each array) with the smallest (non-negative) difference. Return the difference.
    Input : A[] = {l, 3, 15, 11, 2}
            B[] = {23, 127, 235, 19, 8}
    Output : 3
    the pair is: 11, 8
     */

    int[] pairWithMinDiff(int[] arr1, int[] arr2) {
        int[] pair = new int[2];
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minDiff = Integer.MAX_VALUE;
        int i=0,j=0;
        while (i < arr1.length && j < arr2.length) {
            if (Math.abs(arr1[i] - arr2[j]) < minDiff) {
                minDiff = Math.abs(arr1[i] - arr2[j]);
                pair[0] = arr1[i];
                pair[1] = arr2[j];
            }
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        int [] arr1 =new int[] {1, 3, 15, 11, 2};
        int [] arr2 =  new int[]{23, 127, 235, 19, 8};

        Task1_SmallestDiffOfNumbersIn2Array obj = new Task1_SmallestDiffOfNumbersIn2Array();
        int[] pair = obj.pairWithMinDiff(arr1, arr2);
        System.out.println("Pair with minimum diff is : " + pair[0] + ", " + pair[1]);
    }
}
