package hashmap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(1,1);
        System.out.println(hashMap.put(1,2));
        System.out.println(hashMap.putIfAbsent(1,3));
        System.out.println(hashMap.putIfAbsent(3,4));
        System.out.println(hashMap.getOrDefault(4,0));
        System.out.println(hashMap.get(4));
        System.out.println(hashMap);
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
        for (Integer i :hashMap.keySet())
            System.out.print(hashMap.get(i));
    }
}
