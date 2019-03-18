class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
        sub(list, new LinkedList<Integer>(), nums, 0);
        return list;
    }
    public void sub(LinkedList<List<Integer>> list, List<Integer> l, int[] nums, int start) {
        list.add(new LinkedList<Integer>(l));
        for (int i = start; i < nums.length; i ++) {
            l.add(nums[i]);
            sub(list, l, nums, i + 1);
            l.remove(l.size() - 1);
        }
    }
}