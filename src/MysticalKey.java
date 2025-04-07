import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class MysticalKey {

    static void getKey(ArrayList<Integer> a){
        int min = 0,count = 0,i=1,rem=0;
        while(true) {
            for (int j : a){
                rem = i%a.getFirst();
                if (i%j != rem){
                    break;
                }
                count++;
            }
            if (count==a.size()){
                min = i;
                break;
            }
            i++;
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++)
//            a.add(sc.nextInt());

        a.add(7);
        a.add(10);
        a.add(4);
        a.add(3);
        a.add(15);
        a.add(1);
        a.add(1);



        System.out.println(a);
        getKey(a);
    }
}
