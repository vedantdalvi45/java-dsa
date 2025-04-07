package arrays;

import java.sql.Array;
import java.util.Arrays;

public class MiddleFunction {
    public static int[] middle(int[] array) {
        int[] newA = new int[array.length-2];
        for (int i = 1,k =0; i < array.length-1; i++){
            newA[k]=array[i];
            k++;
        }

        return newA;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(middle(new int[]{1,2,3,4,})));
    }
}
