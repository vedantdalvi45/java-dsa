package arrays;

import java.util.Arrays;

public class ThreeSumClosest {


    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  // Step 1: Sort the array
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            // Step 2: Use two pointers
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Update the closest sum if needed
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;  // Move right to increase sum
                } else {
                    right--; // Move left to decrease sum
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        ThreeSumClosest solver = new ThreeSumClosest();

        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println(solver.threeSumClosest(nums1, target1));

        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println(solver.threeSumClosest(nums2, target2));
    }
}


