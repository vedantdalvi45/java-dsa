package strings;

public class LongestPalindromeDP {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {

        String input = "babad";
        System.out.println("Input string: " + input);

        for (int i = 0; i < input.length(); i++) {
            int lenOdd = expandAroundCenter(input, i, i);
            int lenEven = expandAroundCenter(input, i, i + 1);
            System.out.println("Center at index " + i + ": odd length palindrome = " + lenOdd + ", even length palindrome = " + lenEven);
        }

        String result = longestPalindrome(input);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}
