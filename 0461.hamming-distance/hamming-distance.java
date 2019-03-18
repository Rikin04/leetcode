class Solution {
    public int hammingDistance(int x, int y) {
        String xstr = Binary(x),ystr = Binary(y);
        int count = 0;
        if (xstr.length() > ystr.length()) {
        	String t = xstr;
        	xstr = ystr;
        	ystr = t;
        }
        int i = 0;
        for (; i < xstr.length(); i ++) {
        	if (xstr.charAt(i) != ystr.charAt(i))
        			++ count;
        }
        for (;i < ystr.length(); i ++)
        	if (ystr.charAt(i) != '0')
        		++ count;
        return count;
    }
    public static String Binary(int number) {
    	String str = "";
    	if (number == 0)
    		str = "0";
    	while (number >= 1) {
    		str = str + number % 2;
    		number = number / 2;
    	}
    	return str;
    }
}