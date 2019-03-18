class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> a[1] - b[1]);
        int[] dp = new int[pairs.length];
        dp[0] = 1;
        for (int i = 0; i < pairs.length; i ++) {
            for (int j = i + 1; j < pairs.length; j ++) {
                if (pairs[i][1] < pairs[j][0])
                    dp[j] = Math.max(dp[j], dp[i] + 1);
            }
        }
        Arrays.sort(dp);
        return dp[pairs.length - 1];
    }
}