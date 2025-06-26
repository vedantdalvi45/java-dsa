package arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int i;
        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) break;
        }

        if (i >= 0) {
            int j;
            for (j = nums.length - 1; j > i; j--) {
                if (nums[j] > nums[i]) break;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        for (int start = i + 1, end = nums.length - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        System.out.println("Before: " + Arrays.toString(nums));

        nextPermutation(nums);

        System.out.println("After:  " + Arrays.toString(nums));
    }
}
