package arrays;

public class SumOfDiagonal {
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int noOfRows = array[0].length;
            for (int j = 0; j < noOfRows; j++) {
                    sum += array[j][j];
            }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDiagonalElements(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
