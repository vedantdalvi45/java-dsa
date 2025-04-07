package strings;

import java.util.*;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        while (right < s.length()) {
            if (map.containsKey(s.charAt(right))) {
                left = map.get(s.charAt(right)) + 1;
                map.put(s.charAt(right), right);
                System.out.print(s.charAt(right) + " ");
                System.out.println("R: " + s.substring(left+1, right + 1));
                right++;
            }else {
                maxLength = Math.max(maxLength, right - left + 1);
                map.put(s.charAt(right), right);

            }
            right++;


        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("cadbzabcda"));
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
    }
}
