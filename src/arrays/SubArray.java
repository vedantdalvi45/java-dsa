package arrays;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,9,20,21};
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]+1 == arr[i+1]){
                System.out.printf(arr[i]+",");
            }
            else{
                System.out.println(arr[i]);
            }
        }
        System.out.print(arr[arr.length-1]);
    }
}
