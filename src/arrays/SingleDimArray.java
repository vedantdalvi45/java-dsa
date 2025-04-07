package arrays;

public class SingleDimArray {
    int[] array;
    public SingleDimArray(int size){
        array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = Integer.MIN_VALUE;
    }
    public void insert(int location,int data){
        try {
            if (array[location]==Integer.MIN_VALUE){
                array[location] = data;
                System.out.println("Value Inserted");
            } else
                System.out.println("Given Location Consist Another Value");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    
    public void searchElement(int element){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==element){
                System.out.println("Element Found at index "+i);
                return;
            }
        }
        System.out.println("Array Element Not Found");
    }

    public void deleteElement(int index){
        try {
            var temp = array[index];
            array[index]=Integer.MIN_VALUE;
            System.out.println("value " + temp + " is deleted from index " + index);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
