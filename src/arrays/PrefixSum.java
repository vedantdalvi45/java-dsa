package arrays;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        int[] prefSum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j]+",");
                sum+=arr[j];
            }
            prefSum[i]=sum;
            System.out.println("="+sum);
        }
        System.out.println(Arrays.toString(prefSum));
    }

}
