class Solution {
    public boolean isPalindrome(int x) {
        String s = x + "";
        if (x < 0)
        	return false;
        else if (x < 10)
        	return true;
        else {
    		String s1 = "";
    		String s2 = "";
        	if (s.length() % 2 == 1) {
        		s1 = s.substring(0,s.length() / 2);
        		s2 = s.substring(s.length() / 2 + 1);
        	}
        	else {
        		s1 = s.substring(0,s.length() / 2);
        		s2 = s.substring(s.length() / 2);
        	}
    		int y = 0, z = s2.length() - 1;
    		while (y < s1.length() && z >= 0) {
    			if (s1.charAt(y) != s2.charAt(z))
    				return false;
    			y ++;
    			z --;
    		}
    		return true;
        }
    }
}