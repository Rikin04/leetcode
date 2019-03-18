class Solution {
    public int myAtoi(String str) {
    	if (str.length() != 0) {
    		str = str.trim();
    		String s1 = "";
    		char[] s = str.toCharArray();
    		int i = 0;
    		while (i <= s.length) {
    			try {
    				int a = Integer.parseInt(s[i] + "");
    				s1 = s1 + a;
    				i ++;
    			}
    			catch (Exception e) {
    				if (i == 0 && (s[i] == '+' || s[i] == '-')) {
    						if (s[0] == '-')
    							s1 = "-" + s1;
    						i ++;  					
    				}
    				else {
    					try { 
    						return Integer.parseInt(s1);
    					}
    					catch (Exception ee) {
    						if (s1.equals(""))
    							return 0;
    						else {
    							if (s1.length() != 1){
    								if (s1.charAt(0) == '-')
    									return Integer.MIN_VALUE;
    								else
    									return Integer.MAX_VALUE;
    							}
    							else
    								return 0;
    						}
    					}
    				}
    			}
    		}
    	}
        return 0;
    }
}