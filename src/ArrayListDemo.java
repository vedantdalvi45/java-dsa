import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrL = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            ArrayList<Integer> ar = new ArrayList<>();
            for (String s : sc.nextLine().split(" "))
                ar.add(Integer.parseInt(s));
            arrL.add(ar);
        }

        System.out.println(arrL);

    }
}
