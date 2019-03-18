class Solution {
    public int removeElement(int[] nums, int val) {
    	int top = 0, button = nums.length - 1;
    	if (nums.length == 1 && nums[0] == val)
    		return 0;
    	while (top < button) {
    		while (top < button && nums[top] != val) 
    			++ top;
    		while (top < button && nums[button] == val)
    			-- button;
    		if (button <= top) 
    			break;
    		if (nums[top] == val && nums[button] != val) {
    			nums[top] = nums[button];
    			nums[button] = val;
    		}
    	}
    	int length = 0;
    	for (int x : nums)
    		if (x != val)
    			length ++;
    	return length;
    }
}