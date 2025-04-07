package arrays;

public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
        // TODO
        int max =0;
        int sub = 0;
        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j < i; j++) {
                sub = prices[i]-prices[j];
                if (sub > max)
                    max = sub;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
