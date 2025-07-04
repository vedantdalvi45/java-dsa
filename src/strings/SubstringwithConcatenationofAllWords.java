package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringwithConcatenationofAllWords {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words.length == 0) return result;

        int wordLength = words[0].length();
        int totalLength = wordLength * words.length;
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words)
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

        for (int i = 0; i <= s.length() - totalLength; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            while (j < words.length) {
                int wordIndex = i + j * wordLength;
                String word = s.substring(wordIndex, wordIndex + wordLength);

                if (!wordCount.containsKey(word)) break;

                seen.put(word, seen.getOrDefault(word, 0) + 1);
                if (seen.get(word) > wordCount.get(word)) break;

                j++;
            }

            if (j == words.length) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findSubstring("barfoofoobarthefoobarman",new String[]{"bar","foo","the"}));
    }
}
