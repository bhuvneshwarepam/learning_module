package main.java.Day4;

import java.util.Stack;

public class Task2_BalancedBrackets {

    /*
     Check for the balanced Brackets in an expression
    Input: exp = “[()]{}{[()()]()}”
    Output: Balanced
    Input: exp = “[(])”
     Output: Not Balanced
     */

    boolean isBalancedBrackets(String input) {

        if(input == null || input.isEmpty() || input.length()%2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch: input.toCharArray()) {
            switch (ch) {
                case ']':
                    if (stack.pop().compareTo('[') != 0) {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.pop().compareTo('(') != 0) {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.pop().compareTo('{') != 0) {
                        return false;
                    }
                    break;
                default:
                    stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "[()]{}{[()()]()}";
//        input = "[(])";

        Task2_BalancedBrackets obj = new Task2_BalancedBrackets();
        System.out.println("'"+input+"' is balanced : " + obj.isBalancedBrackets(input));
    }
}
