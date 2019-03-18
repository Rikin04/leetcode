class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (nums.length < 4)
        	return list;
        Arrays.sort(nums);
        int begin = 0;
        while (begin < nums.length) {
        	int end = nums.length - 1;
        	while (end > begin) {
        		int begin1 = begin + 1, end1 = end - 1, order = target - nums[begin] - nums[end];
        		while (begin1 <  end1) {
        			if (order - nums[begin1] > nums[end1])
        				++ begin1;
        			else if (order - nums[begin1] < nums[end1])
        				-- end1;
        			else {
        				ArrayList<Integer> l = new ArrayList<Integer>();
        				l.add(nums[begin]);
        				l.add(nums[begin1]);
        				l.add(nums[end1]);
        				l.add(nums[end]);
        				if (!list.contains(l))
        					list.add((List<Integer>)l.clone());
        				l.clear();
        				while (begin1 <= end1 && nums[begin1] == nums[begin1 + 1]) ++ begin1;
        				while (begin1 <= end1 && nums[end1] == nums[end1 - 1]) -- end1;
        				++ begin1;
        				-- end1;
        			}
        		}
        		while (end > begin && nums[end] == nums[end - 1]) -- end;
        		-- end;
        	}
        	while (begin < end && nums[begin] == nums[begin + 1]) ++ begin;
        	 ++ begin;
        }
        return list;
    }
}