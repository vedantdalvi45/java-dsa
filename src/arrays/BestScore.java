package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class BestScore {
    public static int[] findTopTwoScores(int[] array){
        int[] best  = new int[2];
        Arrays.sort(array);
        int i = array.length-1, j =0;
        while (true){
            if (j==2)
                break;
            if (array[i] != array[i-1]){
                best[j] = array[i];
                j++;
            }
            i--;
        }

        return best;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTopTwoScores(new int[]{84,85,86,87,85,90,85,83,23,45,84,1,2,0})));
    }
}
