package arrays;

import java.util.Arrays;

public class ReverseeArray {
    static int[] reversingArray(int[] array){
        int l = 0;
        int r = array.length-1;
        while (l<r){
            int t = array[r];
            array[r] = array[l];
            array[l] = t;
            l++;
            r--;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reversingArray(new int[]{1, 2, 3, 4,5})));
    }
}
