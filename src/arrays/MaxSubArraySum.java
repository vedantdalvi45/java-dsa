package arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
//        int[] arr = {1,-2,6,-1,3};
        int[] arr = {2,4,6,8,10};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                System.out.printf("(");
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.printf(arr[k]+",");
                    sum += arr[k];
                }
                System.out.printf(")="+sum+",");
                max = (max<sum)?sum:max;
            }
            System.out.println();
        }

        System.out.println("Max:"+max);
        
    }
}
