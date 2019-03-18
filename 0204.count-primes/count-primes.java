class Solution {
    public int countPrimes(int n) {
        boolean[] b = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i ++) {
            if (!b[i]) {
                ++ count;
                for (int j = 2; i * j < n; j ++)
                    b[i * j] = true;
            }
        }
        return count;
    }
}