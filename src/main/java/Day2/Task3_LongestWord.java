package main.java.Day2;

public class Task3_LongestWord {
    /*
     Find the longest word in a sentence?.
            Input: I am interested to grow in my organization
            output: organization
     */

    String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for(String word: words) {
            if(longestWord.length()<word.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String input = "I am interested to grow in my organization";
        Task3_LongestWord obj = new Task3_LongestWord();
        String word = obj.findLongestWord(input);
        System.out.println("Longest word in sentence '"+input+"'  is  :  '"+word+"'.");
    }
}
