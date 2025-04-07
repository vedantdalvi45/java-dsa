package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchPatternKMPAlgorithm {
    public static ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < pat.length()-txt.length()+1; i++) {
            if (pat.charAt(i) == txt.charAt(0)){
                if (pat.substring(i,i+txt.length()).equals(txt))
                    arrayList.add(i);
            }

        }
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(search("geeksforgeeks","geek"));
    }
}
