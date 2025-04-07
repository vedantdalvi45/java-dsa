package arrays;

public class NumberInAnArray {
    public static int searchInArray(int[] intArray, int valueToSearch) {
        // TODO
        int index = -1;
        for (int i = 0; i < intArray.length; i++)
            if (intArray[i] == valueToSearch){
                index = i;
                break;
            }
        return index;
    }
    public static void main(String[] args) {
        System.out.println(searchInArray(new int[]{1,2,3,4,5,6},6));
    }
}
