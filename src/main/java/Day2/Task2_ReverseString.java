package main.java.Day2;

public class Task2_ReverseString {
    /*
    Reversal program with special characters.
    Input: Swa$pn&il
    Output : lin$pa&wS
     */

    String reverseStringWithoutSpecialCars(String input) {

        char[] inputChArray = input.toCharArray();
        int left = 0, right = inputChArray.length - 1;

        while (left < right) {
            if (!Character.isAlphabetic(inputChArray[left]))
                left++;
            else if (!Character.isAlphabetic(inputChArray[right]))
                right--;
            else {
                char temp = inputChArray[left];
                inputChArray[left++] = inputChArray[right];
                inputChArray[right--] = temp;
            }
        }
        return new String(inputChArray);
    }

    public static void main(String[] args) {

        String input = "Swa$pn&il";
        Task2_ReverseString obj = new Task2_ReverseString();
        String output = obj.reverseStringWithoutSpecialCars(input);
        System.out.println("Reversed String for '"+input+"'  is  :  '"+output+"'");
    }
}
