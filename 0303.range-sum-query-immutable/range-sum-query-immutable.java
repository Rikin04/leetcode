class NumArray {
    int[] dp;
    public NumArray(int[] nums) {
        dp = new int[nums.length + 1];
        for (int x = 1; x < dp.length; x ++) 
            dp[x] = nums[x - 1] + dp[x - 1];
    }
    
    public int sumRange(int i, int j) {
        if (i > j)
            return 0;
        if (i == 0)
            return dp[j + 1];
        int x = i - 0 - 1;
        return (dp[j + 1] - dp[x + 1]);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */