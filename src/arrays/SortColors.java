package arrays;

import java.util.Arrays;

public class SortColors {
    public static int[] sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums));
            if (nums[i] == 0) {
                zero = i;
                System.out.println("1");
            }
            else if (nums[i] == 1) {
                System.out.println("1");
                one = i;
                if (nums[i+1] ==  0){
                    int t = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = t;
                }
            } else if (nums[i] == 2) {
                System.out.println("2");
                two = i;
            }

        }
        return nums;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortColors(new int[]{0, 0, 2, 1, 2, 2})));


    }
}
