class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int x = 0; x < nums.length - 1; x = x + 2)
            sum += nums[x];
        return sum;
    }
}