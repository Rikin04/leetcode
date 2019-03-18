class Solution {
    public void moveZeroes(int[] nums) {
        int m = 0;
        for (int x = 0; x < nums.length; x ++) {
            if (nums[x] != 0)
                nums[m ++] = nums[x];
        }
        while (m < nums.length) nums[m ++] = 0;
    }
}