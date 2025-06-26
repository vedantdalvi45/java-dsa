package stack;

import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
            System.out.println(i +" "+s.charAt(i)+" "+stack+"Maxx : "+maxLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "(()))())(";
        System.out.println("Input: " + s);
        int result = longestValidParentheses(s);
        System.out.println("Longest valid parentheses length: " + result);
    }
}
