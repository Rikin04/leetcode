class Solution {
    int count = 0;
	boolean[] b;
    int length;
    public int totalNQueens(int n) {
        b = new boolean[n];
        int[] nums = new int[n];
        length = n;
        queen(nums, 0);
        return count;
    }
    public void queen(int[] nums, int n) {
		if (n == length)
			++ count;
		else {
			for (int i = 0; i < nums.length; i ++) {
				if (b[i])
					continue;
				int x = 0;
				for (; x < n; x ++) {
					if ((double)(n - x) / Math.abs(i - nums[x]) == 1)
						break;
				}
				if (x != n)
					continue;
				b[i] = true;
				nums[n] = i;
				queen(nums, n + 1);
				b[i] = false;
				nums[n] = 0;
			}
		}
	}
}