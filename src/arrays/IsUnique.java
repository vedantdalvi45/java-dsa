package arrays;

public class IsUnique {
    public static boolean isUnique(int[] intArray) {
        // TODO
        for (int i = 0; i < intArray.length -1; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique(new  int[]{1,9,3,4,5,6}));
    }
}
