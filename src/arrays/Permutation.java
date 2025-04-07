package arrays;

public class Permutation {
    public static boolean permutation(int[] array1, int[] array2){
        // TODO
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    count++;
            }
        }
        return count == array1.length;
    }

    public static void main(String[] args) {
        System.out.println(permutation(new int[]{1,2,3,4,5},new int[]{5,1,2,3,4}));
    }
}
