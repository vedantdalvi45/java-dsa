package arrays;

import java.util.Arrays;

public class MaxProductOfTwoIntegers {
    public static String maxProduct(int[] intArray) {
        // TODO
        Arrays.sort(intArray);
        return "("+intArray[intArray.length-2]+","+intArray[intArray.length-1]+")";
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{10,70,30,40,50}));
    }
}
