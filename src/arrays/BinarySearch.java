package arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr,int element){
        int start = 0,end = arr.length-1;
        while (start<=end){
            int mid = (end+start)/2;
            System.out.println(arr[mid]);
            if (arr[mid] == element){
                return mid;
            } else if (arr[mid] < element) {
                start = mid +1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,9,20,32};
        int element = 5;
        System.out.println(binarySearch(arr,element));
    }
}
