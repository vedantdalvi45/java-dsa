package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class ArrayListDemo {
    public static ArrayList<Integer> getIntegerArrayList(){
        ArrayList<Integer> arrayList =   new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(45);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(8);
        return arrayList;
    }
    public static void main(String[] args) {
        ArrayList<Object> a = new ArrayList<>();
        a.add(1);
        a.add(9);
        a.add(14);
        a.add(9);

        System.out.println(a.add(3.4));

        System.out.println(a.contains(9));
        System.out.println(a);
        /*
        a.add(45);

        System.out.println(a.get(0));
        System.out.println(a.contains(1));
        System.out.println(a.indexOf(9));
        System.out.println(a.set(0, 2));
        System.out.println(a);
        System.out.println(a.reversed());

        a.clear();
        System.out.println(a);*/

//        ArrayList<Integer> b = new ArrayList<>(a);
////        b = (ArrayList<Integer>) a.clone();
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

        ArrayList<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(9);
        c.add(9);
        c.add(14);
        System.out.println(c.hashCode());
//        System.out.println(b);


        System.out.println(Integer.MAX_VALUE);
    }
    public static String rev(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
