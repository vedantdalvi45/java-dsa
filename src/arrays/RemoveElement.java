package arrays;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = nums.length;
        int len = nums.length;
        int index = 0;
        for (int i = 0; i < len-1; i++) {
            if (nums[i] != val){
                count--;
            }else {
                System.out.println(Arrays.toString(nums));
                for (int j = i; j < len - 1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

                len--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
