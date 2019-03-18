class Solution {
    public List<String> generateParenthesis(int n) {
    	List<String> list = new ArrayList<String>();
    	if (n == 0)
    		list.add("");
    	else {
    		List<String> l = generateParenthesis(n - 1);
    		for (String s : l) {
    			int i = 0;
    			while (s.substring(i, s.length()).indexOf('(') != -1) {
    				if (s.charAt(i) == '(') {
    					String s1 = s.substring(0, i + 1) + "()" + s.substring(i + 1);
    					if (!list.contains(s1))
    						list.add(s1);
    				}
    				++ i;
    			}
				if (!list.contains("()" + s))
					list.add("()" + s);
    		}
    	}
        return list;
    }
}