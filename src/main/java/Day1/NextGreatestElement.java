package main.java.Day1;

public class NextGreatestElement {
    /*
    Find the next greatest element for each element in the Array
    Input Array is: {15, 10, 16, 20, 8, 9, 7, 50}
    Output is:
    15 -16
    10 -16
    16-20
    20-50
    8-9
    9-50
    7-50
    50 -1

    (OR)

    50 -> -1
    7 -> 50
    9 -> 50
    8 -> 9
    20 -> 50
    16 -> 20
    10 -> 16
    15 -> 16
     */
    void nextGreatestElements(int[] input) {
        if (input == null) {
            return;
        }

        for (int i = 0; i < input.length; i++) {
            printNextGreatestElement(input, i);
        }
    }

    void printNextGreatestElement(int[] input, int index) {
        int next = -1;

        for (int j = index + 1; j < input.length; j++) {
            if (input[j] > input[index]) {
                next = input[j];
                break;
            }
        }
        System.out.println(input[index]+" -> "+next);
    }

    public static void main(String[] args) {
        int[] input = {15, 10, 16, 20, 8, 9, 7, 50};
        NextGreatestElement ngeObj = new NextGreatestElement();
        ngeObj.nextGreatestElements(input);
    }

    /*
    Output :
    15 -> 16
    10 -> 16
    16 -> 20
    20 -> 50
    8 -> 9
    9 -> 50
    7 -> 50
    50 -> -1
     */
}

