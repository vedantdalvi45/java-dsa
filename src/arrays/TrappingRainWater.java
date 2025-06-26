package arrays;

import java.util.Arrays;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int waterTrapped = 0;
        System.out.println(Arrays.toString(height));
        while (left < right) {
            if (height[left] < height[right]) {
                System.out.printf("Right Max:"+height[right]+" \n");
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    waterTrapped += leftMax - height[left];
                }
                left++;
            } else {
                System.out.printf("Left Max:"+height[left]+" \n");
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    waterTrapped += rightMax - height[right];
                }
                right--;
            }
            System.out.println(left+" "+right+"("+leftMax + ","+rightMax +") Water Trapped : "+waterTrapped);

        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trap(height);
        System.out.println("Trapped rain water: " + result);
    }
}
