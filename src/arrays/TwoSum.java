package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // TODO
        int[] indexes = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target-nums[i])){
                indexes[1] = i;
                indexes[0] = hashMap.get(target-nums[i]);
            }
            hashMap.put(nums[i],i);
        }
        
        return indexes;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},26)));
    }
}
