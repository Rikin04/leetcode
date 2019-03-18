class Solution {
	boolean[] b;
    int length;
    String[] str;
    LinkedList<List<String>> list = new LinkedList<List<String>>();
    public List<List<String>> solveNQueens(int n) {
        b = new boolean[n];
        int[] nums = new int[n];
        length = n;
        str = new String[n];
        setString();
        queen(nums, 0, new LinkedList<String>());
        return list;
    }
    public void queen(int[] nums, int n, LinkedList<String> l) {
        if (n == length)
            list.add((List<String>)l.clone());
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
                nums[n] = i;
                b[i] = true;
                l.add(str[i]);
                queen(nums, n + 1, l);
                l.remove(l.size() - 1);
                b[i] = false;
                nums[n] = 0;
            }
        }
    }
    public void setString() {
        for (int i = 0; i < length; i ++)
            str[i] = "";
        for (int i = 0; i < length; i ++) {
            for (int x = 0; x < i; x ++) 
                str[i] += ".";
            str[i] += "Q";
            for (int y = i + 1; y < length; y ++) 
                str[i] += ".";
        }
    }
}