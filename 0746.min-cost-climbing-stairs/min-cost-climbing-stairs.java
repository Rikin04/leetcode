class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 1)
            return 0;
        int[] dp = new int[cost.length + 1];
        for (int index = 1; index < dp.length; ++ index) dp[index] = Integer.MAX_VALUE;
        for (int x = 0; x < cost.length - 1; ++ x) {
            if (dp[x] + cost[x] < dp[x + 1]) dp[x + 1] = dp[x] + cost[x];
            if (dp[x] + cost[x + 1] < dp[x + 2]) dp[x + 2] = dp[x] + cost[x + 1];
        }
        return Math.min(dp[cost.length], dp[cost.length - 1]);
    }
}