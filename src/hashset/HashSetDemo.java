package hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import arrayList.ArrayListDemo;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Object> hashSet1 = new HashSet<>(ArrayListDemo.getIntegerArrayList());
        Set<Integer> hashSet2 = new HashSet<>();
        System.out.println(hashSet1.add(2));
        System.out.println(Arrays.toString(hashSet1.toArray()));
        System.out.println(hashSet1.getClass());
        System.out.println(hashSet1);




    }
}
