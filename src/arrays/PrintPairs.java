package arrays;

public class PrintPairs {
    public static void main(String[] args) {
        int[] arry = new int[]{1,2,3,4 };
        for (int i = 0; i < arry.length; i++) {
            for (int j = i+1; j < arry.length; j++) {
                System.out.print(arry[i]+""+arry[j]+"   ");
            }
            System.out.println();
        }
    }
}
