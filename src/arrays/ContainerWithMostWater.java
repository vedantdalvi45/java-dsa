package arrays;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (right > left) {
            max = Math.max(Math.min(height[left],height[right])*(right-left),max);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
