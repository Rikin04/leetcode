import java.util.*;
class Solution {
	ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	if (candidates.length == 0)
    		return list;
    	Arrays.sort(candidates);
    	int n = target / candidates[0];
    	if (n == 0)
    		return list;
    	for (int start = 1; start <= n; start ++) {
    		List<List<Integer>> L = found(candidates, target, start);
			for (int x = 0; x < L.size(); x ++) {
				List<Integer> op = L.get(x);
				Collections.sort(op);
				if (op.size() != 0 && !list.contains(op))
					list.add(op);
			}
    	}
        return list;
    }
    public List<List<Integer>> found(int[] candidates, int target, int start) {
    	ArrayList<List<Integer>> list1 = new ArrayList<List<Integer>>();
    	if (start == 1) {
    		ArrayList<Integer> l = new ArrayList<Integer>();
    		for (int n = 0; n < candidates.length; n ++)
    			if (candidates[n] == target)
    				l.add(candidates[n]);
    		list1.add((List<Integer>)l.clone());
    		l.clear();
    	}
    	else {
    		for (int i = 0; i < candidates.length; i ++) {
    			int t = target - candidates[i];
    			if (t < candidates[i])
    				continue;
    			List<List<Integer>> L = found(candidates, t, start - 1);
    			for (int x = 0; x < L.size(); x ++) {
    				List<Integer> op = L.get(x);
    				if (op.size() != 0) {
    					op.add(candidates[i]);
    					list1.add(op);
    				}
    			}
    			L.clear();
    		}
    	}
    	return list1;
    }
}