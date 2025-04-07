package arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        //TODO

        int dup = nums[1];
        int count = 1;
//        LinkedHashSet<Integer> linkedHashSet =  new LinkedHashSet<>();
//        for (int i : nums){
//            linkedHashSet.add(i);
//        }
        boolean flag = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                flag = true;
                continue;
            }else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2,3,3,3}));
    }
}
