package arrays;

import java.util.*;

public class MaximumSumofDistinctSubarrays {
    static public long maximumSubarraySum(int[] nums, int k) {
        long max = 0, sum = 0;
        long deletedSum = 0;
        HashMap<Integer, Long> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                if (i > k) {
                    deletedSum = hashMap.get(nums[i - k + 1]);
                    hashMap.remove(nums[i - k + 1]);
                } else {
                    deletedSum = hashMap.get(hashMap.keySet().iterator().next());
                    hashMap.remove(hashMap.keySet().iterator().next());
                }
                continue;
            }

            sum += nums[i];
            hashMap.put(nums[i], sum);
            System.out.println(hashMap);
            if (hashMap.size() == k) {
//                System.out.println(max + " " +sum+" "+ deletedSum);
                max = Math.max(max, sum - deletedSum);
                deletedSum = hashMap.get(nums[i - k + 1]);
                hashMap.remove(nums[i - k + 1]);
            }
        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }259669
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{92288, 7285, 36004, 38608, 80752, 46073, 63141, 27823, 65712, 14101, 5709, 48750, 48790, 62745, 58518, 43158, 99440, 64617, 48090, 28800, 1026, 78765, 14888, 45655, 67972, 19514, 50108, 15097, 80126, 73145, 10371, 5359, 93546, 51345, 14353, 88673, 97386, 60422, 18821, 85109, 25810, 71778, 57996, 6172, 88916, 35154, 2387, 77738, 13921, 12604, 18412, 62397, 28883, 40495, 84421, 39391, 39689, 79422, 43346, 72428, 2182, 57338, 11603, 50305, 408, 83143, 60472, 13612, 42777, 70364, 98731, 42386, 96458, 60192, 7497, 63864, 12208, 70020, 84734, 61350, 38917, 79621, 16105, 95017, 77345, 87307, 20183, 99879, 9304, 88769, 42235, 89146, 5114, 20204, 74987, 88925, 26261, 38665, 98109, 54976, 11185, 14148, 49951, 7389, 64133, 67453, 53751, 54233, 88451, 34526, 75619, 31243, 73763, 65748, 96278, 53057, 78946, 16958, 96400, 29099, 43439, 30349, 86213, 41601, 41221, 30186, 36983, 45581, 91452, 26022, 77528, 63143, 94119}, 3));
//        System.out.println(maximumSubarraySum(new int[]{1,1,2}, 2));
    }
}