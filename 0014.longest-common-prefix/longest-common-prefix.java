class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
    	int min = strs[0].length(), index = 0;
    	for (int i = 0; i < strs.length; i ++)
    		if (strs[i].length() < min) {
    			min = strs[i].length();
    			index = i;
    		}
    	if (min == 0)
    		return "";
    	int x = min;
    	for (; x > 0; x --) {
    		int y = 0;
    		for (; y < strs.length; y ++) {
    			if (!strs[y].substring(0, x).equals(strs[index].substring(0, x)))
    				break;
    		}
    		if (y == strs.length)
    			break;
    	}
    	return strs[index].substring(0, x);
    }
}