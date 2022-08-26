package main.java.Day3;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task3_CharacterOccurance {

    /*
    Find the no of occurrences for each character in a word.
    Input: organization
              output:
                             o -2
                             r -1
                             g -1
                             i- 2
                             and so on….
              See if the same logic can be applied to find the “no of occurrences for each word in a given sentence”.
     */

    Map<Character, Long> characterCount(String input) {

        Map<Character, Long> counts = input.toLowerCase().chars()
                .filter(ch -> !" ".equals(ch))
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        return counts;
    }

    public static void main(String[] args) {

        Task3_CharacterOccurance obj = new Task3_CharacterOccurance();
        String input = "The quick brown fox jumps right over the little lazy dog";
        Map<Character, Long> counts = obj.characterCount(input);
        System.out.println("Input string is : " + input);
        System.out.print("Character counts are : ");
        for( Map.Entry<Character, Long> count: counts.entrySet()) {
            System.out.println("Count for '" + count.getKey() + "' is : " + count.getValue());
        }
    }
}
