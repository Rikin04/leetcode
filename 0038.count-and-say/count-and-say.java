class Solution {
    public String countAndSay(int n) {
    	if (n == 1)
    		return "1";
    	String s = "";   
    	int m = n - 1;
    	s = countAndSay(m);
    	String str = "";
    	int count = 1;
    	int i = 1;
    	for (; i < s.length(); i ++) {
    		if (s.charAt(i) == s.charAt(i - 1))
    			++ count;
    		else {
    			str = str + count + s.charAt(i - 1);
    			count = 1;
    		}
    	}
    	str = str + count + s.charAt(i - 1);
    	return str;
    }
}