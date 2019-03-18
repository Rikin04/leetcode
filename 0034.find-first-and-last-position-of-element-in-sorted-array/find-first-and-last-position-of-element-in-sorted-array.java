class Solution {
    public int[] searchRange(int[] nums, int target) {
    	int[] a = {-1, -1};
    	int min = 0, max = 0;
    	if (nums.length == 0)
    		return a;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
        	int mid = (low + high) / 2;
        	if (nums[mid] == target) {
        		min = max = mid;
        		while (min > 0 && nums[min] == nums[min - 1]) -- min;
        		while (max < nums.length - 1 && nums[max] == nums[max + 1]) ++ max;
        		a[0] = min;
        		a[1] = max;
        		return a;
        	}
        	else if (nums[mid] > target) high = mid - 1;
        	else low = mid + 1;
        }
        return a;
    }
}