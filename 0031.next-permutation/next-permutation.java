class Solution {
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        if (length == 0 || length == 1);
        else {
        	int index = length - 1;
        	while (index > 0 && nums[index] <= nums[index - 1])
        		-- index;
        	int h = index, end = length - 1;
        	if (index != 0 && index != nums.length - 1) {
        		while (h != nums.length - 1 && nums[h] > nums[index - 1] && nums[h + 1] > nums[index - 1])
        			++ h;
        	}
            if (index != 0) {
        	    int t = nums[index - 1];
        	    nums[index - 1] = nums[h];
        	    nums[h] = t;
            }
        	int begin = index;
        	while (begin < end) {
        		int tu = nums[begin ++];
        		nums[begin - 1] = nums[end --];
        		nums[end + 1] = tu;
        	}
        }
    }
}