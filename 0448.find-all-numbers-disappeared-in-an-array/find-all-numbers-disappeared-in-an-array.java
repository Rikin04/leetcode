class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int x : nums)
            //if (!map.containsKey(x))
                map.put(x, x);
        for (int x = 1; x <= nums.length; x ++)
            if (!map.containsKey(x))
                list.add(x);
        return list;
    }
}