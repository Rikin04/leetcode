class Solution {
    public int numJewelsInStones(String J, String S) {
        if (J.length() == 0 || S.length() == 0)
            return 0;
        int num = 0;
        for (int x = 0; x < S.length(); x ++) {
            if (J.indexOf(S.charAt(x)) != -1)
                ++ num;
        }
        return num;
    }
}