class Solution {
    public boolean isValid(String s) {
    	try {
    	if (s.length() == 0)
    		return true;
    	if (s.length() % 2 == 1)
    		return false;
    	Stack<Integer> S = new Stack<Integer>(); 
    	char[] C = s.toCharArray();
    	S.push(-1);
    	int i = 0;
    	while (i < s.length()) {
    		int x = 0;
    		switch (C[i]) {
    		case '(' : x = 10; break;
    		case '[' : x = 20; break;
    		case '{' : x = 30; break;
    		case ')' : x = -10; break;
    		case ']' : x = -20; break;
    		case '}' : x = -30; break;
    		}
    		if (x < 0) {
    			if (S.peek() + x != 0)
    				return false;
    			S.pop();
    		}
    		else {
    			S.push(x);
    		}
            i ++;
    	}
    	if (S.peek() == -1)
    		return true;
        return false;
    }
        catch (Exception e) {    
        	return false;
        }
    }
}