package hashmap;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int roman_num = 0;
        Map<Character, Integer> roman_map = new HashMap<>();
        roman_map.put('I', 1);
        roman_map.put('V', 5);
        roman_map.put('X', 10);
        roman_map.put('L', 50);
        roman_map.put('C', 100);
        roman_map.put('D', 500);
        roman_map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            int current_val = roman_map.get(s.charAt(i));
            if (i < s.length() - 1) {
                int next_val = roman_map.get(s.charAt(i + 1));
                if (current_val < next_val) {
                    roman_num -= current_val;
                } else {
                    roman_num += current_val;
                }
            } else {
                roman_num += current_val;
            }
        }
        return roman_num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
        System.out.println(romanToInt("LVIII"));  // Output: 58
        System.out.println(romanToInt("III"));    // Output: 3
    }
}