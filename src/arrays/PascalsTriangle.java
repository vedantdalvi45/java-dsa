package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                list.add(nCr(i,j));
            }
            arrayList.add(list);
        }
        return arrayList;
    }
    static int nCr(int n,int r){
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n-i);
            res /= (i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        int numrows=5;
        List<List<Integer>> arrayList = generate(numrows);
        for (int i = 0; i < numrows; i++) {
            for (int j = numrows; j > i+1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < arrayList.get(i).size(); j++) {
                System.out.print(arrayList.get(i).get(j)+ " ");
            }

            System.out.println();
        }
        System.out.println(nCr(4,1));
    }
}
