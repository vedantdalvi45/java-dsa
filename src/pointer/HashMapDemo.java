package pointer;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap1 = new HashMap<>();
        HashMap<String,Integer> hashMap2 = new HashMap<>();
        HashMap<String,Integer> hashMap3 = new HashMap<>();

        hashMap1.put("Value",1);
        hashMap2 = hashMap1;
        hashMap3 = hashMap2;

        hashMap1.put("Value",2);

        System.out.println(hashMap1);
        System.out.println(hashMap2);
        System.out.println(hashMap3);
    }
}
