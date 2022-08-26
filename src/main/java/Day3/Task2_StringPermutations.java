package main.java.Day3;

import java.util.ArrayList;
import java.util.List;

public class Task2_StringPermutations {

    /*
    Permutations from a string.
    Input is: ABC
    Output is:
              ABC ACB
              BAC BCA
              CBA CAB
     */

    List<String> permutationStrings(String input) {
        List<String> list = new ArrayList<>();
        findStringPermutations(list, input, "");
        return list;
    }
    void findStringPermutations(List<String> list, String input, String prefix) {
        int n = input.length();
        if (n == 0) {
            list.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                String subString= input.substring(i + 1, n) + input.substring(0, i);
                findStringPermutations(list, subString, prefix + input.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Task2_StringPermutations obj = new Task2_StringPermutations();
        String input = "ABC";
        System.out.println("Input String is : " + input);
        List<String> output = obj.permutationStrings("ABC");
        System.out.println("Permutation Strings are : " + output);
    }

}
