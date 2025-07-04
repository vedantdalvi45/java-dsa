package arrays;

public class MaximumProfit {
    static int maxProfit(int[] prices){
        int max = 0;
        int day=0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j]-prices[i] > max){
                    max=prices[j]-prices[i];
                    day = i+1;
                }
            }
        }
        if (day != 0)
            System.out.print("Maximum Profit Got on day "+day+" Profit : ");
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
