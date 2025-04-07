package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        try {
            for (int i = arr.length - 1; i >= 0 ; i--) {
                if (arr[i] != arr[i - 1])
                    return arr[i - 1];
            }
        }catch (IndexOutOfBoundsException e){
            return -1;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[]{10, 5,10,10}));
    }
}
