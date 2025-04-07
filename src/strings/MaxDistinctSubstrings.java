package strings;

import java.util.*;

public class MaxDistinctSubstrings {

    public static int countDistinctSubstrings(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Set<String> distinctSubstrings = new HashSet<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                String sub = s.substring(i, j + 1);
                distinctSubstrings.add(sub);
            }
        }

        List<String> dup = new ArrayList<>();
        for (String s1 : distinctSubstrings) {
            char[] ch = s1.toCharArray();
            Set<Character> set = new HashSet<>();
            for (char c : ch) {
                if (set.contains(Character.valueOf(c))){
                    dup.add(s1);
                    break;
                }
                set.add(c);
            }
        }

        distinctSubstrings.removeAll(dup);

        return distinctSubstrings.size()+s.length();
    }

    public static void main(String[] args) {
        String s1 = "bcada";
        System.out.println(countDistinctSubstrings(s1));

    }
}
