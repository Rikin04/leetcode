class Solution {
    public int removeDuplicates(int[] nums) {
    	if (nums.length <= 1)
    		return nums.length;
    	int num = nums[1], length = 1, i = 1;
    	while (i < nums.length) {
    		num = nums[i];
    		if (num != nums[i - 1]) {
                nums[length] = num;
    			++ length;
            }
    		++ i;
    	}
    	return length;
    }
}