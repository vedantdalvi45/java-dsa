package arrays;

public class ContainerWithMostWater2 {
    public void maxArea(int[] height) {
        int areaOfWater = 0;
        int temp = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                if (i==j)
                    continue;

                temp = height[i]*height[j];
                if (temp > areaOfWater)
                    areaOfWater = temp;
            }
        }
        System.out.println(areaOfWater);

    }
    public static void main(String[] args) {
        new ContainerWithMostWater2().maxArea(new int[] {1,8,6,2,5,4,8,3,7});
    }
}
