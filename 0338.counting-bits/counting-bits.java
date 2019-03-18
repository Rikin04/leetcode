class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        if (num == 0) return res;
        res[1] = 1;
        if (num == 1) return res;
        for (int k = 1; Math.pow(2, k) <= num; k ++) {
            for (int x = (int)Math.pow(2, k); x < Math.pow(2, k + 1) && x <= num; x ++) {
                if (x == 2) res[2] = 1;
                else if (x == 3) res[3] = 2;
                else {
                    res[x] = res[x - (int)Math.pow(2, k - 1)];
                    if ((x - Math.pow(2, k - 1)) >= Math.pow(2, k)) ++ res[x];
                }
            }
        }
        return res;
    }
}