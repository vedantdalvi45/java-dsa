package strings;

import java.util.Arrays;

public class ReversingString {
    static String reverseString(String strings){
        StringBuilder string = new StringBuilder(strings);

        int left = 0;
        int right = string.length()-1;

        while (left < right){
            char t = string.charAt(right);
            string.setCharAt(right,string.charAt(left));
            string.setCharAt(left,t);
            left ++;
            right --;
        }

        return String.valueOf(string);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
        System.out.println(Arrays.toString("Hello".split("")));
        System.out.println("hello".substring(1,3));
    }
}
