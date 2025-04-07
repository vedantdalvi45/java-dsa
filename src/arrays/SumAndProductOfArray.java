package arrays;

import java.util.Arrays;

public class SumAndProductOfArray {
    public static void main(String[] args) {
        spofArray(new int[]{1,2,33,4,5});
    }

    static void spofArray(int[] ar) {
        System.out.println(Arrays.toString(ar));
        int sum = 0, prod = 1;
        for (int i : ar) {
            sum += i;
            prod *= i;
        }
        System.out.println(prod);
        System.out.println(sum);
    }
}
