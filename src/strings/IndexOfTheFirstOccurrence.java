package strings;

public class IndexOfTheFirstOccurrence {
    public static int strStr(String haystack, String needle) {
            char first = needle.charAt(0);
            int occuredIndex = -1;
            for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
                if (haystack.charAt(i) == first){
                    if (haystack.substring(i,needle.length()+i).equals(needle)){
                        return i;
                    }
                }
            }
            return occuredIndex;
    }

    public static void main(String[] args) {
        System.out.println(strStr("MadSad","Sad"));
    }
}
