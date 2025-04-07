package arrays;

import java.util.Arrays;

public class Sort2D {
    int[][] array = null;
    void insert(){
        array = new int[3][3];
        int k = 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = k;
            }
            k--;
        }
    }
    void sort(){
        Arrays.sort(array,(x,y)->Integer.compare(x[1],y[1]));
    }
    void printArray(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==0)
                    System.out.print("P"+array[i][j]+"    ");
                else
                    System.out.print(array[i][j]+"    ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Sort2D sort2D = new Sort2D();
        sort2D.insert();
        sort2D.printArray();
        System.out.println();
        sort2D.sort();
        sort2D.printArray();
    }
}
