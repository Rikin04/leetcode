class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int profit = 0;
        int buy = prices[0];
        for (int x = 1; x < prices.length; x ++) {
            if (prices[x] < buy)
                buy = prices[x];
            else {
                profit = profit + prices[x] - buy;
                buy = prices[x];
            }
        }
        return profit;
    }
}