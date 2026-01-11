package array.com.easy;

public class StockBuySell {


    //1. brute force
    static int maxProfit1(int[] prices, int start) {
        if (start >= prices.length) {
            return 0;
        }
        int maxProfit = 0;

        for (int i = start; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {

                if (prices[j] > prices[i]) {
                    int currentProfit = prices[j] - prices[i]
                            + maxProfit1(prices, j + 1);

                    maxProfit = Math.max(maxProfit, currentProfit);
                }
            }
        }
        return maxProfit;
    }


    //2. optimize approch
    static int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maxProfit1(prices, 0));
        int maxP = maxProfit(prices);
        System.out.println(maxP);
    }
}
