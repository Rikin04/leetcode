class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
        	return 0;
        int low = 0, high = nums.length - 1;
        while (high - low > 1) {
        	int mid = (high + low) / 2;
        	if (nums[mid] == target) return mid;
        	else if (nums[mid] > target) high = mid - 1;
        	else low = mid + 1;
        }
        if (high == low) {
        	if (nums[low] >= target)
        		return low;
        	else
        		return low + 1;
        }
        else{
        	if (nums[high] < target)
        		return high + 1;
        	else if (nums[low] < target || nums[high] == target)
        		return low + 1;
        	else
        		return low;
        }
    }
}