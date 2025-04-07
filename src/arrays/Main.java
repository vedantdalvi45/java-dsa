package arrays;

public class Main {
    public static void main(String[] args) {
        //single dimensional array
        SingleDimArray singleDimArray = new SingleDimArray(5);
        singleDimArray.insert(0,3);
        singleDimArray.insert(0,2);
        singleDimArray.insert(1,4);
        singleDimArray.insert(2,5);
        singleDimArray.insert(6,3);
        System.out.println(singleDimArray.array[0]);
        System.out.println(singleDimArray.array[4]);
        singleDimArray.searchElement(6);
        singleDimArray.deleteElement(0);
        singleDimArray.deleteElement(7);
        System.out.println();

        //two dimensional array
        TwoDimArray twoDimArray = new TwoDimArray(2);
        twoDimArray.insert(0,1,20);
        twoDimArray.insert(0,2,30);
        twoDimArray.insert(0,3,40);
        twoDimArray.insert(1,0,40);
        twoDimArray.insert(1,1,50);
        twoDimArray.traverse();
        twoDimArray.searchElement(40);
        twoDimArray.searchElement(0);
        twoDimArray.deleteElement(1,0);
        twoDimArray.traverse();

    }
}
