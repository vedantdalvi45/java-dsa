package strings;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        String string = s.substring(0,1);
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                StringBuilder string1 = new StringBuilder(stringBuilder.substring(i,j+1));
//                System.out.println(s.substring(i,j+1));
                if (s.substring(i,j+1).equals(String.valueOf(string1.reverse()))){
//                    System.out.println(s.substring(i,j));
                    if (s.substring(i,j+1).length() >= string.length()){
                        string= s.substring(i,j+1);
                    }
                }
            }
        }
        return string;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
