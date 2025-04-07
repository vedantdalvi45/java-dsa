package strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
            Set<Character> charSet = new HashSet<>();
            int left = 0;
            for (int i = 0; i < s.length(); i++) {
                if (charSet.contains(s.charAt(i))) {
                    while (charSet.contains(s.charAt(i))){
                        charSet.remove(s.charAt(left));
                        left++;
                    }
                    charSet.add(s.charAt(i));
                }else {
                    charSet.add(s.charAt(i));
                    if (charSet.size() > maxLength)
                        maxLength = charSet.size();
                }
            }
            return maxLength;

    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
