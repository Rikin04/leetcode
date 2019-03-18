import java.util.*;
class Solution {
    ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	if (candidates.length == 0)
    		return list;
    	Arrays.sort(candidates);
    	int n = target / candidates[0];
    	if (n == 0)
    		return list;
    	for (int start = 1; start <= n; start ++) {
    		List<List<Integer>> L = found(candidates, target, 0, start);
			for (int x = 0; x < L.size(); x ++) {
				List<Integer> op = L.get(x);
				Collections.sort(op);
				if (op.size() != 0 && !list.contains(op))
					list.add(op);
			}
    	}
    	return list;
    }
    public List<List<Integer>> found(int[] candidates, int target, int find, int start) {
    	ArrayList<List<Integer>> list1 = new ArrayList<List<Integer>>();
    	if (start == 1) {
    		ArrayList<Integer> l = new ArrayList<Integer>();
    		for (int n = find; n < candidates.length; n ++)
    			if (candidates[n] == target && !l.contains(candidates[n]))
    				l.add(candidates[n]);
    		list1.add((List<Integer>)l.clone());
    		l.clear();
    	}
    	else {
    		for (int n = find; n < candidates.length - 1; n ++) {
    			int t = target - candidates[n];
    			if (t < candidates[n])
    				continue;
    			List<List<Integer>> L = found(candidates, t, n + 1, start - 1);
    			for (int x = 0; x < L.size(); x ++) {
    				List<Integer> op = L.get(x);
    				if (op.size() != 0) {
    					op.add(candidates[n]);
    					list1.add(op);
    				}
    			}
    			L.clear();
    		}
    	}
    	return list1;
    }
}