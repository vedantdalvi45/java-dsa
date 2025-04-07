package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNumber {
    public static int[] removeDuplicates(int[] arr) {
        //   TODO
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : arr){
            set.add(i);
        }
        int[] array =  new int[set.size()];
        int j=0;
        for (int  i : set){
            array[j] = i;
            j++;
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{6,6,1, 1, 2, 2, 3, 4, 5})));
    }
}
