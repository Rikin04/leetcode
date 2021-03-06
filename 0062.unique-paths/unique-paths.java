class Solution {
    int count = 0;
    public int uniquePaths(int m, int n) {
       int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int x = 0; x < m; x ++) {
            for (int y = 0; y < n; y ++) {
                if (x == 0 && y == 0) continue;
                int sum = 0;
                if (y > 0) sum += dp[x][y - 1];
                if (x > 0) sum += dp[x - 1][y];
                dp[x][y] = sum;
            }
        }
        return dp[m - 1][n - 1];
    }
}