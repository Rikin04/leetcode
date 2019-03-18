class Solution {
    int n;
    LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[k];
        this.n = n;
        com(nums, 0, new LinkedList<Integer>());
        return list;
    }
    public void com(int[] nums, int m, LinkedList<Integer> l) {
        if (m == nums.length)
            list.add((List<Integer>)l.clone());
        else {
            int start = 1;
            if (m != 0)
                start = nums[m - 1] + 1;
            for (; start <= n; start ++) {
                nums[m] = start;
                l.add(start);
                com(nums, m + 1, l);
                l.remove(l.size() - 1);
                nums[m] = 0;
            }
        }
    }
}