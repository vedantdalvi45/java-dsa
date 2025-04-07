package arrays;

import java.util.Arrays;

public class RotateMatrix {
    public static void rotateMatrix(int[][] matrix) {
        int len = matrix.length - 1;
        for (int j = 0; j < 1; j++) {
            for (int i = 0; i < 2; i++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[len - i][j];
                matrix[len - i][j] = matrix[len - j][len - i];
                matrix[len - j][len - i] = matrix[i + j][len - i - j];
                matrix[i + j][len - i - j] = temp;
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
//            rotateMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        //create 4* for matrix of 1-16
        int[][] matrix2 = new int[4][4];
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix2[i][j] = count;
                count++;
            }
        }
        rotateMatrix(matrix2);

    }
}
