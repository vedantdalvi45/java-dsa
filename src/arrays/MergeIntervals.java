package arrays;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        for (int i = 0; i < intervals.length; i++) {
            if (list.size() == 0 || list.getLast()[1] < intervals[i][0]){
                list.add(new int[]{intervals[i][0],intervals[i][1]});
            }else if (list.getLast()[1] >= intervals[i][0]){
                if (list.getLast()[1] < intervals[i][1])
                    list.getLast()[1] = intervals[i][1];
                continue;
            }
        }
        System.out.println(list.getLast()[1]);

        return list.toArray(new int[list.size()][2]);
    }
    
    public static void main(String[] args) {
        int[][] intervals = {{5, 10}, {1, 3}, {3, 6}, {8, 10}, {15, 18}};
        int[ ][ ] ans = merge(intervals);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
