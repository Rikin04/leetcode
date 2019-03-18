class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int[] dp = new int[nums.length + 2];
        for (int x = 0; x < dp.length - 2; x ++) {
            int y = x + 2;
            for (int i = 0; i + y < dp.length; ++ i) 
                dp[i + y] = Math.max(dp[i + y], dp[x] + nums[x + i]);
        }
        int max = 0;
        for (int x : dp)
            if (x > max)
                max = x;
        return max;
    }
}