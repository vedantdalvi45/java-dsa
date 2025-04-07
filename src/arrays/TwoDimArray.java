package arrays;

public class TwoDimArray {
    int[][] array;
    public TwoDimArray(int rows,int cols){
        array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j]=Integer.MIN_VALUE;
            }
        }
    }
    public TwoDimArray(int rows){
        array = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                array[i][j]=Integer.MIN_VALUE;
            }
        }
    }
    public void insert(int row,int col,int data){
        try {
            if (array[row][col]==Integer.MIN_VALUE){
                array[row][col] = data;
                System.out.println("Data inserted");
            }else
                System.out.println("Given Location Consist Another Value");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void traverse(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void searchElement(int element){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]==element){
                    System.out.println("Element Found at index y : "+i+" x : "+j);
                    return;
                }
            }
        }
        System.out.println("Array Element Not Found");
    }

    public void deleteElement(int row,int col){
        var temp = array[row][col];
        array[row][col] = Integer.MIN_VALUE;
        System.out.println("value "+temp+" is deleted from index y : "+row+" x : "+col);
    }
}
