/* //dp
class Solution {
    public int countSubstrings(String s) {
        int count = 0, length = s.length();
        boolean[][] dp = new boolean[length][length];
        for (int x = length - 1; x >= 0; x --) {
            for (int y = x; y < length; y ++) {
                dp[x][y] = ((s.charAt(x) == s.charAt(y)) && ((y - x < 3) || dp[x + 1][y - 1]));
                if (dp[x][y]) ++ count;
            }
        }
        return count;        
    }
    
}
*/
class Solution {
    int count = 0;
    public int countSubstrings(String s) {
        int length = s.length();
        for (int i = 0; i < s.length(); i ++) {
            extend(i, i, s);
            extend(i, i + 1, s);
        }
        return count;
    }
    private void extend(int j, int k, String s) {
	while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
		j--;
		k++;
        ++ count;
	}
    }
}