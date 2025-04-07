import java.util.*;

public class Colection_Demo {

    public static void getNo(Set<Integer> a1){
        ArrayList<Integer> a = new ArrayList<>(a1);
        Collections.sort(a);
        System.out.println(a);
        int min = 1;
        if (a.getFirst()<2)
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) <= 0)
                    continue;
                else {
                    if (i < a.size() - 1) {
                        if (a.get(i) + 1 != a.get(i + 1)) {
                            min = a.get(i) + 1;
                            break;
                        }
                    } else
                        min = a.get(a.size() - 1) + 1;
                }
            }

        System.out.println(min);
    }
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        a.add(7);
        a.add(8);
        a.add(9);
//        a.add(10);
        a.add(11);
        a.add(12);

        System.out.println(a);
        getNo(a);
    }
}
