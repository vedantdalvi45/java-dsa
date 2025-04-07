package strings;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String str = "";
        if (strs.length == 1) {
            return strs[0];
        }
        int min_len = strs[0].length();
        for (String s : strs){
            if (s.length() < min_len)
                min_len = s.length();
        }
        System.out.println(min_len);
        for (int i = 0; i < min_len; i++) {
            str = strs[0].substring(0,i+1);
            System.out.println(str);
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].substring(0,i+1).equals(str)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
