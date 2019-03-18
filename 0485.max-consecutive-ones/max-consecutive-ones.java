class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0)
            return 0;
        int count = 0, max = 0;
        for (int x : nums) {
            if (x == 1) {
                count ++;
                if (count > max)
                    max = count;
            }
            else count = 0;
        }
        return max;
    }
}