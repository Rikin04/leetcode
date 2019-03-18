class Solution {
    public int threeSumClosest(int[] nums, int target) {
    	if (nums.length < 3)
    		return 0;
    	if (nums.length == 3) 
    		return (nums[0] + nums[1] + nums[2]);
    	Arrays.sort(nums);
    	int min = nums[0] + nums[1] + nums[2];
    	for (int x = 0; x < nums.length; x ++) {
    		if (x != 0 && nums[x] == nums[x - 1])
    			continue;
    		int order = target - nums[x];
    		int m = x + 1, n = nums.length - 1;
    		while (m < n) {
    			if (nums[m] + nums[n] > order) {
    				if (Math.abs(nums[x] + nums[m] + nums[n] - target) < Math.abs(min - target))
    					min = nums[x] + nums[m] + nums[n];
    				-- n;
    			}
    			else if (nums[m] + nums[n] < order) {
    				if (Math.abs(nums[x] + nums[m] + nums[n] - target) < Math.abs(min - target))
    					min = nums[x] + nums[m] + nums[n];
    				++ m;
    			}
    			else
    				return target;
    		}
    	}
    	return min;
    }
}