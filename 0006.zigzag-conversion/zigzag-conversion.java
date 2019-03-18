class Solution {
    public String convert(String s, int numRows) {
        if (s.length() <= numRows)
        	return s;
        if (numRows == 1)
            return s;
        String[] str = new String[numRows];
        for (int i = 0; i < str.length; i ++)
        	str[i] = "";
        int len = 2 * numRows - 2;
        int x = 0;
        while (x + len <= s.length()) {
        	String s1 = s.substring(x, x + len);
        	s = s.substring(x + len);
        	str[0] = str[0] + s1.charAt(0);
        	int y = 1;
        	while (y != s1.length() - y) {
        		str[y] = str[y] + s1.charAt(y) + s1.charAt(s1.length() - y);
        		y ++;
        	}
        	str[y] = str[y] + s1.charAt(y);
        }
        if (s.length() != 0) {
        	str[0] = str[0] + s.charAt(0);
        	if (s.length() <= numRows) {
        		for (int l = 1; l < s.length(); l ++) {
        			str[l] = str[l] + s.charAt(l);
        		}
        	}
        	else{
        		int y = len - s.length() + 1;
        		if (y != 1) {
        			int z = 1;
        			while (z < y) {
        				str[z] = str[z] + s.charAt(z);
        				z ++;
        			}
        		}
        		while (y != len - y) {
        			str[y] = str[y] + s.charAt(y) + s.charAt(len - y);
        			y ++;
        		}
        		str[y] = str[y] + s.charAt(y);
        	}
        }
        String sr = "";
        for (int z = 0; z < str.length; z ++){
        	    sr = sr + str[z];
        }
        return sr;
    }
}