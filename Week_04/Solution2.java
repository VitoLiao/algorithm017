package Week_04;


//122. 买卖股票的最佳时机 II
class Solution2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i != prices.length - 1) {
                if (prices[i] < prices[i+1]) {
                    profit += prices[i+1] - prices[i];
                }
            }
        }
        return profit;
    }
}
