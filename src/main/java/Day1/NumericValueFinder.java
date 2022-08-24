package main.java.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumericValueFinder {

    /*
    A List<String> contains alpha, numeric and alpha numeric values as strings. Write a program to create a List<Integer>s from the original List.
    input :  List <String> ls =  ["as", "123", "32", "2as"]
    output : List<Integer> iList = [123,32]
     */
    List<Integer> findNumericValues(List<String> values) {

        List<Integer> numValues = new ArrayList<>();
        if(values != null && values.size()>0) {
            for(String value: values) {
                if(isNumeric(value)) {
                    numValues.add(Integer.parseInt(value));
                }
            }
        }
        return numValues;
    }

    boolean isNumeric(String value) {
        return value.matches("-?\\d+(\\.\\d+)?");
    }

    public static void main(String[] args) {
        NumericValueFinder finder = new NumericValueFinder();
        List <String> values = Arrays.asList("as", "123", "32", "2as");
        System.out.println("Numeric values are : " + finder.findNumericValues(values));
    }
}
