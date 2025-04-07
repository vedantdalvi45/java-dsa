package strings;

public class CountBinarySubstrings {
    public static int countBinarySubstrings(String s) {
        int prev = 0,cur = 1,sum = 0;
        for (int i = 1; i < s.length() ; i++) {
            if (s.charAt(i) != s.charAt(i-1) ){
                sum += (cur < prev) ? cur : prev;
                prev = cur;
                cur = 1;
            }else
                prev ++;
        }
        return  sum += (cur < prev) ? cur : prev;
    }
    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("1010111"));
    }
}
