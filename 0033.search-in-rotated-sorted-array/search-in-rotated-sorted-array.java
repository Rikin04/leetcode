class Solution {
    public int search(int[] nums, int target) {
    	if (nums.length == 0)
    		return -1;
    	if (nums.length == 1) {
    		if (target == nums[0]) return 0;
    		else return -1;
    	}
    	int begin = 0, end = nums.length - 1;
    	int mid = (begin + end) / 2;
    	int low = 0, high = nums.length, ok = 0;
    	if (nums[mid] > nums[end])
    		high = mid;
    	else 
    		low = mid + 1;
    	while (low < high) {
    		int m = (low + high) / 2;
    		if (nums[m] == target) return m;
    		else if (nums[m] > target) high = m - 1;
    		else low = m + 1;
    	}
    	while (ok < nums.length) {
    		if (nums[ok] == target)
    			return ok;
    		++ ok;
    	}
    	return -1;
    }
}