package array.com.easy;

public class StockBuySell {

    static int maxProfit(int[] prices, int start) {
        if (start >= prices.length) {
            return 0;
        }

        int maxProfit = 0;

        for (int i = start; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {

                if (prices[j] > prices[i]) {
                    int currentProfit = prices[j] - prices[i]
                            + maxProfit(prices, j + 1);

                    maxProfit = Math.max(maxProfit, currentProfit);
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maxProfit(prices, 0));
    }
}
