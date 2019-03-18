class Solution {
    public boolean judgeCircle(String moves) {
    	int U = 0, D = 0, L = 0, R = 0;
    	char[] ch = moves.toCharArray();
    	for (char ch1 : ch) {
    		switch (ch1) {
    			case 'U' : ++ U; break;
    			case 'D' : ++ D; break;
    			case 'L' : ++ L; break;
    			case 'R' : ++ R; break;
    			default : return false;
    		}
    	}
    	if (U != D || L != R)
    		return false;
        return true;
    }
}