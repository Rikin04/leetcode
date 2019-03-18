/*
class Solution {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int res = 1;
        while (n != 4 && n != 2 && n != 0) {
            res *= 3;
            n -= 3;
        }
        if (n != 0)
            res *= n;
        return res;
    }
}
*/
// dp
class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int x = 3; x < n + 1; x ++) {
            dp[x] = 1;
            for (int y = 1; y <= x / 2; y ++) {
                dp[x] = Math.max(dp[x], Math.max(y * dp[x - y], y * (x - y)));
            }
        }
        return dp[n];
    }
}