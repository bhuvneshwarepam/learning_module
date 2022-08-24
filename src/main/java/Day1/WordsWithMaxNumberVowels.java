package main.java.Day1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsWithMaxNumberVowels {

    /*
    Given a string, find the words with the maximum number of vowels.
    Input: "The quick brown fox jumps right over the little lazy dog."
    Maximum Number of Vowels: 2
    output:	quick, over, little
     */

    List<String> maxNumberVowelsWords(String input) {
        int maxVowels = 0;
        Map<String, Integer> wordVowelsCount = new HashMap<>();
        String[] words = input.split(" ");

        int count = 0;
        for(String word: words) {
            count = numberOfVowelsInWord(word);
            wordVowelsCount.put(word, count);
            maxVowels = maxVowels < count ? count : maxVowels;
        }

        return wordsWithMaxNoVowels(wordVowelsCount, maxVowels);
    }

    int numberOfVowelsInWord(String word) {
        return countVowelsInWord(word, word.length());
    }

    int countVowelsInWord(String word, int length) {
        if (length == 1)
            return isVowel(word.charAt(length - 1));
        return countVowelsInWord(word, length - 1) + isVowel(word.charAt(length - 1));
    }

    int isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return 1;
        else
            return 0;
    }

    List<String> wordsWithMaxNoVowels(Map<String, Integer> wordVowelsCount, int maxVowels) {
        List<String> words = wordVowelsCount.entrySet().stream()
                .filter(entry -> entry.getValue() == maxVowels)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return words;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps right over the little lazy dog.";
        WordsWithMaxNumberVowels maxNoVowelsWordObj = new WordsWithMaxNumberVowels();
        List<String> words = maxNoVowelsWordObj.maxNumberVowelsWords(input);
        System.out.println(words);
    }
}
