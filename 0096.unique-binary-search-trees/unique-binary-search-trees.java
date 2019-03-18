class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int x = 2; x <= n; x ++) {
            for (int y = 1; y <= x; y ++) {
                int left = dp[y - 1];
                int right = dp[x - y];
                dp[x] += left * right;
            }
        }
        return dp[n];
    }
}