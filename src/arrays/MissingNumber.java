package arrays;

import java.util.Arrays;

public class MissingNumber {
    static int findMissingNumberInArray(int[] arr) {
        // TODO
        Arrays.sort(arr);
        int missingNo = 0;
        System.out.println(Arrays.toString(arr));
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]+1 != arr[i + 1]) {
                    System.out.println(arr[i] + "   " + arr[i + 1]);
                    missingNo = arr[i] + 1;
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            if (arr[0] != 0)
                missingNo = arr[0] - 1;
            else {
                missingNo = arr[arr.length - 1] + 1;
            }
        }
//        if (false){
//            if (missingNo == 0){
//                missingNo = arr[arr.length-1]+1;
//            }else {
//                missingNo = arr[0]-1;
//            }
//        }
        return missingNo;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumberInArray(new int[]{3, 1,0,2}));
    }
}
