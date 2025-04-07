package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NonRepeatingCharacter {
    static public char nonRepeatingChar(String s) {
        char nonRep = '$';
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (Character c  : map.keySet()){
            if (map.get(c) == 1)
                return c;
        }
        return nonRep;
    }
    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("geeksforgeeks"));
    }
}
