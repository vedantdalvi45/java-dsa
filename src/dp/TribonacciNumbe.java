package dp;

import java.util.LinkedList;
import java.util.Queue;

public class TribonacciNumbe {
    static int printTribRec(int n) {
        if (n == 0 || n == 1 || n == 2)
            return 0;

        if (n == 3)
            return 1;
        else
            return printTribRec(n - 1) +
                    printTribRec(n - 2) +
                    printTribRec(n - 3);
    }

    static int  tribonacci(int n) {
        System.out.println(printTribRec(n+1));
        System.out.println(printTribRec(n));
        System.out.println(printTribRec(n-1));
        return printTribRec(n+1)+printTribRec(n)+printTribRec(n-1);
    }

    public static void main(String[] args) {
        int i = 25;
        System.out.println(tribonacci(i));
    }
}
