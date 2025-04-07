package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        //set cols to zero
        for (int r : row ){
            for (int c = 0; c < matrix.length; c++) {
                matrix[r][c] = 0;
            }
        }
        // set rows to zero
        for (int c : col ){
            for (int r = 0; r < matrix[0].length; r++) {
                matrix[r][c] = 0;
            }
        }
        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
    }
}
