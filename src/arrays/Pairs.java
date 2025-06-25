package arrays;

public class Pairs {
    
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,9,20,32};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+"),");
            }
            System.out.println();
        }
    }
}
