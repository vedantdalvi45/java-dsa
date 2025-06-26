package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> merged = new ArrayList<Integer>();
        for (int i : nums1)
            merged.add(i);
        for (int i : nums2)
            merged.add(i);
        Collections.sort(merged);
        int size = merged.size();
        if (size%2==0){
            return (double) (merged.get(Math.abs(size/2))+merged.get(Math.abs(size/2)-1))/2;
        }else{
            return (double) merged.get(Math.abs(size/2));
        }
        

    }
    public static void main(String[] args) {
        System.out.println(new MedianOfSortedArray().findMedianSortedArrays(new int[]{1,  3}, new int[]{2}));
//        new MedianOfSortedArray().findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6});
    }
}
