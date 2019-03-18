class Solution {
    public int climbStairs(int n) {
        if (n <= 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int x = 0; x < n; x ++) {
            dp[x + 1] += dp[x];
            if (x < n - 1)
                dp[x + 2] += dp[x];
        }
        return dp[n];
    }
}