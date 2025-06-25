package arrays;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class CombinationSumII {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> noFreq = new TreeMap<>();
        int target = 8;
        int[] candidates = new int[]{10,1,2,7,6,1,5};
        for (int i = 0; i < candidates.length; i++) {
            if (noFreq.containsKey(candidates[i])){
                noFreq.put(candidates[i],noFreq.get(candidates[i])+1);
            }else
                noFreq.put(candidates[i],1);
        }
        System.out.println(noFreq);
        for(int key : noFreq.keySet()){
            if (key > target/2){
                break;
            }

            int freq = 0;
            while (noFreq.get(key) != freq){
                List<Integer> list = new ArrayList<>();
                if (noFreq.containsKey(target-(freq*key))){
                    list.add(key);
                }
                freq++;
            }
        }
    }
}
