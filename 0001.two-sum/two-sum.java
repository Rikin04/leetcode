class Solution {
    public int[] twoSum(int[] nums, int target) {
    	for (int x = 0; x < nums.length; x ++) {
    		int z = target - nums[x];
    		for (int y = x + 1; y < nums.length; y ++) {
    			if (z == nums[y]) {
    				int[] a = {x,y};
    				return a;
    			}
    		}
    	}
    	int[] a = {};
    	return a;
    }
}